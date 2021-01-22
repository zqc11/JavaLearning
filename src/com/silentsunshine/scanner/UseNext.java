package com.silentsunshine.scanner;

import java.util.Scanner;

/**
 * @Auther: zhouqc
 * @Date: 2021/1/16 - 01 - 16 - 9:51
 * @Description: com.silentsunshine.scanner
 * @version: 1.0
 */
public class UseNext {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next输入内容：");
        if (scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输入的内容为：" + str);
        }
        //凡是属于IO流的类如果没有关闭掉，就会一直占用内存
        //使用完一定要及时关闭
        scanner.close();

    }

}
