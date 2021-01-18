package com.silentSunshine.array;

/**
 * @Auther: zhouqc
 * @Date: 2021/1/16 - 01 - 16 - 19:19
 * @Description: com.silentSunshine.array
 * @version: 1.0
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] a = new int[3];
        for (int x : a) {
            System.out.println("默认初始化：" + x);
        }
        int[] b = {1,2,3};
        for (int x :
                b) {
            System.out.println("静态初始化：" + x);
        }
    }
}
