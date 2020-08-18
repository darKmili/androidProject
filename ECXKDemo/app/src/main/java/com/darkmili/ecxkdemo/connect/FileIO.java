package com.darkmili.ecxkdemo.connect;

import android.content.Context;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileIO  {

    /**
     * 读取文件内容
     *
     * @param fileName
     * @return
     */
    public static byte[] read(String fileName) {
        String tempFile = fileName.trim();
        if (tempFile.length() == 0)
            return new byte[0];
        File file = new File(tempFile);
        long len = file.length();
        byte[] data = new byte[(int) len];
//        int len;
//        byte[] data=new byte[1024];
        //286173
        try {
            InputStream stream = new FileInputStream(file);
            while ((len = stream.read(data)) != -1) {
                return data;
            }


            //处理业务
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    /**
     * 写入文件到安卓
     *
     * @param data
     */
    public static void write(byte[] data, Context context) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = context.openFileOutput("data", Context.MODE_APPEND);
            fileOutputStream.write(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    @Override
//    public void run() {
//        /**
//         * 读取文件内容,发送出去
//         * @param fileName
//         * @return
//         */
//        String tempFile = fileName.trim();
//        File file = new File(tempFile);
//
//        int len;
//        byte[] data = new byte[1024];
//        //286173
//        try {
//            InputStream stream = new FileInputStream(file);
//            while ((len = stream.read(data)) != -1) {
//                connectThread.sendData(data);
//            }
//            stream.close();
//            //处理业务
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
}
