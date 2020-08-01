package com.darkmili.fragmenttest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.darkmili.fragmenttest.R;
import com.darkmili.fragmenttest.entity.Setting;

import java.util.List;

public class SettingAdapter extends ArrayAdapter<Setting> {
    private int resourceId;

    public SettingAdapter(@NonNull Context context, int resource, @NonNull List<Setting> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Setting item = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView != null) {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        } else {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = view.findViewById(R.id.right_image);
            viewHolder.textView = view.findViewById(R.id.right_tx);
            view.setTag(viewHolder);
        }
        viewHolder.imageView.setImageResource(item.getImageId());
        viewHolder.textView.setText(item.getName());
        return view;

    }

    class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
