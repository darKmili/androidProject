package com.darkmili.materialtest.utils;


import com.darkmili.materialtest.entity.User;

import java.util.HashMap;
import java.util.Map;

/**
 * 验证用户登录情况，以及是否保存账号用户密码，以及实现免登陆操作
 */
public class LoginUtil {
    private static int count;
    private static Map<Integer, User> userMap = new HashMap<Integer, User>();

    static {
        userMap.put(Integer.parseInt("123"), new User("123", "123"));
        userMap.put(Integer.parseInt("456"), new User("456", "123"));
        userMap.put(Integer.parseInt("567"), new User("567", "123"));
        userMap.put(Integer.parseInt("789"), new User("789", "123"));
        count = 4;
    }

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

    }
}
