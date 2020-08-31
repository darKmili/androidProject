package com.eci.eci6005a.views;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.eci.eci6005a.R;
import com.eci.eci6005a.activity.LineChartActivity;
import com.eci.eci6005a.treeview.TreeNode;
import com.eci.eci6005a.treeview.base.CheckableNodeViewBinder;


public class FirstLevelNodeViewBinder
        extends CheckableNodeViewBinder {

    private String TAG = "AreaChart02View";

    private TextView textView;
    private ImageView imageView;
    private ImageView ivChartView;

    FirstLevelNodeViewBinder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.node_name_view);
        imageView = itemView.findViewById(R.id.arrow_img);
        ivChartView = itemView.findViewById(R.id.chart_image);
    }

    @Override
    public int getCheckableViewId() {
        return R.id.checkBox;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_first_level;
    }

    @Override
    public void bindView(final TreeNode treeNode) {
        textView.setText(treeNode.getValue().toString());
        imageView.setRotation(treeNode.isExpanded() ? 90 : 0);
        ivChartView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(v.getContext(), treeNode.getValue().toString().substring(7), Toast.LENGTH_SHORT).show();
              //  Log.d(TAG, "setOnClickListener: " + "  1 ");
                //将id传入图表处理界面
                Intent intent = new Intent();
                intent.putExtra("ID", treeNode.getValue().toString().substring(7));
                intent.setClass(v.getContext(), LineChartActivity.class);
                v.getContext().startActivity(intent);
            }
        });
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
