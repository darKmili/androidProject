package com.darkmili.ecxkdemo.feature.main2;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.Toast;

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
    private AutoCompleteTextView autoCompleteTextView;
    private List<String> tips;
    private ImageButton btn_search;

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

        autoCompleteTextView = inflate.findViewById(R.id.autoComplete_search);
        ArrayAdapter arrayAdapter = new ArrayAdapter(activity, R.layout.search_text, tips);
        autoCompleteTextView.setAdapter(arrayAdapter);

        btn_search=inflate.findViewById(R.id.btn_search_main2);
        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity,"搜索数据",Toast.LENGTH_LONG).show();
            }
        });
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    //TODO 数据获取
    public void initList() {
        timeList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            timeList.add("9999-9999-8888-777");
            timeList.add("8888-9999-8888-777");
            timeList.add("2222-9999-8888-777");
            timeList.add("2112-9999-8888-777");
            timeList.add("4343-9999-8888-777");
            timeList.add("3543-9999-8888-777");
        }

        tips = new ArrayList<String>();
        tips.add("4132");
        tips.add("4212");
        tips.add("4212");
        tips.add("4212");
        tips.add("4212");
        tips.add("4212");
        tips.add("4282");
        tips.add("41323");
        tips.add("424569");
    }
}
