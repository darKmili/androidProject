package com.darkmili.ecxkdemo.feature.main2;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.darkmili.ecxkdemo.R;
import com.darkmili.ecxkdemo.adapter.PigdetailsAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @title: FragmentMiddle
 * @projectName ECXKDemo
 * @description: 用于过往记录的展示
 * @date 2020/8/199:47
 */
public class FragmentMiddle extends Fragment {
    private List<String> timeList;
    private PigdetailsAdapter adapter;
    private RecyclerView recyclerView;
    private Activity activity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
        initList();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_on_main2_middle, container, false);
        adapter = new PigdetailsAdapter(timeList, activity);
        LinearLayoutManager manager = new LinearLayoutManager(activity);
//        GridLayoutManager manager=new GridLayoutManager(activity,1);
        recyclerView = inflate.findViewById(R.id.recyc_record_middle_fragment);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


    public void initList() {
        timeList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            timeList.add("9999-9999-8888-777");
            timeList.add("2020-02-02");
            timeList.add("2020-03-02");
            timeList.add("2020-04-02");
            timeList.add("2020-05-02");
            timeList.add("2020-06-02");
        }
    }
}
