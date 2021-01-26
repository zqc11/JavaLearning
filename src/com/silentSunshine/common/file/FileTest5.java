package com.silentsunshine.common.file;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/1/26 - 01 - 26 - 10:28
 * @description practice com.silentsunshine.common.file
 */
public class FileTest5 {
    public static void main(String[] args) throws IOException {
        FileTest5.encode("src/com/silentsunshine/common/file/test.txt", (byte) 40);
    }

    /**
     * 该方法对文件进行简单的加密和解密操作
     * @param filename 要进行加密的文件
     * @param key 密钥
     * @throws IOException 当文件无法读取时，抛出异常
     */
    private static void encode(String filename, byte key) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filename, "rw");
        byte[] bytes = new byte[5];
        long writePos = 0;
        int readLength;
        while ((readLength = file.read(bytes))!=-1){
            for (int i = 0; i < readLength; i++) {
                bytes[i] ^= key;
            }
            file.seek(writePos);
            file.write(bytes);
            writePos = file.getFilePointer();
        }
        file.close();
    }
}
