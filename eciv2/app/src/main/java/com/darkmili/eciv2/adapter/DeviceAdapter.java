package com.darkmili.eciv2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.clj.fastble.data.BleDevice;
import com.darkmili.eciv2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @title: DeviceAdapter
 * @projectName eciv2
 * @description: TODO
 * @date 2020/8/3110:50
 */
public class DeviceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener {

    private Context context;
    private static final int ONCLICK_EVENT = 1;
    private OnItemClickListener onItemClickListener;
    private List<BleDevice> deviceList;

    public DeviceAdapter(Context context) {
        this.context = context;
        deviceList=new ArrayList<>();
    }

    public DeviceAdapter(Context context, List<BleDevice> deviceList) {
        this.context = context;
        this.deviceList = deviceList;
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_device, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        BleDevice bleDevice = deviceList.get(position);
        MyViewHolder viewHolder=(MyViewHolder)holder;
        viewHolder.mac.setText(bleDevice.getMac());
        viewHolder.name.setText(bleDevice.getName());
        viewHolder.single.setText(bleDevice.getRssi()+" dbm");
    }

    @Override
    public int getItemCount() {
        return deviceList.size();
    }

    @Override
    public void onClick(View view) {
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(view, (int) view.getTag(ONCLICK_EVENT));
        }
    }
    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }
    //增加属性点击事件方法
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView mac,name, single;
        private View view;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            view=itemView;
            mac=itemView.findViewById(R.id.txt_device_mac);
            name=itemView.findViewById(R.id.txt_device_name);
            single =itemView.findViewById(R.id.txt_device_single);
        }

    }


}
