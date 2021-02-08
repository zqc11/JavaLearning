package com.silentsunshine.iostream;

import java.io.*;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/7 - 02 - 07 - 11:14
 * @description practice com.silentsunshine.iostream
 */
public class TestBufferStream {
    public static void main(String[] args) throws IOException {
        File file = new File("fileOutputStream.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        bufferedOutputStream.write(97);
        bufferedOutputStream.write(98);
        bufferedOutputStream.write(99);
        bufferedOutputStream.flush(); //因为内部数组没满,需要刷出缓存,不然无法写入文件
        bufferedOutputStream.close();
        //高级流的close()的执行过程
        //1. flush() 2.关闭相应的流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(buffer))!=-1) {
            System.out.println(new String(buffer, 0, len));
        }
        bufferedInputStream.close();

    }
}
