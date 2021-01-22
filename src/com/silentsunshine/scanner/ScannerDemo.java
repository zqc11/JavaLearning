package com.silentsunshine.scanner;

import java.util.Scanner;

/**
 * @Auther: zhouqc
 * @Date: 2021/1/16 - 01 - 16 - 16:09
 * @Description: com.silentsunshine.scanner
 * @version: 1.0
 */
public class ScannerDemo {
    //用户输入一系列数据（通过空格进行分割），然后求平均值
    public static void main(String[] args) {
        //变量input储存输入的数
        double input;
        //变量sum储存当前输入下的总和
        double sum = 0;
        //变量numOfInput储存输入数据的总数
        int numOfInput = 0;
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据：");
        //当输入的内容不是Double类型时，跳出循环
        while (scanner.hasNextDouble()){
            input = scanner.nextDouble();
            numOfInput++;
            sum += input;
        }
        //求平均值
        double average = sum/numOfInput;
        //输出平均值
        System.out.println("平均值为：" + average);
        //关闭scanner对象，释放资源
        scanner.close();
    }
}
