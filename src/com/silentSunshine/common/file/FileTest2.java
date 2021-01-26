package com.silentsunshine.common.file;

import java.io.File;
import java.io.IOException;

/**
 * @version 1.0
 * @auther zhouqichun
 * @date 2021/1/23 - 01 - 23 - 10:34
 * @description practice com.silentsunshine.common.file
 */
public class FileTest2 {
    public static void main(String[] args) throws IOException {
        String path;
        path = "src/com/silentsunshine/common/file/1";
        File dir = new File(path);
        //生成目录
        dir.mkdirs();

        path = "src/com/silentsunshine/common/file/1.txt";
        File file = new File(path);
        //生成文件
        file.createNewFile();
        //删除目录
        dir.delete();
        //删除文件
        file.delete();
    }

}
