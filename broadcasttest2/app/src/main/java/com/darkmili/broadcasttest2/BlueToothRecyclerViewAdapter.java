package com.darkmili.broadcasttest2;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;


public class BlueToothRecyclerViewAdapter extends RecyclerView.Adapter<BlueToothRecyclerViewAdapter.ViewHolder> {
    private ArrayList<BluetoothDevice> list;
    private Context context;

    public BlueToothRecyclerViewAdapter(ArrayList<BluetoothDevice> list, Context context) {
        this.list = list;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_list, parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = viewHolder.getAdapterPosition();
                BluetoothDevice device = list.get(position);
                //进行绑定
                boolean bond = device.createBond();
                if (bond){
                    Bundle bundle=new Bundle();
                    bundle.putParcelable("device",device);
                    Intent intent = new Intent(context, ChatActivity.class);
                    intent.putExtra("device",bundle);
                    context.startActivity(intent);
                }
                Toast.makeText(parent.getContext(),device.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BluetoothDevice device = list.get(position);
        holder.textView.setText(device.getName() + "---" + device.getAddress());
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
            view = itemView;
            textView = itemView.findViewById(R.id.textView);
        }
    }


}
