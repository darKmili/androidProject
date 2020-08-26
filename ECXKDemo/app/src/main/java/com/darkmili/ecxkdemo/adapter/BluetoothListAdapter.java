package com.darkmili.ecxkdemo.adapter;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.darkmili.ecxkdemo.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BluetoothListAdapter extends ArrayAdapter<BluetoothDevice> {

    private int resourceId;
    private List<BluetoothDevice> mData;
    private Context mContext;

    public BluetoothListAdapter(@NonNull Context context, int resource, @NonNull List<BluetoothDevice> objects) {
        super(context, resource, objects);
        resourceId = resource;
        mContext = context.getApplicationContext();
        mData = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        BluetoothDevice device = getItem(position);

        View view;
        ViewHolder viewHolder;
        if (convertView != null) {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();

        } else {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.name = view.findViewById(R.id.text_bluetooth_name);
            viewHolder.mac = view.findViewById(R.id.text_bluetooth_mac);
            view.setTag(viewHolder);
        }
        if (viewHolder != null) {
            viewHolder.name.setText(device.getName());
            viewHolder.mac.setText(device.getAddress());
        }
        return view;
    }

    private class ViewHolder {
        public TextView name;
        public TextView mac;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public BluetoothDevice getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public void remove(@Nullable BluetoothDevice object) {
        mData.remove(object);
        notifyDataSetChanged();
    }

    @Override
    public void add(@Nullable BluetoothDevice object) {
        if (!mData.contains(object)) {
            mData.add(object);
        }
        notifyDataSetChanged();
    }

    /**
     * 　　* @description: 刷新列表，防止搜索结果重复出现
     * 　　* @param ${tags}
     * 　　* @return ${return_type}
     * 　　* @throws
     * 　　* @author dark
     * 　　* @date 2020/8/26 16:53
     *
     */
    public void refresh(List<BluetoothDevice> data) {
        mData = data;
        notifyDataSetChanged();
    }

    @Override
    public void clear() {
        mData.clear();
        notifyDataSetChanged();
    }

    @Override
    public void addAll(@NonNull Collection<? extends BluetoothDevice> collection) {
        mData.clear();
        mData.addAll(collection);
        notifyDataSetChanged();
    }

}
