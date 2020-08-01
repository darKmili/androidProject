package com.darkmili.fragmenttest.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.location.Location;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.darkmili.fragmenttest.MainActivity;
import com.darkmili.fragmenttest.R;

public class HeaderFragment extends Fragment {
    private ActionBar actionBar;
    private Toolbar toolbar;
    private MainActivity activity;
    private DrawerLayout drawerLayout;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.header_fragment, container, false);
        toolbar = view.findViewById(R.id.toolbar);


         activity = (MainActivity)getActivity();
        activity.setSupportActionBar(toolbar);
        //获取actionBar对象。
        actionBar = activity.getSupportActionBar();
        if (actionBar != null) {
            //  设置显示HOMEＡＳＵＰ
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.mipmap.ic_menu);
        }

        setHasOptionsMenu(true);//需要添加这行代码,menu才能显示
        return view;
    }


        /*
            如果要操作活动里面的数据或者界面，必须在此方法中获得。
        */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        drawerLayout=activity.findViewById(R.id.drawerLayout);

    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.header_menu,menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.home:
                activity.replaceFragment(new BodyFragmentLeft());
                break;
            default:
        }
        return true;

    }
}
