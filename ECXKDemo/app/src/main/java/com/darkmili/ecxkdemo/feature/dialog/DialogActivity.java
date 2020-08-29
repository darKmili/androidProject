package com.darkmili.ecxkdemo.feature.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

import com.bin.david.form.core.SmartTable;
import com.bin.david.form.data.CellInfo;
import com.bin.david.form.data.column.Column;
import com.bin.david.form.data.format.bg.BaseBackgroundFormat;
import com.bin.david.form.data.format.bg.IBackgroundFormat;
import com.bin.david.form.data.style.FontStyle;
import com.bin.david.form.data.table.TableData;
import com.darkmili.ecxkdemo.R;
import com.darkmili.ecxkdemo.entity.UserInfo;

import java.util.ArrayList;
import java.util.List;

public class DialogActivity extends AppCompatActivity {

    private SmartTable table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        Intent intent = getIntent();
        String time = intent.getStringExtra("time");


        List<UserInfo> list = new ArrayList<>();


        Column<String> erbiaoId = new Column<>("时间", "erbiaoId");//
        Column<Float> weight = new Column<>("体重", "weight");
        Column<Integer> growthDays = new Column<Integer>("成长天数", "growthDays");
        Column<String> species = new Column<String>("种类", "species");
        Column<String> lanqu = new Column<String>("栏区", "lanqu");
        Column<String> health = new Column<String>("健康", "health");
        Column<String> beizhu = new Column<String>("备注", "beizhu");

        //TODO  通过viewModel+litepal动态更新列表数据

        list.add(new UserInfo("2020-02-03", 80, 82, "良", "猪", "h586", "猪猪身体健康,刚打过疫苗"));
        list.add(new UserInfo("2020-07-03", 100, 100, "良", "猪", "x89", "转移到另一个栏区"));
        list.add(new UserInfo("2020-08-03", 152, 156, "良", "猪", "x89", "猪猪身体健康,可以宰杀"));
        list.add(new UserInfo("2020-09-03", 152, 156, "良", "猪", "x89", "猪猪身体健康,可以宰杀"));
        list.add(new UserInfo("2020-10-03", 152, 156, "良", "猪", "x89", "猪猪身体健康,可以宰杀"));
        list.add(new UserInfo("2020-11-03", 100, 100, "良", "猪", "x89", "转移到另一个栏区"));
        list.add(new UserInfo("2020-12-03", 152, 156, "良", "猪", "x89", "猪猪身体健康,可以宰杀"));
        list.add(new UserInfo("2019-11-03", 152, 156, "良", "猪", "x89", "猪猪身体健康,可以宰杀"));
        list.add(new UserInfo("2019-12-03", 100, 100, "良", "猪", "x89", "转移到另一个栏区"));
        list.add(new UserInfo("2018-02-03", 152, 156, "良", "猪", "x89", "猪猪身体健康,可以宰杀"));


        TableData<UserInfo> tableData = new TableData<UserInfo>("耳标号  " + time, list, erbiaoId, weight, growthDays, species, lanqu, health, beizhu);

        table = findViewById(R.id.smart_excel);
        table.setTableData(tableData);
        table.getConfig().setColumnTitleStyle(new FontStyle(50, Color.GREEN));
        table.getConfig().setContentStyle(new FontStyle(50, Color.BLACK));
        table.getConfig().setContentBackground(new BaseBackgroundFormat(Color.WHITE));


    }

}