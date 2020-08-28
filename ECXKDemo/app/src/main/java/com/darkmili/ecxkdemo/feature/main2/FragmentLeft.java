package com.darkmili.ecxkdemo.feature.main2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.darkmili.ecxkdemo.R;
import com.darkmili.ecxkdemo.repository.local.bean.Animal;

/**
 * @author Administrator
 * @title: FragmentLeft
 * @projectName ECXKDemo
 * @description: 用于显示当前猪猪的数据信息
 * @date 2020/8/19 9:37
 */
public class FragmentLeft extends Fragment {

    private EditText erbiaohao;
    private EditText editText1,editText2,editText3;
    private TextView weight,tianshu,jiankang;
    private AppCompatActivity activity;

    private ImageButton btnSave,btnLookMore;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_on_main2_left, container, false);
        initView(inflate);
        initData(inflate);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void initView(View view){
        btnSave=view.findViewById(R.id.btn_saving);
        btnLookMore=view.findViewById(R.id.btn_look_more);

        activity=(AppCompatActivity)getActivity();

        erbiaohao=view.findViewById(R.id.txt_erbiaohao);
        editText1=view.findViewById(R.id.edit1);
        editText2=view.findViewById(R.id.edit2);
        editText3=view.findViewById(R.id.edit3);
        weight=view.findViewById(R.id.text_weight);
//        jiankang=view.findViewById(R.id.jiankuang);
        tianshu=view.findViewById(R.id.edit_tianshu);

    }
     /**
     　　* @description: 初始化数据。
     　　* @param ${tags}
     　　* @return ${return_type}
     　　* @throws
     　　* @author dark
     　　* @date 2020/8/25 15:35
     　　*/
    public void initData(View view){
        final Main2ViewModel viewModel=new  ViewModelProvider.NewInstanceFactory().create(Main2ViewModel.class);
        //TODO 获取耳标号
        viewModel.getErbiaoId().observe(activity, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                erbiaohao.setText(s);
            }
        });

        viewModel.getAnimalLiveData().observe(activity, new Observer<Animal>() {
            @Override
            public void onChanged(Animal animal) {
            }
        });



    }



}
