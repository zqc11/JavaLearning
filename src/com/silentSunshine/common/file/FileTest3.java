package com.silentsunshine.common.file;

import java.io.File;
import java.io.IOException;

/**
 * @version 1.0
 * @author zhouqichun
 * @date 2021/1/23 - 01 - 23 - 10:49
 * @description practice com.silentsunshine.common.file
 */
public class FileTest3 {
    public static void main(String[] args) throws IOException {
        //生成临时文件
//        File file = File.createTempFile("temp", ".txt");
        //获得绝对路径
//        System.out.println(file.getAbsolutePath());
        String path = "D:\\Software";
//        File dir = new File(path);
//        for (String s : dir.list()) {
//            //列出目录中的文件
//            System.out.println(s);
//        }
//        for (File listFile : dir.listFiles()) {
//            System.out.println(listFile.getName() + "-" + listFile.length());
//        }
        long time = System.currentTimeMillis();
        System.out.printf("%s 的大小为：%.1fM\n",path,new FileTest3().getDirLength(path)/1024/1024);
        time = System.currentTimeMillis() - time;
        System.out.printf("查询花费的时间为：%dms", time);
    }

    /**
     * 计算文件夹或文件的大小
     * @param dirpath 将要计算大小的文件夹
     * @return 返回该文件夹的大小Byte
     */
    public double getDirLength(String dirpath){
        File dir = new File(dirpath);
        File[] files = dir.listFiles();
        if (files == null) {
            return 0;
        }
        double sum = 0;
        for (File file : files) {
            if (file.isFile()) {
                sum += file.length();
            } else {
                sum += getDirLength(file.getAbsolutePath());
            }
        }
        System.out.printf("%s 的大小为：%.1fM\n",dir.getName(),sum/1024/1024);

        return sum;

    }
}
