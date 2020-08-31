package com.eci.eci6005a.views;

import android.view.View;

import com.eci.eci6005a.treeview.base.BaseNodeViewBinder;
import com.eci.eci6005a.treeview.base.BaseNodeViewFactory;


public class MyNodeViewFactory extends BaseNodeViewFactory {

    @Override
    public BaseNodeViewBinder getNodeViewBinder(View view, int level) {
        switch (level) {
            case 0:
                return new FirstLevelNodeViewBinder(view);
            case 1:
                return new SecondLevelNodeViewBinder(view);
            default:
                return null;
        }
    }
}
