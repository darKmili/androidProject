package com.darkmili.ecxkdemo.feature.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

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
        List<UserInfo> list = new ArrayList<>();
        Column<String> name=new Column<String>("名称","name");
        Column<String> data=new Column<String>("时间","date");
        list.add(new UserInfo("ni","dasd"));
        list.add(new UserInfo("nai","ddasd"));
        list.add(new UserInfo("ndi","ddasd"));
        list.add(new UserInfo("dani","ddaasd"));
        TableData<UserInfo> tableData=new TableData<UserInfo>("表名",list,name,data);

        table = findViewById(R.id.smart_excel);
        table.setTableData(tableData);
        table.getConfig().setColumnTitleStyle(new FontStyle(50,Color.GREEN));
        table.getConfig().setContentStyle(new FontStyle(50, Color.BLACK));
        table.getConfig().setContentBackground(new BaseBackgroundFormat(Color.GRAY));

    }

}