package com.darkmili.ecxkdemo.adapter;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.darkmili.ecxkdemo.R;

import java.util.List;

public class BluetoothListAdapter extends ArrayAdapter<BluetoothDevice> {

    private int resourceId;

    public BluetoothListAdapter(@NonNull Context context, int resource, @NonNull List<BluetoothDevice> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        BluetoothDevice device = getItem(position);

        View view;
        ViewHolder viewHolder;
        if (convertView!=null){
            view=convertView;
            viewHolder=(ViewHolder) view.getTag();

        }else {
            view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.name =view.findViewById(R.id.text_bluetooth_name);
            viewHolder.mac=view.findViewById(R.id.text_bluetooth_mac);
            view.setTag(viewHolder);
        }
        if (viewHolder!=null) {
            viewHolder.name.setText(device.getName());
            viewHolder.mac.setText(device.getAddress());
        }
        return view;
    }
    private class ViewHolder{
       public TextView name;
       public TextView mac;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }
}
