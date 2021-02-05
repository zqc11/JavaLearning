package com.silentsunshine.net;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/5 - 02 - 05 - 16:07
 * @description practice com.silentsunshine.net
 */
public class TCPClientDemo2 {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9000);
        OutputStream outputStream = socket.getOutputStream();
        File file = new File("头像.jpg");
        FileInputStream fis1 = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis1.read(buffer)) != - 1) {
            outputStream.write(buffer);
        }
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        Arrays.fill(buffer, (byte) 0);
        while ((length = inputStream.read(buffer)) != - 1) {
            baos1.write(buffer);
        }
        socket.shutdownInput();
        System.out.println(baos1.toString(StandardCharsets.UTF_8));
        baos1.close();
        inputStream.close();
        outputStream.close();
        fis1.close();
        socket.close();
    }
}
