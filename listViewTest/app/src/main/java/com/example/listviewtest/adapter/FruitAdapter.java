package com.example.listviewtest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ResourceCursorAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listviewtest.R;
import com.example.listviewtest.entity.Fruit;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private Integer resourceId;

    public FruitAdapter(@NonNull Context context, int textViewResourceId, @NonNull List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        this.resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit aFruit = getItem(position);//获取当前项的fruit实例

        //convertView用作将之前的View缓存,增加view的重用
        View view;
        ViewHolder viewHolder;
        if (convertView != null) {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        } else {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) view.findViewById(R.id.fruit_image);
            viewHolder.textView = (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);
        }

        viewHolder.imageView.setImageResource(aFruit.getImageId());//
        viewHolder.textView.setText(aFruit.getName());//
        return view;

    }

    /**
     * 减少view.findViewById的操作
     */
    class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
