package com.darkmili.broadcasttest2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ChatActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView editText;
    private TextView textView;
    private Button button;
    private BluetoothDevice remoteDevice;
    private MyBluetoothService service;
    @SuppressLint("HandlerLeak")
    private final Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message message) {
            switch (message.what) {
                case Constants.MESSAGE_READ:
                    byte[] readBuff = (byte[]) message.obj;
                    // construct a string from the buffer
                    String readMessage = new String(readBuff);
                    textView.setText(readMessage);
                    break;
                case Constants.MESSAGE_WRITE:
                    byte[] writeBuf = (byte[]) message.obj;
                    // construct a string from the buffer
                    String writeMessage = new String(writeBuf);
                    break;
                case Constants.MESSAGE_TOAST:
            }
        }
    };
    private StringBuffer mOutStringBuffer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        init();
        toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        String device = intent.getStringExtra("device");
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(device);
        //连接
        service.connect(remoteDevice);
        setTitle(remoteDevice.getName());
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
            String message=editText.getText().toString();
            sendMessage(message);

            }
        });
    }

    public void init() {
        editText = (TextView)findViewById(R.id.text_send);
        textView = findViewById(R.id.text_receive);
        button = findViewById(R.id.bt_send);
        service=new MyBluetoothService(this,handler);
        mOutStringBuffer=new StringBuffer();
    }

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }
    /**
     * Sends a message.
     *
     * @param message A string of text to send.
     */
    private void sendMessage(String message) {
        // Check that there's actually something to send
        if (message.length() > 0) {
            // Get the message bytes and tell the BluetoothChatService to write
            byte[] send = message.getBytes();
            service.write(send);

            // Reset out string buffer to zero and clear the edit text field
            mOutStringBuffer.setLength(0);
            editText.setText(mOutStringBuffer);
        }
    }
}