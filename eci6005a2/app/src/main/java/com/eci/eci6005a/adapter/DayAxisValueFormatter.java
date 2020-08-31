/*
 * ******************************************************************
 *  Copyright (c)  2018
 *  project_name:ECI6005A_AND_APP_V1
 *  创建时间：18-7-14 上午8:43
 *  作者：Administrator
 *  四川翊晟芯科信息技术有限公司
 *  版权所有 违法必究
 * ******************************************************************
 */

package com.eci.eci6005a.adapter;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DayAxisValueFormatter implements IAxisValueFormatter {

    private String TAG = "AreaChart02View";
    SimpleDateFormat formatter = new SimpleDateFormat("MM月dd日", Locale.getDefault());

    @Override
    public String getFormattedValue(float value, AxisBase axis) {

        long referenceTime = new Date().getTime()/1000/3600/24;

        long mTime = (referenceTime - (long)value)*1000*3600*24;

        Date date = new Date(mTime);

//        Log.d(TAG,
//                "generateRcengData: " + referenceTime + "    " + value + "    " + "" + "  DayAxisValueFormatter ");

        return formatter.format(date);

    }

}
