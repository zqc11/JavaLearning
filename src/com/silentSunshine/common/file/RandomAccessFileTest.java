package com.silentsunshine.common.file;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/1/23 - 01 - 23 - 16:05
 * @description practice com.silentsunshine.common.file
 */
public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        String pathTo = "src/com/silentsunshine/common/file/test1.txt";
        //如果文件不存在，将新建文件
        //如果文件夹不存在，将抛出异常
        RandomAccessFile randomAccessFile = new RandomAccessFile(pathTo, "rw");
        System.out.println(randomAccessFile.readLine());
        //randomAccessFile.write(98);
        randomAccessFile.seek(0);
        System.out.printf("%s", randomAccessFile.readLine());
        randomAccessFile.seek(0);
        int intValue;
        while ((intValue = randomAccessFile.read())!=-1){
            System.out.println(intValue);
        }
        randomAccessFile.seek(0);
        byte[] bytes = new byte[3];
        while ((intValue = randomAccessFile.read(bytes))!=-1){
            for (int i = 0; i < intValue; i++) {
                System.out.printf("bytes[%d]:%d\n",i,bytes[i]);
                bytes[i]^=40;
            }
        }
        randomAccessFile.close();
    }
}
