package com.silentsunshine.common.random;

import java.util.Random;

/**
 * @version 1.0
 * @auther zhouqichun
 * @date 2021/1/22 - 01 - 22 - 21:50
 * @description practice com.silentsunshine.common.random
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        //返回0~bound的随机数
        System.out.println(random.nextInt(500));
        //返回高斯分布的double值随机数
        System.out.println(random.nextGaussian());
        //返回随机Boolean值
        System.out.println(random.nextBoolean());
        //I don't use mouse,hahaha
        System.out.println("I use IdeaVim");
    }
}
