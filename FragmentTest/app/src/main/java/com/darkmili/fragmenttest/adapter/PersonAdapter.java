package com.darkmili.fragmenttest.adapter;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.darkmili.fragmenttest.MainActivity;
import com.darkmili.fragmenttest.MyApplication;
import com.darkmili.fragmenttest.R;
import com.darkmili.fragmenttest.entity.Person;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.MyViewHolder> {

    private List<Person> personList;

    public PersonAdapter(List<Person> personList) {
        this.personList = personList;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
           imageView= itemView.findViewById(R.id.ver_img);
           textView=itemView.findViewById(R.id.ver_tx);
        }
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_item, null, false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Person person = personList.get(position);
//        Glide.with(MyApplication.getInstance()).load(person.getImageId()).into(holder.imageView);
        holder.imageView.setImageResource(person.getImageId());
        holder.textView.setText(person.getName());
    }



    @Override
    public int getItemCount() {
        return personList.size();
    }
}
