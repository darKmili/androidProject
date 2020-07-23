package com.darkmili.materialtest.utils;

import android.content.Context;

import com.darkmili.materialtest.entity.MyApplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileUtil {
    //将内容写入到文件
    public static void writer_file(String file, String content) {
        try {
            //采用覆盖写入
            FileOutputStream outputStream = MyApplication.getInstance().openFileOutput(file, Context.MODE_PRIVATE);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write(content);
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //将内容从文件读出
    public static String reader_file(String file) {
        try {
            StringBuilder builder = new StringBuilder();
            FileInputStream inputStream = MyApplication.getInstance().openFileInput(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String s = "";
            while ((s = reader.readLine()) != null) {
                builder.append(s);

            }
            reader.close();
            return builder.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
