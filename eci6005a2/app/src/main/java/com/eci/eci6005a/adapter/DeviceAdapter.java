/*
 * ******************************************************************
 *  Copyright (c)  2018
 *  project_name:ECI6005A_AND_APP_V1
 *  创建时间：18-3-19 下午5:55
 *  作者：Administrator
 *  四川翊晟芯科信息技术有限公司
 *  版权所有 违法必究
 * ******************************************************************
 */

package com.eci.eci6005a.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.clj.fastble.BleManager;
import com.clj.fastble.data.BleDevice;
import com.eci.eci6005a.R;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;


public class DeviceAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener {

    private Context context;
    private List<BleDevice> bleDeviceList;
    private OnItemClickListener onItemClickListener;
    private int lastPosition=-1;
    private boolean isDelayStartAnimation = true;

    public DeviceAdapter(Context context) {
        this.context = context;
        bleDeviceList = new ArrayList<>();
    }
    public DeviceAdapter(List<BleDevice> list, Context context) {
        this.bleDeviceList = list;
        this.context = context;
    }

    public void addDevice(BleDevice bleDevice) {
        removeDevice(bleDevice);
        bleDeviceList.add(bleDevice);
    }

    public void removeDevice(BleDevice bleDevice) {
        for (int i = 0; i < bleDeviceList.size(); i++) {
            BleDevice device = bleDeviceList.get(i);
            if (bleDevice.getKey().equals(device.getKey())) {
                bleDeviceList.remove(i);
            }
        }
    }

    public void clearConnectedDevice() {
        for (int i = 0; i < bleDeviceList.size(); i++) {
            BleDevice device = bleDeviceList.get(i);
            if (BleManager.getInstance().isConnected(device)) {
                bleDeviceList.remove(i);
            }
        }
    }

    public void clearScanDevice() {
        for (int i = 0; i < bleDeviceList.size(); i++) {
            BleDevice device = bleDeviceList.get(i);
            if (!BleManager.getInstance().isConnected(device)) {
                bleDeviceList.remove(i);
            }
        }
    }

    public void clear() {
        lastPosition = -1;
        isDelayStartAnimation = true;
        bleDeviceList.clear();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_device, parent, false);
        CellViewHolder cellViewHolder = new CellViewHolder(view);
        cellViewHolder.itemView.setOnClickListener(this);
        return cellViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CellViewHolder cellViewHolder = (CellViewHolder) holder;
        cellViewHolder.itemView.setTag(position);
        BleDevice mDev = bleDeviceList.get(position);
        cellViewHolder.tvDevName.setText(mDev.getDevice().getName());
        cellViewHolder.tvDevSignal.setText(String.valueOf(mDev.getRssi())+"dBm");
        cellViewHolder.tvDevMac.setText(mDev.getDevice().getAddress());
        if (position> lastPosition){
            lastPosition = position;
            animatroItem(cellViewHolder,position);
        }
    }

    @Override
    public void onClick(View v) {
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(v, (Integer) v.getTag());
        }
    }

    private void animatroItem(CellViewHolder holder, int position){
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.slide_in_bottom);
        animation.setStartOffset(isDelayStartAnimation?position*150:0);
        holder.itemView.startAnimation(animation);
    }

    public interface OnItemClickListener {
        public void onItemClick(View itemView, int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
    @Override
    public int getItemCount() {
        return bleDeviceList.size();
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class CellViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.tv_dev_name)
        TextView tvDevName;
        @BindView(R.id.tv_dev_signal)
        TextView tvDevSignal;
        @BindView(R.id.tv_dev_mac)
        TextView tvDevMac;

        CellViewHolder(final View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public void setDelayStartAnimation(boolean delayStartAnimation) {
        isDelayStartAnimation = delayStartAnimation;
    }


}
