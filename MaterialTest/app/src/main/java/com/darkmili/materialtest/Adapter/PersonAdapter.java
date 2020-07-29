package com.darkmili.materialtest.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.darkmili.materialtest.FruitActivity;
import com.darkmili.materialtest.MainActivity;
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
    public MyViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item,parent,false);
        final MyViewHolder viewHolder=new MyViewHolder(view);
        //为图片增加监听器
        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position=viewHolder.getAdapterPosition();
                Context myContext=parent.getContext();
                Intent intent = new Intent(myContext, FruitActivity.class);
                Bundle bundle = new Bundle();
                Person person = list.get(position);
                bundle.putString(FruitActivity.FRUIT_NAME,person.getName());
                bundle.putInt(FruitActivity.FRUIT_IMAGE_ID,person.getIma_id());
                intent.putExtra("person_bundle",bundle);
                myContext.startActivity(intent);
            }
        });
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
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            view=itemView;
            imageView=itemView.findViewById(R.id.item_image);
            textView=itemView.findViewById(R.id.item_text);
            cardView=itemView.findViewById(R.id.card_view);
        }
    }
}
