package com.darkmili.materialtest.utils;


import android.content.Context;

import com.darkmili.materialtest.entity.MyApplication;
import com.darkmili.materialtest.entity.User;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * 验证用户登录情况，以及是否保存账号用户密码，以及实现免登陆操作
 */
public class LoginUtil {
    private static int count;
    private static Map<Integer, User> userMap = new HashMap<Integer, User>();



    public static boolean login_pass(String name, String pass) {
        if (name == null || pass == null)
            return false;
        if (userMap.containsKey(Integer.parseInt(name))) {
            User user = userMap.get(Integer.parseInt(name));
            if (pass.equals(user.getPass())) {
                return true;
            }
            return false;
        }

        //TODO 根据传入的用户名和密码判断是否登录成功，true表示登录成功
        return false;
    }

    public static void register(String name, String pass) {
        //TODO 注册账号和密码，将账号密码存到hash表中
        count++;
        userMap.put(Integer.parseInt(name), new User(name, pass));
        //TODO 持久化保存密码
        try {
            JSONObject jsonObject=new JSONObject();
//            jsonObject.put(new User(name,pass));
            FileOutputStream outputStream = MyApplication.getContext().openFileOutput("user", Context.MODE_APPEND);
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(outputStream));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
