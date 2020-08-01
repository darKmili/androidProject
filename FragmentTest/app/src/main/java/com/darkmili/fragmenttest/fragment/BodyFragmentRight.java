package com.darkmili.fragmenttest.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.darkmili.fragmenttest.MainActivity;
import com.darkmili.fragmenttest.R;
import com.darkmili.fragmenttest.adapter.SettingAdapter;
import com.darkmili.fragmenttest.entity.Setting;

import java.util.ArrayList;
import java.util.List;

public class BodyFragmentRight extends Fragment {
    private List<Setting> settingList = new ArrayList<>();
    private ArrayAdapter adapter;
    private ListView listView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.body_fragment_3, container, false);
        listView = view.findViewById(R.id.list_view);
        assert container != null;
        adapter = new SettingAdapter(view.getContext(),R.layout.list_item , settingList);
        listView.setAdapter(adapter);
        return view;
    }

    public void init() {
        settingList.add(new Setting(R.mipmap.ic_home, "我的家"));
        settingList.add(new Setting(R.mipmap.ic_done, "支付"));
        settingList.add(new Setting(R.mipmap.ic_backup, "备份"));
        settingList.add(new Setting(R.mipmap.ic_comment, "状态"));
    }
}

