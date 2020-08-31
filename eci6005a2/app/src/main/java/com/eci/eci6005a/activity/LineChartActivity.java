/*
 * ******************************************************************
 *  Copyright (c)  2018
 *  project_name:ECI6005A_AND_APP_V1
 *  创建时间：18-7-5 下午3:22
 *  作者：Administrator
 *  四川翊晟芯科信息技术有限公司
 *  版权所有 违法必究
 * ******************************************************************
 */

package com.eci.eci6005a.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.eci.eci6005a.R;
import com.eci.eci6005a.adapter.DayAxisValueFormatter;
import com.eci.eci6005a.adapter.HourAxisValueFormatter;
import com.eci.eci6005a.adapter.MinAxisValueFormatter;
import com.eci.eci6005a.adapter.MyAxisValueFormatter;
import com.eci.eci6005a.adapter.MyFillFormatter;
import com.eci.eci6005a.adapter.MyLineLegendRenderer;
import com.eci.eci6005a.sqlite.User;
import com.eci.eci6005a.views.Day30MarkerView;
import com.eci.eci6005a.views.Day7MarkerView;
import com.eci.eci6005a.views.Year1MarkerView;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import net.tsz.afinal.FinalDb;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LineChartActivity extends FragmentActivity {

    private String TAG = "AreaChart02View";

    private String IntentData;

    private LineChart mChartDay7, mChartDay30, mChartYear1;
    private List<Integer> mDataceng1, mDataceng2, mDataceng3;
    private List<Date> mTime;
    List<User> databaseListsameID;
    public static long reFerenceTime = 0;//time of first X you have;

    LineDataSet d1, d2, d3;

    @BindView(R.id.tubiao_erbiaonum)
    TextView tubiao_erbiaonum;

    @OnClick(R.id.chart_download)
    public void downloadPic() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd日HH时mm分", Locale.getDefault());
        if(!mChartDay7.isEmpty()){
            if (!mChartDay7.saveToGallery(IntentData + "-7天趋势图"+formatter.format(new Date()), 99)) {
                Toast.makeText(getApplicationContext(), "7天趋势图保存失败!", Toast.LENGTH_SHORT)
                        .show();
            }
        }

        if(!mChartDay30.isEmpty()) {
            if (!mChartDay30.saveToGallery(IntentData + "-30天趋势图"+formatter.format(new Date()), 99)) {
                Toast.makeText(getApplicationContext(), "30天趋势图保存失败!", Toast.LENGTH_SHORT)
                        .show();
            }
        }

        if(!mChartYear1.isEmpty()) {
            if (mChartYear1.saveToGallery(IntentData + "-365天趋势图"+formatter.format(new Date()), 99)) {
                Toast.makeText(getApplicationContext(), "保存成功!",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "365天趋势图保存失败!", Toast.LENGTH_SHORT)
                        .show();
            }
        }
    }

    @OnClick(R.id.chart_share)
    public void Sharechart() {
        Toast.makeText(LineChartActivity.this, "chart_share！", Toast.LENGTH_SHORT).show();

    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置手机屏幕常亮
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_linechart);
        ButterKnife.bind(this);
        reFerenceTime = new Date().getTime() / 1000;
        Log.d(TAG,
                "ReFerenceTimeAc: " + reFerenceTime + "    " +
                        "" + "    " + "   " + "");
        //初始化数据库
        FinalDb.DaoConfig daoConfig = new FinalDb.DaoConfig();
        daoConfig.setContext(this);
        daoConfig.setDbName("beibiaoshujuku.db");
        daoConfig.setDbVersion(2);
        FinalDb db = FinalDb.create(daoConfig);
        //取得启动该Activity的Intent对象
        Intent intent = getIntent();

        /*取出Intent中附加的数据*/
        IntentData = intent.getStringExtra("ID");
        tubiao_erbiaonum.setText("耳标编号： " + IntentData);
        //准备数据给图表，并放在List<String> mDataID;
        databaseListsameID = db.findAllByWhere(User.class, "Ceshi_ID like" + '"' + IntentData + '"');

        ////////////////////todo 7天趋势图//////////////////////////
        mChartDay7 = findViewById(R.id.chart1);
        mChartDay7.setDrawGridBackground(true);
        //设置表头
        Legend l = mChartDay7.getLegend();
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setTextSize(6f);
        // 曲线描述 -标题
        mChartDay7.getDescription().setEnabled(false);
        //
        mChartDay7.setTouchEnabled(true);
        mChartDay7.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {
                mChartDay7.centerViewToAnimated(e.getX(), e.getY(), mChartDay7.getData().getDataSetByIndex(h.getDataSetIndex())
                        .getAxisDependency(), 500);
            }

            @Override
            public void onNothingSelected() {
            }
        });
        mChartDay7.setDragDecelerationFrictionCoef(0.5f);
        // enable scaling and dragging
        mChartDay7.setDragEnabled(true);
        mChartDay7.setScaleEnabled(true);
        mChartDay7.setScaleYEnabled(false);
        //双击放大
        mChartDay7.setHighlightPerDragEnabled(true);
        mChartDay7.setPinchZoom(true);
        Day7MarkerView mv = new Day7MarkerView(this, R.layout.custom_marker_view);
        mv.setChartView(mChartDay7); // For bounds control
        mChartDay7.setMarker(mv); // Set the marker to the chart
        //X轴最大值
