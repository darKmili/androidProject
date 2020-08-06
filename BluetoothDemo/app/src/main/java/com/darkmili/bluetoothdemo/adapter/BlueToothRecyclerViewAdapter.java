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

import com.darkmili.bluetoothdemo.MyApplication;
import com.darkmili.bluetoothdemo.R;
import com.inuker.bluetooth.library.beacon.Beacon;
import com.inuker.bluetooth.library.connect.response.BleConnectResponse;
import com.inuker.bluetooth.library.model.BleGattProfile;
import com.inuker.bluetooth.library.search.SearchResult;


import java.util.ArrayList;

import static com.inuker.bluetooth.library.Constants.REQUEST_SUCCESS;

public class BlueToothRecyclerViewAdapter extends RecyclerView.Adapter<BlueToothRecyclerViewAdapter.ViewHolder> {
    private ArrayList<SearchResult> list;

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
                final TextView textView=view.findViewById(R.id.textView);
                MyApplication.getClient().connect(device.getAddress(), new BleConnectResponse() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onResponse(int code, BleGattProfile profile) {
                        if (code == REQUEST_SUCCESS) {
                            Toast.makeText(MyApplication.getContext(),"连接成功",Toast.LENGTH_SHORT).show();
                        }
                    }
                });

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
}
