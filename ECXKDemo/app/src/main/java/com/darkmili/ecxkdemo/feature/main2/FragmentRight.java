package com.darkmili.ecxkdemo.feature.main2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.darkmili.ecxkdemo.R;
import com.darkmili.ecxkdemo.adapter.AboutAdapter;
import com.darkmili.ecxkdemo.entity.DetailInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @title: FragmentRight
 * @projectName ECXKDemo
 * @description: 用于个人信息，产品介绍，用户指南等的
 * @date 2020/8/199:46
 */
public class FragmentRight extends Fragment {
    private ListView listView;
    private List<DetailInfo> list;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initList();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragmrnt_on_main2_right, container, false);
        listView = inflate.findViewById(R.id.listView_right_fragment);
        AboutAdapter adapter = new AboutAdapter(getContext(), R.layout.item_detail_list, list);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        listView.setAdapter(adapter);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void initList(){
        list=new ArrayList<>();
        list.add(new DetailInfo(R.drawable.ic_fankui51,"反馈"));
        list.add(new DetailInfo(R.drawable.ic_banbenxinxi,"版本信息"));
        list.add(new DetailInfo(R.drawable.ic_icon,"关于"));

    }
}