//        mChartDay7.setVisibleXRangeMaximum(60 * 60 * 24 * 28);
      //  mChartDay7.setVisibleXRangeMaximum(60 );
        //生成图表数据
        ArrayList<ILineDataSet> dataSets = CengData();
        LineData data = new LineData(dataSets);
        /*渲染区间背景*/
        d1.setFillFormatter(new MyFillFormatter(d2));
        mChartDay7.setRenderer(new MyLineLegendRenderer(mChartDay7, mChartDay7.getAnimator(), mChartDay7.getViewPortHandler()));
        mChartDay7.setData(data);
        //刷新图表
        mChartDay7.invalidate();

        ////////////////////todo 30天趋势图//////////////////////////
        mChartDay30 = findViewById(R.id.chart2);
        mChartDay30.setDrawGridBackground(true);
        //设置表头
        l = mChartDay30.getLegend();
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setTextSize(6f);
        // 曲线描述 -标题
        mChartDay30.getDescription().setEnabled(false);
        //
        mChartDay30.setTouchEnabled(true);
        mChartDay30.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {
                mChartDay30.centerViewToAnimated(e.getX(), e.getY(), mChartDay30.getData().getDataSetByIndex(h.getDataSetIndex())
                        .getAxisDependency(), 500);
            }

            @Override
            public void onNothingSelected() {

            }
        });
        mChartDay30.setDragDecelerationFrictionCoef(0.5f);
        // enable scaling and dragging
        mChartDay30.setDragEnabled(true);
        mChartDay30.setScaleEnabled(true);
        mChartDay30.setScaleYEnabled(false);
        //双击放大
        mChartDay30.setHighlightPerDragEnabled(true);
        mChartDay30.setPinchZoom(true);
        Day30MarkerView mv1 = new Day30MarkerView(this, R.layout.custom_marker_view);
        mv1.setChartView(mChartDay30); // For bounds control
        mChartDay30.setMarker(mv1); // Set the marker to the chart
        mChartDay30.setVisibleXRangeMaximum(24 * 30 * 120);
        //生成图表数据
        dataSets = Day30CengData();
        data = new LineData(dataSets);
        /*渲染区间背景*/
        d1.setFillFormatter(new MyFillFormatter(d2));
        mChartDay30.setRenderer(new MyLineLegendRenderer(mChartDay30, mChartDay30.getAnimator(), mChartDay30.getViewPortHandler()));
        mChartDay30.setData(data);
        //刷新图表
        mChartDay30.invalidate();


        ////////////////////todo 一年趋势图//////////////////////////
        mChartYear1 = findViewById(R.id.chart3);
        mChartYear1.setDrawGridBackground(true);
        //设置表头
        l = mChartYear1.getLegend();
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setTextSize(6f);
        // 曲线描述 -标题
        mChartYear1.getDescription().setEnabled(false);
        //
        mChartYear1.setTouchEnabled(true);
        mChartYear1.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {
                mChartYear1.centerViewToAnimated(e.getX(), e.getY(), mChartYear1.getData().getDataSetByIndex(h.getDataSetIndex())
                        .getAxisDependency(), 500);
            }

            @Override
            public void onNothingSelected() {

            }
        });
        mChartYear1.setDragDecelerationFrictionCoef(0.5f);
        // enable scaling and dragging
        mChartYear1.setDragEnabled(true);
        mChartYear1.setScaleEnabled(true);
        mChartYear1.setScaleYEnabled(false);
        //双击放大
        mChartYear1.setHighlightPerDragEnabled(true);
        mChartYear1.setPinchZoom(true);
        Year1MarkerView mv2 = new Year1MarkerView(this, R.layout.custom_marker_view);
        mv2.setChartView(mChartYear1); // For bounds control
        mChartYear1.setMarker(mv2); // Set the marker to the chart
        //X轴最大值
       // mChartYear1.setVisibleXRangeMaximum(365 * 30);
        //生成图表数据
        dataSets = Year1CengData();
        data = new LineData(dataSets);
        /*渲染区间背景*/
        d1.setFillFormatter(new MyFillFormatter(d2));
        mChartYear1.setRenderer(new MyLineLegendRenderer(mChartYear1, mChartYear1.getAnimator(), mChartYear1.getViewPortHandler()));
        mChartYear1.setData(data);
        //刷新图表
        mChartYear1.invalidate();

    }

    @NonNull
    private ArrayList<ILineDataSet> CengData() {
        //
        mDataceng1 = CengData(databaseListsameID, 1);
        mDataceng2 = CengData(databaseListsameID, 2);
        mDataceng3 = CengData(databaseListsameID, 3);
        mTime = generateTimeData(databaseListsameID);
        IAxisValueFormatter xAxisFormatter = new MinAxisValueFormatter();
        XAxis xAxis = mChartDay7.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.TOP);
        xAxis.setCenterAxisLabels(true);
        xAxis.setDrawGridLines(false);
        xAxis.setTextSize(8f);
        //设置X轴坐标之间的最小间隔
        xAxis.setGranularity(1f);
        xAxis.setLabelRotationAngle(345);
        xAxis.setValueFormatter(xAxisFormatter);
        //
        IAxisValueFormatter custom = new MyAxisValueFormatter();
        YAxis leftAxis = mChartDay7.getAxisLeft();
        leftAxis.setInverted(true);
        leftAxis.setLabelCount(8, false);
        leftAxis.setValueFormatter(custom);
        leftAxis.setTextSize(8f);
        leftAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        leftAxis.setAxisMinimum(0f);
        YAxis rightAxis = mChartDay7.getAxisRight();
        rightAxis.setDrawGridLines(false);
        rightAxis.setInverted(true);
        rightAxis.setTextSize(8f);
        rightAxis.setLabelCount(8, false);
        rightAxis.setValueFormatter(custom);
        rightAxis.setAxisMinimum(0f);

        ArrayList<ILineDataSet> dataSets = new ArrayList<>();

        ArrayList<Entry> values_ceng1 = new ArrayList<>();
        ArrayList<Entry> values_ceng2 = new ArrayList<>();
        ArrayList<Entry> values_ceng3 = new ArrayList<>();

        ////////////////////todo 准备数据//////////////////////////
        //  for (int i = 0; i < mTime.size(); i++) {
        int flag = 0;
        float rCurrectTime = reFerenceTime;
        xAxis.setAxisMaximum((rCurrectTime - mTime.get(mTime.size() - 1).getTime() / 1000) + 1000);
        xAxis.setAxisMinimum((rCurrectTime - mTime.get(0).getTime() / 1000) - 1000);
        for (Date time : mTime
                ) {
            float tmp = time.getTime() / 1000;
            float x = rCurrectTime - tmp;
            // Log.d(TAG, "Day30CengData: " + x);
            int val1 = mDataceng1.get(flag);
            int val2 = mDataceng2.get(flag);
            int val3 = mDataceng3.get(flag);

            values_ceng1.add(new Entry(x, val1));
            values_ceng2.add(new Entry(x, val2));
            values_ceng3.add(new Entry(x, val3));
            flag++;
        }

        //  }
        d1 = new LineDataSet(values_ceng1, "L.1");
        d1.setColor(0xFFfff100);
        d1.setCircleColor(0xFFfff100);
        d1.setLineWidth(1.5f);
        d1.setFillAlpha(65);
        d1.setFillColor(0xFFec6941);
        d1.setDrawFilled(true);
        d1.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        d2 = new LineDataSet(values_ceng2, "L.2");
        d2.setLineWidth(1.5f);
        d2.setColor(0xFFf19ec2);
        d2.setCircleColor(0xFFf19ec2);
        d2.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        d3 = new LineDataSet(values_ceng3, "L.3");
        d3.setLineWidth(1.5f);
        d3.setColor(0xFFff0000);
        d3.setCircleColor(0xFFff0000);
        d3.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);

        dataSets.add(d1);
        dataSets.add(d2);
        dataSets.add(d3);
        return dataSets;
    }

    @NonNull
    private ArrayList<ILineDataSet> Day30CengData() {
        //
        List<User> databaseListsameID30 = UniqueHour(databaseListsameID);
        mDataceng1 = CengData(databaseListsameID30, 1);
        mDataceng2 = CengData(databaseListsameID30, 2);
        mDataceng3 = CengData(databaseListsameID30, 3);
        mTime = generateTimeData(databaseListsameID30);
        IAxisValueFormatter xAxisFormatter = new HourAxisValueFormatter();
        XAxis xAxis = mChartDay30.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.TOP);
        xAxis.setCenterAxisLabels(true);
        xAxis.setDrawGridLines(false);
        xAxis.setTextSize(8f);
        //设置X轴坐标之间的最小间隔
        xAxis.setGranularity(1f);
        xAxis.setLabelRotationAngle(345);
        xAxis.setValueFormatter(xAxisFormatter);
        //
        IAxisValueFormatter custom = new MyAxisValueFormatter();
        YAxis leftAxis = mChartDay30.getAxisLeft();
        leftAxis.setInverted(true);
        leftAxis.setLabelCount(8, false);
        leftAxis.setValueFormatter(custom);
        leftAxis.setTextSize(8f);
        leftAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        leftAxis.setAxisMinimum(0f);
        YAxis rightAxis = mChartDay30.getAxisRight();
        rightAxis.setDrawGridLines(false);
        rightAxis.setInverted(true);
        rightAxis.setTextSize(8f);
        rightAxis.setLabelCount(8, false);
        rightAxis.setValueFormatter(custom);
        rightAxis.setAxisMinimum(0f);

        ArrayList<ILineDataSet> dataSets = new ArrayList<>();

        ArrayList<Entry> values_ceng1 = new ArrayList<>();
        ArrayList<Entry> values_ceng2 = new ArrayList<>();
        ArrayList<Entry> values_ceng3 = new ArrayList<>();

        ////////////////////todo 准备数据//////////////////////////
        //  for (int i = 0; i < mTime.size(); i++) {
        int flag = 0;
        float rCurrectTime = reFerenceTime / 60 / 60;
        if(mTime.size() - 1 >= 0){
            xAxis.setAxisMaximum((rCurrectTime - mTime.get(mTime.size() - 1).getTime() / 1000 / 60 / 60) + 10);
        }
        if((mTime.size()) > 0){
            xAxis.setAxisMinimum((rCurrectTime - mTime.get(0).getTime() / 1000 / 60 / 60) - 10);
        }
        for (Date time : mTime
                ) {
            float tmp = time.getTime() / 1000 / 60 / 60;
            float x = rCurrectTime - tmp;
            //  Log.d(TAG, "Day30CengData: " + x);
            int val1 = mDataceng1.get(flag);
            int val2 = mDataceng2.get(flag);
            int val3 = mDataceng3.get(flag);

            values_ceng1.add(new Entry(x, val1));
            values_ceng2.add(new Entry(x, val2));
            values_ceng3.add(new Entry(x, val3));
            flag++;
        }
        //  }
        d1 = new LineDataSet(values_ceng1, "L.1");
        d1.setColor(0xFFfff100);
        d1.setCircleColor(0xFFfff100);
        d1.setLineWidth(1.5f);
        d1.setFillAlpha(65);
        d1.setFillColor(0xFFec6941);
        d1.setDrawFilled(true);
        d1.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        d2 = new LineDataSet(values_ceng2, "L.2");
        d2.setLineWidth(1.5f);
        d2.setColor(0xFFf19ec2);
        d2.setCircleColor(0xFFf19ec2);
        d2.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        d3 = new LineDataSet(values_ceng3, "L.3");
        d3.setLineWidth(1.5f);
        d3.setColor(0xFFff0000);
        d3.setCircleColor(0xFFff0000);
        d3.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);

        dataSets.add(d1);
        dataSets.add(d2);
        dataSets.add(d3);
        return dataSets;
    }

    @NonNull
    private ArrayList<ILineDataSet> Year1CengData() {
        //
        List<User> databaseListsameID365 = UniqueDay(databaseListsameID);
        mDataceng1 = CengData(databaseListsameID365, 1);
        mDataceng2 = CengData(databaseListsameID365, 2);
        mDataceng3 = CengData(databaseListsameID365, 3);
        mTime = generateTimeData(databaseListsameID365);
        IAxisValueFormatter xAxisFormatter = new DayAxisValueFormatter();
        XAxis xAxis = mChartYear1.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.TOP);
        xAxis.setCenterAxisLabels(true);
        xAxis.setDrawGridLines(false);
        xAxis.setTextSize(8f);
        //设置X轴坐标之间的最小间隔
        xAxis.setGranularity(1f);
        xAxis.setLabelRotationAngle(345);
        xAxis.setValueFormatter(xAxisFormatter);
        //
        IAxisValueFormatter custom = new MyAxisValueFormatter();
        YAxis leftAxis = mChartYear1.getAxisLeft();
        leftAxis.setInverted(true);
        leftAxis.setLabelCount(8, false);
        leftAxis.setValueFormatter(custom);
        leftAxis.setTextSize(8f);
        leftAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        leftAxis.setAxisMinimum(0f);
        YAxis rightAxis = mChartYear1.getAxisRight();
        rightAxis.setDrawGridLines(false);
        rightAxis.setInverted(true);
        rightAxis.setTextSize(8f);
        rightAxis.setLabelCount(8, false);
        rightAxis.setValueFormatter(custom);
        rightAxis.setAxisMinimum(0f);

        ArrayList<ILineDataSet> dataSets = new ArrayList<>();

        ArrayList<Entry> values_ceng1 = new ArrayList<>();
        ArrayList<Entry> values_ceng2 = new ArrayList<>();
        ArrayList<Entry> values_ceng3 = new ArrayList<>();

        ////////////////////todo 准备数据//////////////////////////
        //  for (int i = 0; i < mTime.size(); i++) {
        int flag = 0;
        float rCurrectTime = reFerenceTime / 60 / 60 / 24;
        if(mTime.size() - 1 >= 0){
            xAxis.setAxisMaximum((rCurrectTime - mTime.get(mTime.size() - 1).getTime() / 1000 / 60 / 60 / 24) + 3);
        }
        if((mTime.size()) > 0){
            xAxis.setAxisMinimum((rCurrectTime - mTime.get(0).getTime() / 1000 / 60 / 60 / 24) - 3);
        }
        for (Date time : mTime
                ) {
            float tmp = time.getTime() / 1000 / 60 / 60 / 24;
            float x = rCurrectTime - tmp;
            Log.d(TAG, "Day30CengData: " + x);
            int val1 = mDataceng1.get(flag);
            int val2 = mDataceng2.get(flag);
            int val3 = mDataceng3.get(flag);

            values_ceng1.add(new Entry(x, val1));
            values_ceng2.add(new Entry(x, val2));
            values_ceng3.add(new Entry(x, val3));
            flag++;
        }


        //  }
        d1 = new LineDataSet(values_ceng1, "L.1");
        d1.setColor(0xFFfff100);
        d1.setCircleColor(0xFFfff100);
        d1.setLineWidth(1.5f);
        d1.setFillAlpha(65);
        d1.setFillColor(0xFFec6941);
        d1.setDrawFilled(true);
        d1.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        d2 = new LineDataSet(values_ceng2, "L.2");
        d2.setLineWidth(1.5f);
        d2.setColor(0xFFf19ec2);
        d2.setCircleColor(0xFFf19ec2);
        d2.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        d3 = new LineDataSet(values_ceng3, "L.3");
        d3.setLineWidth(1.5f);
        d3.setColor(0xFFff0000);
        d3.setCircleColor(0xFFff0000);
        d3.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);

        dataSets.add(d1);
        dataSets.add(d2);
        dataSets.add(d3);
        return dataSets;
    }

    private List<Integer> CengData(List<User> dblist, int cengnum) {
        int size = dblist.size();
        ArrayList<Integer> data = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            data.add(Integer.parseInt(dblist.get(size - 1 - i).getCeshi_Data().split(" {2}")[cengnum - 1]));
        }
        return data;
    }

    private List<Date> generateTimeData(List<User> dblist) {
        int size = dblist.size();
        ArrayList<Date> data = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            data.add(dblist.get(size - 1 - i).getCeshi_Time());
            //Log.d(TAG, "oooooooooo: " + i + "    " + formatter.format(dblist.get(i).getCeshi_Time()));
        }
        return data;
    }

    private List<User> UniqueHour(List<User> dblist) {

        List<User> tmpDblist = new ArrayList<>();
        Date tmpTime = new Date();

        for (int i = 0; i < dblist.size(); i++) {

            if ((tmpTime.getTime() / 1000 / 60 / 60) - (dblist.get(i).getCeshi_Time().getTime() / 1000 / 60 / 60) != 0) {
                tmpDblist.add(dblist.get(i));
                //  Log.d(TAG, "Day30CengData: " + dblist.get(i).getCeshi_Time().getTime()/1000);
                tmpTime = dblist.get(i).getCeshi_Time();
            }
        }

        return tmpDblist;
    }

    private List<User> UniqueDay(List<User> dblist) {

        List<User> tmpDblist = new ArrayList<>();
        Date tmpTime = new Date();

        for (int i = 0; i < dblist.size(); i++) {

            if ((tmpTime.getTime() / 1000 / 60 / 60 / 24) - (dblist.get(i).getCeshi_Time().getTime() / 1000 / 60 / 60 / 24) != 0) {
                tmpDblist.add(dblist.get(i));
                //  Log.d(TAG, "Day30CengData: " + dblist.get(i).getCeshi_Time().getTime()/1000);
                tmpTime = dblist.get(i).getCeshi_Time();
            }
        }

        return tmpDblist;
    }

}



