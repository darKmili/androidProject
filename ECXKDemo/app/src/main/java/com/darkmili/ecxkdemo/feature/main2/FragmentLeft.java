package com.darkmili.ecxkdemo.feature.main2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.darkmili.ecxkdemo.R;

/**
 * @author Administrator
 * @title: FragmentLeft
 * @projectName ECXKDemo
 * @description: 用于显示当前猪猪的数据信息
 * @date 2020/8/19 9:37
 */
public class FragmentLeft extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       return inflater.inflate(R.layout.fragment_on_main2_left,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
