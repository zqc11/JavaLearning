package com.silentsunshine.common.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/1/23 - 01 - 23 - 16:43
 * @description practice com.silentsunshine.common.file
 */
public class FileTest4 {
    public static void main(String[] args) {
        String path = "C:\\Users\\zhouqichun";
        try {
            List<String> list = FileTest4.findImageFiles(path);
            for (String s : list) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * 查找目录下的所有图片文件和视频文件
     * @param directory 目录
     * @return List<String>
     * @throws Exception
     */
    private static List<String> findImageFiles(String directory) throws Exception {
        File dir = new File(directory);
        if (dir.isFile()) {
            System.out.println(dir.getAbsolutePath());
            throw new Exception("不是一个目录");
        }
        List<String> list = new ArrayList<>();
        File[] files = dir.listFiles();
        if (files==null) {
            return list;
        }
        for (File file :
                files) {
            if (file.isFile()) {
                if (file.getName().matches("(?i).+?\\.(jpg|gif|bmp|mp4)")) {
                    list.add(file.getName());
                }
            }
            else {
                list.addAll(findImageFiles(file.getAbsolutePath()));
            }
        }
        return list;

    }
}
