package com.darkmili.fragmenttest.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.darkmili.fragmenttest.R;
import com.darkmili.fragmenttest.adapter.TabAdapter;
import com.darkmili.fragmenttest.entity.TabItem;

import java.util.ArrayList;
import java.util.List;

public class BodyFragmentLeft extends Fragment {
    private RecyclerView recyclerViewHor;
    private TabAdapter tabAdapter;
    private List<TabItem> tabItemList = new ArrayList<>();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.body_fragment_1, container, false);
        recyclerViewHor = view.findViewById(R.id.recycler_horizon);
        tabAdapter = new TabAdapter(tabItemList);
        LinearLayoutManager tabManager = new LinearLayoutManager(container.getContext());
        tabManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerViewHor.setAdapter(tabAdapter);
        recyclerViewHor.setLayoutManager(tabManager);
//        textView1 = view.findViewById(R.id.latitude);
//        textView2 = view.findViewById(R.id.longitude);
//        textView1.setText("sdad");
//        textView2.setText("sdasdadd");
        return view;

    }


    public void initData() {

        for (int i = 0; i < 3; i++) {
            tabItemList.add(new TabItem(R.mipmap.ic_comment, "消息"));
            tabItemList.add(new TabItem(R.mipmap.ic_delete, "删除"));
            tabItemList.add(new TabItem(R.mipmap.ic_done, "提交"));
            tabItemList.add(new TabItem(R.mipmap.ic_home, "家"));
        }
    }


}
