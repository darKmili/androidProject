package com.darkmili.materialtest.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.darkmili.materialtest.R;
import com.darkmili.materialtest.entity.MyApplication;
import com.darkmili.materialtest.entity.Person;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.MyViewHolder> {
    private List<Person> list;

    public PersonAdapter(List<Person> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item,parent,false);
        MyViewHolder viewHolder=new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Person person = list.get(position);
        holder.textView.setText(person.getName());
//        holder.imageView.setImageResource(person.getIma_id());
        //通过Glide加载图片，因为文件过大会导致图片溢出
        Glide.with(MyApplication.getContext()).load(person.getIma_id()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        View view;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            view=itemView;
            imageView=itemView.findViewById(R.id.item_image);
            textView=itemView.findViewById(R.id.item_text);
        }
    }
}
