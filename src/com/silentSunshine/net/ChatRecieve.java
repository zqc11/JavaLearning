package com.silentsunshine.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/5 - 02 - 05 - 22:19
 * @description practice com.silentsunshine.net
 */
public class ChatRecieve implements Runnable{
    private int openPort;
    private DatagramSocket datagramSocket;
    private DatagramPacket datagramPacket;
    private byte[] containers;
    private String recieveMsg;

    public ChatRecieve(int openPort) {
        try {
            datagramSocket = new DatagramSocket(openPort);
            containers = new byte[1024];
            datagramPacket = new DatagramPacket(containers, containers.length);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        while (true) {
            try {
                datagramSocket.receive(datagramPacket);
                recieveMsg = new String(datagramPacket.getData(),0,datagramPacket.getData().length);
                System.out.println("来自"+datagramPacket.getAddress().getHostName()+"的消息："+recieveMsg);
                if (recieveMsg.equals("bye")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        datagramSocket.close();
    }
}
