package com.darkmili.calculatoractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDot, btnAdd, btnMinus, btnMulti, btnDvs, btnEq, clear, delete;
    private TextView textView1, text_result;
    private MutableLiveData<String> result, display;
    private StringBuilder allBuilder;
    private StringBuilder tmpBuilder;
    private MainViewModel viewModel;
    private Calculate calculate;
    public static final String ADD = "add";
    public static final String MIN = "min";
    public static final String MUL = "mul";
    public static final String DVS = "dvs";

    private List<Item> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    public void initUI() {
        btn0 = findViewById(R.id.bt_0);
        btn1 = findViewById(R.id.bt_1);
        btn2 = findViewById(R.id.bt_2);
        btn3 = findViewById(R.id.bt_3);
        btn4 = findViewById(R.id.bt_4);
        btn5 = findViewById(R.id.bt_5);
        btn6 = findViewById(R.id.bt_6);
        btn7 = findViewById(R.id.bt_7);
        btn8 = findViewById(R.id.bt_8);
        btn9 = findViewById(R.id.bt_9);

        btnDot = findViewById(R.id.bt_dot);
        btnDvs = findViewById(R.id.bt_dvs);
        btnEq = findViewById(R.id.bt_eq);
        btnAdd = findViewById(R.id.bt_ad);
        btnMinus = findViewById(R.id.bt_min);
        btnMulti = findViewById(R.id.bt_mul);
        clear = findViewById(R.id.bt_clear);
        delete = findViewById(R.id.bt_delete);
        list = new ArrayList<>();
        textView1 = findViewById(R.id.text_1);
        text_result = findViewById(R.id.text_result);
        tmpBuilder = new StringBuilder();
        allBuilder = new StringBuilder();
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        display = viewModel.getDisplay();
        result = viewModel.getResult();

        calculate = new Calculate(this);
        display.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                if (s == null) {
                    s = "";
                }
                textView1.setText(s);
            }
        });
        result.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                if (s == null) {
                    s = "";
                }
                text_result.setText(s);
            }
        });
    }

    /**
     * 获取按钮0的值
     *
     * @param view
     */
    public void get0(View view) {
        if (allBuilder.length() == 0) {
            return;
        } else {
            tmpBuilder.append(0);
            allBuilder.append(0);
            display.setValue(allBuilder.toString());
            tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
            result.setValue(tmpBuilder.toString());
        }
    }

    /**
     * 获取按钮1的值
     *
     * @param view
     */
    public void get1(View view) {
        tmpBuilder.append(1);
        allBuilder.append(1);
        display.setValue(allBuilder.toString());
        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());
    }

    /**
     * 获取按钮2的值
     *
     * @param view
     */
    public void get2(View view) {
        tmpBuilder.append(2);
        allBuilder.append(2);
        display.setValue(allBuilder.toString());
        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());
    }

    /**
     * 获取按钮3的值
     *
     * @param view
     */
    public void get3(View view) {
        tmpBuilder.append(3);
        allBuilder.append(3);
        display.setValue(allBuilder.toString());
        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());
    }

    /**
     * 获取按钮4的值
     *
     * @param view
     */
    public void get4(View view) {
        tmpBuilder.append(4);
        allBuilder.append(4);
        display.setValue(allBuilder.toString());
        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());
    }

    /**
     * 获取按钮5的值
     *
     * @param view
     */
    public void get5(View view) {
        tmpBuilder.append(5);
        allBuilder.append(5);
        display.setValue(allBuilder.toString());
        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());
    }

    /**
     * 获取按钮6的值
     *
     * @param view
     */
    public void get6(View view) {
        tmpBuilder.append(6);
        allBuilder.append(6);
        display.setValue(allBuilder.toString());
        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());
    }

    /**
     * 获取按钮7的值
     *
     * @param view
     */
    public void get7(View view) {
        tmpBuilder.append(7);
        allBuilder.append(7);
        display.setValue(allBuilder.toString());
        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());
    }

    /**
     * 获取按钮8的值
     *
     * @param view
     */
    public void get8(View view) {
        tmpBuilder.append(8);
        allBuilder.append(8);
        display.setValue(allBuilder.toString());
        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());
    }

    /**
     * 获取按钮9的值
     *
     * @param view
     */
    public void get9(View view) {
        tmpBuilder.append(9);
        allBuilder.append(9);
        display.setValue(allBuilder.toString());
        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());
    }

    /**
     * 获得小数点
     * @param view
     */
    public void getDot(View view){
        tmpBuilder.append(".");
        allBuilder.append(".");
        display.setValue(allBuilder.toString());
        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());
    }

    public void getEquals(View view){
        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());
        allBuilder=tmpBuilder;
    }
    /**
     * 清除所有数据
     *
     * @param view
     */
    public void clear(View view) {
        tmpBuilder = new StringBuilder();
        allBuilder = new StringBuilder();
        result.setValue("");
        display.setValue("");
    }

    /**
     * 删除单个数据
     *
     * @param view
     */
    public void delete(View view) {
        try {
            allBuilder.deleteCharAt(allBuilder.length() - 1);
            tmpBuilder=new StringBuilder(calculate.calculate(allBuilder.toString()));
            result.setValue(tmpBuilder.toString());
            display.setValue(allBuilder.toString());
        } catch (Exception e) {
            Log.e("error", "删除错误");
        }
    }

    /**
     * 加法事件
     *
     * @param view
     */
    public void add(View view) {
        if (lastIsSign(allBuilder.toString())) {
            allBuilder.deleteCharAt(allBuilder.length() - 1).append("+");

        } else {
            allBuilder.append("+");

        }
        display.setValue(allBuilder.toString());
//        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());
    }

    /**
     * 减法事件
     *
     * @param view
     */
    public void min(View view) {
        if (lastIsSign(allBuilder.toString())) {
            allBuilder.deleteCharAt(allBuilder.length() - 1).append("-");

        } else {
            allBuilder.append("-");

        }
        display.setValue(allBuilder.toString());
//        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());
    }

    /**
     * 乘法事件
     *
     * @param view
     */
    public void mul(View view) {
        if (lastIsSign(allBuilder.toString())) {
            allBuilder.deleteCharAt(allBuilder.length() - 1).append("*");
        } else {
            allBuilder.append("*");
        }
        display.setValue(allBuilder.toString());
//        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());


    }

    /**
     * 除法事件
     *
     * @param view
     */
    public void divide(View view) {
        if (lastIsSign(allBuilder.toString())) {
            allBuilder.deleteCharAt(allBuilder.length() - 1).append("/");

        } else {
            allBuilder.append("/");

        }
        display.setValue(allBuilder.toString());
//        tmpBuilder = new StringBuilder(calculate.calculate(allBuilder.toString()));
        result.setValue(tmpBuilder.toString());
    }

    /**
     * 判断是否含有符号
     *
     * @param s
     * @return
     */
    public boolean isHaveSign(String s) {
        if (s.contains("/")) {
            return true;
        } else if (s.contains("*")) {
            return true;
        } else if (s.contains("+")) {
            return true;
        } else if (s.contains("-")) {
            return true;
        }
        return false;
    }

    /**
     * 判断最后一个值是否为符号
     *
     * @param s
     * @return
     */
    public boolean lastIsSign(String s) {
        if (s.endsWith("*") || s.endsWith("/") || s.endsWith("+") || s.endsWith("-")) {
            return true;
        }
        return false;
    }


}