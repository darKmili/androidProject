package com.darkmili.bluetoothdemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.darkmili.bluetoothdemo.R;
import com.darkmili.bluetoothdemo.entity.BlueTooth;

import java.util.ArrayList;

public class BlueToothRecyclerViewAdapter extends RecyclerView.Adapter<BlueToothRecyclerViewAdapter.ViewHolder> {
    private ArrayList<BlueTooth> list;

    public BlueToothRecyclerViewAdapter(ArrayList<BlueTooth> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_list, parent, false);
        final ViewHolder viewHolder=new ViewHolder(view);
        viewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //通过点击事件去执行连接操作
                int adapterPosition = viewHolder.getAdapterPosition();
                String MACAddress=list.get(adapterPosition).getMACAddress();
                //TODO 根据MAC地址去连接蓝牙
                Toast.makeText(parent.getContext(), "点击了"+list.get(adapterPosition).getName(), Toast.LENGTH_LONG).show();
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BlueTooth s = list.get(position);
        holder.textView.setText(s.toString());
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
