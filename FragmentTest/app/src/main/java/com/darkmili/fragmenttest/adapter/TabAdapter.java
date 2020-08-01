package com.darkmili.fragmenttest.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.darkmili.fragmenttest.R;
import com.darkmili.fragmenttest.entity.TabItem;

import java.util.List;

public class TabAdapter extends RecyclerView.Adapter<TabAdapter.MyViewHolder> {
    private List<TabItem> tabItems;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.hor_bt_img);
            textView=itemView.findViewById(R.id.hor_tx);

        }
    }

    public TabAdapter(List<TabItem> tabItems) {
        this.tabItems = tabItems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizon_item, null, false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        TabItem item = tabItems.get(position);
        holder.imageView.setImageResource(item.getImageId());
        holder.textView.setText(item.getName());

    }

    @Override
    public int getItemCount() {
        return tabItems.size();
    }


}
