package com.darkmili.ecxkdemo.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.darkmili.ecxkdemo.R;
import com.darkmili.ecxkdemo.feature.dialog.DialogActivity;
import com.darkmili.ecxkdemo.feature.start.StartActivity;

import java.util.List;

/**
 * @author Administrator
 * @title: PigdetailsAdapter
 * @projectName ECXKDemo
 * @description: TODO
 * @date 2020/8/2410:08
 */
public class PigdetailsAdapter extends RecyclerView.Adapter<PigdetailsAdapter.MyViewHolder> {
    private List<String> timeList;
    private Context context;
    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        private View view;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            view=itemView;
            textView=itemView.findViewById(R.id.text_time);
        }
    }

    public PigdetailsAdapter(List<String> timeList,Context context) {
        this.timeList = timeList;
        this.context=context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyc_record_middle_fragment, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(inflate);
        myViewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView viewById = view.findViewById(R.id.text_time);
                String text = (String) viewById.getText();
                Intent intent=new Intent(context, DialogActivity.class);
                intent.putExtra("time",text);
                context.startActivity(intent);

            }
        });
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String s = timeList.get(position);
        holder.textView.setText(s);
        if (position%2==0){
            holder.view.setBackgroundColor(context.getResources().getColor(android.R.color.darker_gray));
        }

    }

    @Override
    public int getItemCount() {
        return timeList.size();
    }
}
