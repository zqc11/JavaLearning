package com.silentsunshine.iostream;

import java.io.*;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/8 - 02 - 08 - 19:54
 * @description practice com.silentsunshine.iostream
 */
public class TestIORW {
    public static void main(String[] args) throws IOException {
        File file = new File("GBK.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter out = new OutputStreamWriter(fileOutputStream,"UTF-8");
        for (int i=1, c=0x4e00; c<=0x9fa5; c++, i++ ) {
            out.write(c);
            if (i % 30 == 0) {
                out.write("\n");
            }
        }
        out.close();
        fileOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader in = new InputStreamReader(fileInputStream,"UTF-8");
        char[] buffered = new char[1024];
        int length = in.read(buffered);
        for (int i=0; i<length; i++){
            System.out.println(buffered[i]);
        }
        in.close();
    }
}
