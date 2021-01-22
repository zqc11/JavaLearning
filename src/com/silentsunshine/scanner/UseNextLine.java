package com.silentsunshine.scanner;

import java.util.Scanner;

/**
 * @Auther: zhouqc
 * @Date: 2021/1/16 - 01 - 16 - 9:58
 * @Description: com.silentsunshine.scanner
 * @version: 1.0
 */
public class UseNextLine {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine接收的输入：");
        if (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输入的内容为" + str);
        }
        //销毁分配的scanner对象，释放资源
        scanner.close();
    }
}
