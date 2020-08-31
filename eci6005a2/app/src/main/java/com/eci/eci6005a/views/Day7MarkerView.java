
/*
 * ******************************************************************
 *  Copyright (c)  2018
 *  project_name:ECI6005A_AND_APP_V1
 *  创建时间：18-7-13 下午5:00
 *  作者：Administrator
 *  四川翊晟芯科信息技术有限公司
 *  版权所有 违法必究
 * ******************************************************************
 */

package com.eci.eci6005a.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;

import com.eci.eci6005a.R;
import com.eci.eci6005a.activity.LineChartActivity;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Day7MarkerView extends MarkerView {

    private TextView tvContent;

    public Day7MarkerView(Context context, int layoutResource) {
        super(context, layoutResource);

        tvContent = findViewById(R.id.tvContent);
    }

    // callbacks everytime the MarkerView is redrawn, can be used to update the
    // content (user-interface)
    @SuppressLint("SetTextI18n")
    @Override
    public void refreshContent(Entry e, Highlight highlight) {

        if (e instanceof CandleEntry) {

            CandleEntry ce = (CandleEntry) e;

            tvContent.setText("时间：" + Utils.formatNumber(ce.getHigh(), 0, true) );
        } else {
            long referenceTime = LineChartActivity.reFerenceTime;
            long mTime = (referenceTime - (long)e.getX())*1000;
            Date data = new Date( mTime ) ;

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH时mm分" , Locale.getDefault());
            tvContent.setText(
                     formatter.format(data) + " ： " +   Utils.formatNumber(e.getY(),
                            0, true));
        }

        super.refreshContent(e, highlight);
    }

    @Override
    public MPPointF getOffset() {
        return new MPPointF(-(getWidth() / 2), -getHeight());
    }
}
