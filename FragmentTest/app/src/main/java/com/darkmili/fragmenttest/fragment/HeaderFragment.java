package com.darkmili.fragmenttest.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.darkmili.fragmenttest.R;

public class HeaderFragment extends Fragment {
    private ActionBar actionBar;
    private Toolbar toolbar;
    private AppCompatActivity activity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.header_fragment, container, false);
        toolbar = view.findViewById(R.id.toolbar);

         activity = (AppCompatActivity)getActivity();
        activity.setSupportActionBar(toolbar);
        //获取actionBar对象。
        actionBar = activity.getSupportActionBar();
        if (actionBar != null) {
            //  设置显示HOMEＡＳＵＰ
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.mipmap.ic_menu);
        }

        return view;
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


}
