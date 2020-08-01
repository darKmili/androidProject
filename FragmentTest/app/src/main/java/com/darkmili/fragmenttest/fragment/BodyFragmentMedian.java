package com.darkmili.fragmenttest.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.darkmili.fragmenttest.R;
import com.darkmili.fragmenttest.adapter.PersonAdapter;
import com.darkmili.fragmenttest.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class BodyFragmentMedian extends Fragment {
    private RecyclerView recyclerViewVer;
    private PersonAdapter personAdapter;
    private List<Person> personList=new ArrayList<>();;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.body_fragment_2,container,false);
        recyclerViewVer = view.findViewById(R.id.recycler_vertical);
        personAdapter = new PersonAdapter(personList);
        StaggeredGridLayoutManager personManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerViewVer.setAdapter(personAdapter);
        recyclerViewVer.setLayoutManager(personManager);
        return view;
    }
    public void init(){
        for (int i = 0; i < 6; i++) {
            personList.add(new Person(R.mipmap.ic_a, "黄岩岛", randomText()));
            personList.add(new Person(R.mipmap.ic_b, "张家界", randomText()));
            personList.add(new Person(R.mipmap.ic_c, "黄山", randomText()));
            personList.add(new Person(R.mipmap.ic_d, "南海", randomText()));
            personList.add(new Person(R.mipmap.ic_e, "峨眉山", randomText()));
        }
    }
    public String randomText() {

        StringBuilder str =new StringBuilder();

        for (int i = 0; i < 4; i++) {
            char c = (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));

            str.insert(0, c);
        }
        return str.toString();

    }
}
