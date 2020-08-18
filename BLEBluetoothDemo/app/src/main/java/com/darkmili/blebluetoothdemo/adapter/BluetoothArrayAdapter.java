package com.darkmili.blebluetoothdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.clj.fastble.data.BleDevice;
import com.darkmili.blebluetoothdemo.R;

import java.util.List;
import java.util.prefs.PreferenceChangeEvent;

public class BluetoothArrayAdapter extends ArrayAdapter<BleDevice> {
    private int resourceId;
    public BluetoothArrayAdapter(@NonNull Context context, int resource, @NonNull List<BleDevice> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        BleDevice item = getItem(position);
        View view = null;
        ViewHolder viewHolder=null;
        if (convertView==null){
            view= LayoutInflater.from(getContext()).inflate(R.layout.item_list,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.name=view.findViewById(R.id.name);
            viewHolder.mac=view.findViewById(R.id.mac);
            view.setTag(viewHolder);
        }else {
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        viewHolder.name.setText(item.getName());
        viewHolder.mac.setText(item.getMac());
        return view;
    }

    private class ViewHolder{
         TextView name;
         TextView mac;
    }
}
