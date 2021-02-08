package com.silentsunshine.iostream;

import java.io.*;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/7 - 02 - 07 - 10:07
 * @description practice com.silentsunshine.iostream
 */
public class TestFileStream {
    public static void main(String[] args) {
        File file = new File("fileOutputStream.txt");
        byte[] buffer = new byte[50];
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(97);
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(buffer);
            System.out.println(new String(buffer).trim());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
