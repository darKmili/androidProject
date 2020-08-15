package com.darkmili.calculatoractivity;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculate {

    public char add = '+';

    public char del = '-';

    public char mul = '*';

    public char div = '/';
    public Context context;

    public Calculate(Context context) {
        this.context = context;
    }

    public String calculate(String s) {
        try {


            StringBuffer sbMath = new StringBuffer();
            List<String> math = new ArrayList<String>();
            List<String> flag = new ArrayList<String>();
            List<Integer> mulDiv = new ArrayList<Integer>();
            for (int i = 0; i < s.length(); i++) {
                char temp = s.charAt(i);
                if (temp != add && temp != del && temp != mul && temp != div) {
                    sbMath.append(String.valueOf(temp));
                } else {
                    if (sbMath.length() == 0 && temp == del) {
                        sbMath.append("0");
                    }
                    math.add(sbMath.toString());
                    sbMath.delete(0, sbMath.length());
                    flag.add(String.valueOf(temp));
                    if (temp == mul || temp == div) {
                        mulDiv.add(flag.size() - 1);
                    }
                }
            }
            math.add(sbMath.toString());
            while (math.size() != 1) {
                boolean needReIndex = false;
                while (mulDiv.size() != 0) {
                    int index = mulDiv.get(0);
                    if (needReIndex) {
                        index = index - 1;
                    }
                    Map<String, List<String>> map = this.loopProcess(index, math, flag);
                    math = map.get("math");
                    flag = map.get("flag");
                    mulDiv = this.removeList(Integer.class, mulDiv, 0);
                    needReIndex = true;
                }
                while (flag.size() != 0) {
                    Map<String, List<String>> map = this.loopProcess(0, math, flag);
                    math = map.get("math");
                    flag = map.get("flag");
                }
            }
//        System.out.println(math.get(0));
            String s1 = math.get(0);
            return s1;
        } catch (Exception e) {
            Toast.makeText(context, "输入错误", Toast.LENGTH_LONG).show();
        }
        return "0";
    }

    private Map<String, List<String>> loopProcess(int index, List<String> math, List<String> flag) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        char ch = flag.get(index).charAt(0);
        String result = this.getResult(math.get(index).trim(), math.get(index + 1).trim(), ch);
        math = this.removeList(String.class, math, index);
        math = this.removeList(String.class, math, index);
        math.add(index, result);
        flag = this.removeList(String.class, flag, index);
        map.put("math", math);
        map.put("flag", flag);
        return map;
    }

    private <T> List<T> removeList(Class<T> clazz, List<T> list, int index) {
        List<T> listTemp = new ArrayList<T>();
        for (int i = 0; i < list.size(); i++) {
            if (i != index) {
                listTemp.add(list.get(i));
            }
        }
        return listTemp;
    }

    private String getResult(String b, String e, char flag) {
        boolean isLong = false;
        if (!b.contains(".") && !e.contains(".")) {
            isLong = true;
        }
        if (isLong) {
            if (flag == add) {
                return String.valueOf(Long.valueOf(b) + Long.valueOf(e));
            } else if (flag == del) {
                return String.valueOf(Long.valueOf(b) - Long.valueOf(e));
            } else if (flag == mul) {
                return String.valueOf(Long.valueOf(b) * Long.valueOf(e));
            } else if (flag == div) {
                return String.valueOf((double) Long.valueOf(b) / Long.valueOf(e));
            } else {
                throw new RuntimeException("error: " + b + flag + e);
            }
        } else {
            if (flag == add) {
                return String.valueOf(Double.valueOf(b) + Double.valueOf(e));
            } else if (flag == del) {
                return String.valueOf(Double.valueOf(b) - Double.valueOf(e));
            } else if (flag == mul) {
                return String.valueOf(Double.valueOf(b) * Double.valueOf(e));
            } else if (flag == div) {
                return String.valueOf((double) Double.valueOf(b) / Double.valueOf(e));
            } else {
                throw new RuntimeException("error: " + b + flag + e);
            }
        }

    }
}