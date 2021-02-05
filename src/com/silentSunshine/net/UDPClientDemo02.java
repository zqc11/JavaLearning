package com.silentsunshine.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/5 - 02 - 05 - 21:48
 * @description practice com.silentsunshine.net
 */
public class UDPClientDemo02 {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        InetAddress host = InetAddress.getByName("localhost");
        InputStream in = System.in;
        BufferedReader reader = null;
        reader = new BufferedReader(new InputStreamReader(in));
        byte[] data;
        while (true) {
            String datas = reader.readLine();
            data = datas.getBytes(StandardCharsets.UTF_8);
            DatagramPacket packet = new DatagramPacket(data, 0, data.length, host, 6666);
            datagramSocket.send(packet);
            if (datas.equals("bye")) {
                break;
            }
        }
        reader.close();
        in.close();
        datagramSocket.close();
    }
}
