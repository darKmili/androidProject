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
 * @title: FragmentMiddle
 * @projectName ECXKDemo
 * @description: 用于过往记录的展示
 * @date 2020/8/199:47
 */
public class FragmentMiddle extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_on_main2_middle,container,false);
    }
}
