package com.silentsunshine.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/4 - 02 - 04 - 22:38
 * @description practice com.silentsunshine.net
 */
public class TestInetAddress {
    public static void main(String[] args) {
        try {
            InetAddress byName = InetAddress.getByName("www.vip.com");
            System.out.println(byName.getHostAddress());
            System.out.println(byName.getHostName());
            System.out.println(byName.getCanonicalHostName());//规范地址
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
