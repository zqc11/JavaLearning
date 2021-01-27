package com.silentsunshine.common.packaging;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/1/26 - 01 - 26 - 11:15
 * @description practice com.silentsunshine.common.packaging
 */
public class PackageTest {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf("255");
        System.out.println(integer.intValue());
        //字符串转int
        integer = Integer.parseInt("11111110", 2);
        System.out.println(integer.intValue());
        //进制转换
        System.out.println(Integer.toBinaryString(255));
        System.out.println(Integer.toHexString(255));
        System.out.println(Integer.toOctalString(255));
    }
}
