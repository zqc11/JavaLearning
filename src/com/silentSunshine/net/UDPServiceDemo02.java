package com.silentsunshine.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/5 - 02 - 05 - 21:48
 * @description practice com.silentsunshine.net
 */
public class UDPServiceDemo02 {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket(6666);
        byte[] data = new byte[1024];
        String dataString;
        DatagramPacket datagramPacket = new DatagramPacket(data,data.length);
        while (true) {
            datagramSocket.receive(datagramPacket);
            dataString = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            System.out.println(dataString);
            if (dataString.equals("bye")) {
                break;
            }
        }
        datagramSocket.close();

    }
}
