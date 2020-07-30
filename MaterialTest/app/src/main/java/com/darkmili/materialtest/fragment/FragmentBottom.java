package com.darkmili.materialtest.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.darkmili.materialtest.R;

public class FragmentBottom extends Fragment implements View.OnClickListener {
    private Button bt_message, bt_friend, bt_setting;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom_fragment, container, false);
        bt_message = view.findViewById(R.id.bottom_message);
        bt_friend = view.findViewById(R.id.bottom_friend);
        bt_setting = view.findViewById(R.id.bottom_setting);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        bt_message.setOnClickListener(this);
        bt_friend.setOnClickListener(this);
        bt_setting.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bottom_message:
                break;
            case R.id.bottom_friend:
                break;
            case R.id.bottom_setting:
                break;
        }
    }
}
