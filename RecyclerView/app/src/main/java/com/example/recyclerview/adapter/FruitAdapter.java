package com.example.recyclerview.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.entity.Fruit;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
    private List<Fruit> fruitList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        View fruitView;
        public ViewHolder(@NonNull View itemView) {
//            itemView子项的最外层布局
            super(itemView);
            fruitView=itemView;
            imageView=(ImageView)itemView.findViewById(R.id.image1);
            textView=(TextView)itemView.findViewById(R.id.text1);
        }
    }

    public FruitAdapter(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        final ViewHolder viewHolder=new ViewHolder(view);
        viewHolder.fruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = viewHolder.getAdapterPosition();
                Fruit fruit = fruitList.get(position);
                Toast.makeText(view.getContext(),"your clickded"+fruit.getName(),Toast.LENGTH_LONG).show();
            }
        });

        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = viewHolder.getAdapterPosition();
                Fruit fruit = fruitList.get(position);
                Toast.makeText(view.getContext(),"your clickded"+fruit.getImageId(),Toast.LENGTH_LONG).show();
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Fruit fruit=fruitList.get(position);
            holder.textView.setText(fruit.getName());
            holder.imageView.setImageResource(fruit.getImageId());

    }



    @Override
    public int getItemCount() {
        return fruitList.size();
    }
}
