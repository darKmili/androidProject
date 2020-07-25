package com.darkmili.coolweather;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.darkmili.coolweather.db.City;
import com.darkmili.coolweather.db.County;
import com.darkmili.coolweather.db.Province;

import java.util.ArrayList;
import java.util.List;

public class ChooseAreaFragment extends Fragment {
    private static final int LEVEL_PROVINCE = 0;
    private static final int LEVEL_CITY = 1;
    private static final int LEVEL_COUNTY = 2;
    private int localLevel;//代表自己当前属于哪一级区域，省 市 区；
    private ProgressDialog progressDialog;//进度条
    //碎片的相关控件
    private TextView textView;
    private Button button;
    private ListView listView;
    private ArrayAdapter adapter;
    //
    private ArrayList<String> list=new ArrayList<>();

    //存放省市区的数据
    private List<Province> provinceList;
    private List<City> cityList;
    private List<County> countyList;



    /**
     * 初始化碎片各项数据
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.choose_area, container, false);
        textView = view.findViewById(R.id.title_text);
        button = view.findViewById(R.id.back_button);
        listView = view.findViewById(R.id.list_view);
        adapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //为每一个属性添加点击事件,从高行政到低行政区

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (localLevel) {
                    case LEVEL_PROVINCE:
                        //查询省下面的城市数据，并且展示
                        break;
                    case LEVEL_CITY:
                        //查询下面的县区数据，并且展示
                        break;
                    case LEVEL_COUNTY:
                        //跳转到展示县区的天气数据
                        break;

                }
            }
        });
        //执行返回上一级的操作，从低行政到高行政区
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (localLevel){
                    case LEVEL_CITY:
                        //跳转到省
                        break;
                    case LEVEL_COUNTY:
                        //跳转到市
                        break;

                }
            }
        });
    }

    /**
     * 查询省的名称，默认先查看本地数据库，然后在查看网上数据。
     */
    public void queryProvinces(){

    }
}
