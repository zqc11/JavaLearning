package com.silentsunshine.base;

/**
 * @Auther: zhouqc
 * @Date: 2021/1/16 - 01 - 16 - 19:26
 * @Description: com.silentsunshine.base
 * @version: 1.0
 */

/**
 * @author zhouqichun
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
        String str = args[0];
        switch (str){
            case "nihao":
                System.out.println("你好");
                break;
            case "shijie":
                System.out.println("世界");
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + str);
        }
    }
}
