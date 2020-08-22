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
 * @title: FragmentRight
 * @projectName ECXKDemo
 * @description: 用于个人信息，产品介绍，用户指南等的
 * @date 2020/8/199:46
 */
public class FragmentRight extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       return inflater.inflate(R.layout.fragmrnt_on_main2_right,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
