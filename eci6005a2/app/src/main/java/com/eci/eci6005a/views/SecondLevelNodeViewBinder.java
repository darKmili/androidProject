package com.eci.eci6005a.views;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.eci.eci6005a.R;
import com.eci.eci6005a.treeview.TreeNode;
import com.eci.eci6005a.treeview.base.CheckableNodeViewBinder;


public class SecondLevelNodeViewBinder extends CheckableNodeViewBinder {

    private TextView textView;
    private ImageView imageView;

    SecondLevelNodeViewBinder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.node_name_view);
        imageView = itemView.findViewById(R.id.arrow_img);
    }

    @Override
    public int getCheckableViewId() {
        return R.id.checkBox;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_second_level;
    }

    @Override
    public void bindView(final TreeNode treeNode) {
        textView.setText(treeNode.getValue().toString());
        imageView.setRotation(treeNode.isExpanded() ? 90 : 0);
    }

    @Override
    public void onNodeToggled(TreeNode treeNode, boolean expand) {
        if (expand) {
            imageView.animate().rotation(90).setDuration(200).start();
        } else {
            imageView.animate().rotation(0).setDuration(200).start();
        }
    }
}
