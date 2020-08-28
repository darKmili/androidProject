package com.darkmili.ecxkdemo.BTBluetooth.connect;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.os.Handler;


import com.darkmili.ecxkdemo.utils.LogUtil;

import java.io.IOException;
import java.util.UUID;

/**
 * Created by Dark
 */
public class AcceptThread extends Thread {
    public static final String TAG="AcceptThread";
    private static final String NAME = "BlueToothClass";
    private static final UUID MY_UUID = UUID.fromString(Constant.CONNECTION_UUID);

    private final BluetoothServerSocket mmServerSocket;//服务端
    private final BluetoothAdapter mBluetoothAdapter;
    private final Handler mHandler;
    private ConnectedThread mConnectedThread;

    public AcceptThread(BluetoothAdapter adapter, Handler handler) {
        // Use a temporary object that is later assigned to mmServerSocket,
        // because mmServerSocket is final
        mBluetoothAdapter = adapter;
        mHandler = handler;
        BluetoothServerSocket tmp = null;
        try {
            // MY_UUID is the app's UUID string, also used by the client code
            tmp = mBluetoothAdapter.listenUsingRfcommWithServiceRecord(NAME, MY_UUID);
        } catch (IOException e) { }
        mmServerSocket = tmp;
    }

    public void run() {
        BluetoothSocket socket = null;
        // Keep listening until exception occurs or a socket is returned
        while (true) {
            try {
                mHandler.sendEmptyMessage(Constant.MSG_START_LISTENING);
                socket = mmServerSocket.accept();
                LogUtil.i(TAG,"客户端连接成功");
            } catch (IOException e) {
                mHandler.sendMessage(mHandler.obtainMessage(Constant.MSG_ERROR, e));
                LogUtil.e(TAG,"客户端连接失败");
                break;
            }
            // If a connection was accepted
            if (socket != null) {
                // Do work to manage the connection (in a separate thread)
                manageConnectedSocket(socket);
                try {
                    mmServerSocket.close();
                    mHandler.sendEmptyMessage(Constant.MSG_FINISH_LISTENING);
                    LogUtil.i(TAG,"关闭服务端，拒绝其他客户端连接");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    private void manageConnectedSocket(BluetoothSocket socket) {
        //只支持同时处理一个连接
        if( mConnectedThread != null) {
            mConnectedThread.cancel();
        }
        mHandler.sendEmptyMessage(Constant.MSG_GOT_A_CLINET);
        mConnectedThread = new ConnectedThread(socket, mHandler);
        mConnectedThread.start();
    }

    /** Will cancel the listening socket, and cause the thread to finish */
    public void cancel() {
        try {
            mmServerSocket.close();
            mHandler.sendEmptyMessage(Constant.MSG_FINISH_LISTENING);
        } catch (IOException e) { }
    }

    public void sendData(byte[] data) {
        if( mConnectedThread!=null){
            mConnectedThread.write(data);
        }
    }
}
