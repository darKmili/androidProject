package com.darkmili.bluetoothdemo.adapter;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.darkmili.bluetoothdemo.DetailItem;
import com.darkmili.bluetoothdemo.MyApplication;
import com.darkmili.bluetoothdemo.R;
import com.inuker.bluetooth.library.Constants;
import com.inuker.bluetooth.library.beacon.Beacon;
import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.inuker.bluetooth.library.connect.response.BleConnectResponse;
import com.inuker.bluetooth.library.model.BleGattCharacter;
import com.inuker.bluetooth.library.model.BleGattProfile;
import com.inuker.bluetooth.library.model.BleGattService;
import com.inuker.bluetooth.library.search.SearchResult;


import java.util.ArrayList;
import java.util.List;

import static com.inuker.bluetooth.library.Constants.REQUEST_SUCCESS;

public class BlueToothRecyclerViewAdapter extends RecyclerView.Adapter<BlueToothRecyclerViewAdapter.ViewHolder> {
    private ArrayList<SearchResult> list;
    public SearchResult searchResult;
    public BlueToothRecyclerViewAdapter(ArrayList<SearchResult > list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_list, parent, false);
        final ViewHolder viewHolder=new ViewHolder(view);
        viewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                //通过点击事件去执行连接操作
                int adapterPosition = viewHolder.getAdapterPosition();
                SearchResult  device=list.get(adapterPosition);
                searchResult=device;
                connectDevice(device.getAddress());

            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SearchResult  device = list.get(position);
        holder.textView.setText(device.getName()+"---"+device.getAddress());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        View view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view =itemView;
            textView=itemView.findViewById(R.id.textView);
        }
    }

    private void connectDevice(final String mMac) {
        BleConnectOptions options = new BleConnectOptions.Builder()
                .setConnectRetry(3)//重试3次
                .setConnectTimeout(5000)//5s后为连接超时
                .setServiceDiscoverRetry(3)//连接Service重试3次
                .setServiceDiscoverTimeout(5000)//5s后连接'服务'超时
                .build();
        //此处单例出BluetoothClient对象来进行连接操作
        MyApplication.getClient().connect(mMac, options, new BleConnectResponse() {
            @Override
            public void onResponse(int code, BleGattProfile profile) {
                //如果连接没有成功，则重试。
                if (code == REQUEST_SUCCESS) {
                    //需要保存当前BleGattProfile 信息 获取可操作的 特征
                    setGattProfile(profile);
                    Toast.makeText(MyApplication.getContext(),"连接成功",Toast.LENGTH_SHORT).show();
                }else{
                    //检测是否需要连接设备（如果已经连接，则不需要再去连接）
                    if (!(Constants.STATUS_DEVICE_CONNECTED==MyApplication.getClient().getConnectStatus(mMac))){
//                        connectDevice(mMac);
                    }
                }
            }
        });
    }


    //获取属性
    public void setGattProfile(BleGattProfile profile) {
        List<DetailItem> items = new ArrayList<DetailItem>();
        List<BleGattService> services = profile.getServices();

        for (BleGattService service : services) {
            items.add(new DetailItem(DetailItem.TYPE_SERVICE, service.getUUID(), service.getUUID()));
            List<BleGattCharacter> characters = service.getCharacters();
            for (BleGattCharacter character : characters) {
                items.add(new DetailItem(DetailItem.TYPE_CHAR, character.getUuid(), service.getUUID()));
            }
        }
        //将得到的items传递到需要发送信息的位置。DetailItem是service和character的实体。
        //上面我们就提到过，蓝牙间的消息传递获取是根据service的character来做到的。
    }


}
