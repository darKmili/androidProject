package com.eci.eci6005a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Raul_lsj on 2018/3/9.
 */

public abstract class BaseFragment extends Fragment {

    protected View view;
    protected LayoutInflater inflater;
    private Unbinder unBinder;

    protected Activity mActivity;
    protected Context mContext;
    protected Context appContext;
    protected Application mApplication;

    @Override
    public void onAttach(Context context) {
        mActivity = (Activity) context;
        mContext = context;
        appContext = mActivity.getApplicationContext();
        mApplication = mActivity.getApplication();
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //指出fragment愿意添加item到选项菜单
        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        inflater = onGetLayoutInflater(savedInstanceState);
        unBinder = ButterKnife.bind(this, view);
    }

    @Override
    public void onDestroyView() {
        unBinder.unbind();
        super.onDestroyView();
    }

}
