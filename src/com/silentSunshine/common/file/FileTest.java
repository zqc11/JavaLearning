package com.silentsunshine.common.file;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @version 1.0
 * @auther zhouqichun
 * @date 2021/1/23 - 01 - 23 - 10:07
 * @description practice com.silentsunshine.common.file
 */
public class FileTest {
    /*
    File 封装磁盘路径字符串

     */
    public static void main(String[] args) throws FileNotFoundException {
        String filepath;
        filepath = "src/com/silentsunshine/common/file/test.txt";
        //filepath = "src/com/silentsunshine/common/file";
        //filepath = "src1/com/silentsunshine/common/file/test.txt";
        File file = new File(filepath);
        System.out.println(file.exists());//是否存在
        System.out.println(file.length());//长度
        System.out.println(file.isFile());//是否是一个文件
        System.out.println(file.isDirectory());//是否是一个文件加
        System.out.println(file.lastModified());//最后修改时间
    }
}
