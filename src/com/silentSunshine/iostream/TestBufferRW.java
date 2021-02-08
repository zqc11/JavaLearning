package com.silentsunshine.iostream;

import java.io.*;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/8 - 02 - 08 - 20:28
 * @description practice com.silentsunshine.iostream
 */
public class TestBufferRW {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("GBK.txt"),"UTF-8"));
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }

    }
}
