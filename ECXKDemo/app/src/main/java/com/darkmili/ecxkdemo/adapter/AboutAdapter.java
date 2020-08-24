package com.darkmili.ecxkdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.darkmili.ecxkdemo.R;
import com.darkmili.ecxkdemo.entity.DetailInfo;

import java.util.List;

/**
 * @author Administrator
 * @title: AboutAdapter
 * @projectName ECXKDemo
 * @description: TODO
 * @date 2020/8/2411:50
 */
public class AboutAdapter extends ArrayAdapter {
    private int resourceId;
    private List<DetailInfo> list;

    public AboutAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.list = objects;
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        DetailInfo detailInfo = list.get(position);
        View view;
        ViewHolder viewHolder;
        if (convertView!=null){
            view=convertView;
            viewHolder= (ViewHolder) convertView.getTag();
        }else {
            view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.imageView=view.findViewById(R.id.img_detail);
            viewHolder.textView=view.findViewById(R.id.txt_detail);
            view.setTag(viewHolder);
        }
        viewHolder.textView.setText(detailInfo.getText());
        Glide.with(getContext()).load(detailInfo.getImageId()).into(viewHolder.imageView);
        return view;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
