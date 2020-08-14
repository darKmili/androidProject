package com.darkmili.calculatoractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.IntentFilter;
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
    private MutableLiveData<String> result,display;
    private StringBuilder resultBuilder;
    private StringBuilder tmpBuilder;
    private MainViewModel viewModel;

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
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        display=viewModel.getDisplay();
        result = viewModel.getResult();
        result.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                if (s == null) {
                    s = "";
                }
                textView1.setText("=" + s);
            }
        });
        display.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                if (s==null){
                    s="";
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
        if (tmpBuilder.length() == 0) {
            return;
        } else {
            tmpBuilder.append(0);
            resultBuilder.append(0);
            result.setValue(resultBuilder.toString());
            if (!isHaveSign(resultBuilder.toString())){
                display.setValue(tmpBuilder.toString());
            }
        }
    }

    /**
     * 获取按钮1的值
     *
     * @param view
     */
    public void get1(View view) {
        tmpBuilder.append(1);
        resultBuilder.append(1);
        result.setValue(resultBuilder.toString());
        if (!isHaveSign(resultBuilder.toString())){
            display.setValue(tmpBuilder.toString());
        }
    }

    /**
     * 获取按钮2的值
     *
     * @param view
     */
    public void get2(View view) {
        tmpBuilder.append(2);
        resultBuilder.append(2);
        result.setValue(resultBuilder.toString());
        if (!isHaveSign(resultBuilder.toString())){
            display.setValue(tmpBuilder.toString());
        }
    }

    /**
     * 获取按钮3的值
     *
     * @param view
     */
    public void get3(View view) {
        tmpBuilder.append(3);
        resultBuilder.append(3);
        result.setValue(resultBuilder.toString());
        if (!isHaveSign(resultBuilder.toString())){
            display.setValue(tmpBuilder.toString());
        }
    }

    /**
     * 获取按钮4的值
     *
     * @param view
     */
    public void get4(View view) {
        tmpBuilder.append(4);
        resultBuilder.append(4);
        result.setValue(resultBuilder.toString());
        if (!isHaveSign(resultBuilder.toString())){
            display.setValue(tmpBuilder.toString());
        }
    }

    /**
     * 获取按钮5的值
     *
     * @param view
     */
    public void get5(View view) {
        tmpBuilder.append(5);
        resultBuilder.append(5);
        result.setValue(resultBuilder.toString());
        if (!isHaveSign(resultBuilder.toString())){
            display.setValue(tmpBuilder.toString());
        }
    }

    /**
     * 获取按钮6的值
     *
     * @param view
     */
    public void get6(View view) {
        tmpBuilder.append(6);
        resultBuilder.append(6);
        result.setValue(resultBuilder.toString());
        if (!isHaveSign(resultBuilder.toString())){
            display.setValue(tmpBuilder.toString());
        }
    }

    /**
     * 获取按钮7的值
     *
     * @param view
     */
    public void get7(View view) {
        tmpBuilder.append(7);
        resultBuilder.append(7);
        result.setValue(resultBuilder.toString());
        if (!isHaveSign(resultBuilder.toString())){
            display.setValue(tmpBuilder.toString());
        }
    }

    /**
     * 获取按钮8的值
     *
     * @param view
     */
    public void get8(View view) {
        tmpBuilder.append(8);
        resultBuilder.append(8);
        result.setValue(resultBuilder.toString());
        if (!isHaveSign(resultBuilder.toString())){
            //短
            display.setValue(tmpBuilder.toString());
        }
    }

    /**
     * 获取按钮9的值
     *
     * @param view
     */
    public void get9(View view) {
        tmpBuilder.append(9);
        resultBuilder.append(9);
        result.setValue(resultBuilder.toString());
        if (!isHaveSign(resultBuilder.toString())){
            display.setValue(tmpBuilder.toString());
        }
    }

    /**
     * 清除所有数据
     *
     * @param view
     */
    public void clear(View view) {
        tmpBuilder = new StringBuilder();
        resultBuilder=new StringBuilder();
        result.setValue("");
    }

    /**
     * 删除单个数据
     *
     * @param view
     */
    public void delete(View view) {
        try {
            tmpBuilder.deleteCharAt(tmpBuilder.length() - 1);
            resultBuilder.deleteCharAt(resultBuilder.length()-1);
            result.setValue(resultBuilder.toString());
            if (!isHaveSign(resultBuilder.toString())){
                //TODO
            }
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
        resultBuilder.append("+");
        result.setValue(resultBuilder.toString());
        list.add(new Item(tmpBuilder.toString(),ADD));
        tmpBuilder=new StringBuilder();
        display.setValue(tmpBuilder.toString());
    }
   /**
     * 减法事件
     *
     * @param view
     */
    public void min(View view) {
        resultBuilder.append("-");
        result.setValue(resultBuilder.toString());
        list.add(new Item(tmpBuilder.toString(),MIN));
        tmpBuilder=new StringBuilder();
        display.setValue(tmpBuilder.toString());
    }
   /**
     * 乘法事件
     *
     * @param view
     */
    public void mul(View view) {
        resultBuilder.append("x");
        result.setValue(resultBuilder.toString());
        list.add(new Item(tmpBuilder.toString(),MUL));
        tmpBuilder=new StringBuilder();
        display.setValue(tmpBuilder.toString());
    }

    /**
     * 除法事件
     *
     * @param view
     */
    public void divide(View view) {
        resultBuilder.append("/");
        result.setValue(resultBuilder.toString());
        list.add(new Item(tmpBuilder.toString(),DVS));
        tmpBuilder=new StringBuilder();
        display.setValue(tmpBuilder.toString());
    }

    /**
     * 判断是否含有符号
     * @param s
     * @return
     */
    public boolean isHaveSign(String s){
        if (s.contains("/")){
            return true;
        }else if (s.contains("x")){
            return true;
        }else if (s.contains("+")){
            return true;
        }else if (s.contains("-")){
            return true;
        }
        return false;
    }
}