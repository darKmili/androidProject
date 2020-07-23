package com.darkmili.materialtest.utils;

import com.darkmili.materialtest.entity.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Map;

/**
 * 验证用户登录情况，以及是否保存账号用户密码，以及实现免登陆操作
 */
public class LoginUtil {
    private static Map<String, User> userMap =null;


    public static boolean login_pass(String name, String pass) {
        if (name == null || pass == null)
            return false;
        if (userMap == null) {
            init();
        }


        if (userMap.containsKey(name)) {
            User user = userMap.get(name);
            if (pass.equals(user.getPass())) {
                return true;
            }
            return false;
        }

        //TODO 根据传入的用户名和密码判断是否登录成功，true表示登录成功
        return false;
    }

    public static void register(String name, String pass) {
        if (userMap==null)
            init();
        //TODO 注册账号和密码，将账号密码存到hash表中
        User user = new User(name, pass);
        userMap.put(name, user);
        save();
    }

    //数据永久保存
    public static void save() {
        Gson gson = new Gson();
        String s = gson.toJson(userMap);
        FileUtil.writer_file("user", s);
    }

    public static void init() {
        userMap=new HashMap<>();
        //初始化用户表单
        String userStr = FileUtil.reader_file("user");
        Gson gson = new Gson();
        userMap = gson.fromJson(userStr, new TypeToken<HashMap<String, User>>() {
        }.getType());

    }

}
