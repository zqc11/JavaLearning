package com.silentsunshine.datastructure;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/1/28 - 01 - 28 - 10:47
 * @description practice com.silentsunshine.datastructure
 */
public class UnglyNumberTest {
    public static void main(String[] args) {
        System.out.println("请输入你想要求的第几个丑数：");
        int index = new Scanner(System.in).nextInt();
        long t = System.currentTimeMillis();
        long unglyNumber = getUnglyNumber(index);
        t = System.currentTimeMillis() - t;
        System.out.printf("第%d个丑数为：%d，花费时间为%d", index, unglyNumber, t);
        System.out.println();
        t = System.currentTimeMillis();
        unglyNumber = getUnglyNumber2(index);
        t = System.currentTimeMillis() - t;
        System.out.printf("第%d个丑数为：%d，花费时间为%d", index, unglyNumber, t);


    }

    private static long getUnglyNumber2(int index) {
        List<Long> list3 = new LinkedList<>();
        List<Long> list5 = new LinkedList<>();
        List<Long> list7 = new LinkedList<>();
        list3.add(3L);
        list5.add(5L);
        list7.add(7L);
        long result = 0;
        for (int i = 0; i < index; i++) {
            long a = list3.get(0);
            long b = list5.get(0);
            long c = list7.get(0);
            result = Math.min(a, Math.min(b, c));
            if (result == a) {
                list3.remove(0);
            }
            if (result == b) {
                list5.remove(0);
            }
            if (result == c) {
                list7.remove(0);
            }
            list3.add(result * 3);
            list5.add(result * 5);
            list7.add(result * 7);
        }
        return result;
    }


    /*效率极低*/
    private static long getUnglyNumber(int index) {
        long number = 1;
        long unglyNumber = 0;
        long tempNum;
        while (index>0) {
            tempNum = number;
            while (true) {
                if (tempNum % 3 == 0) {
                    tempNum /= 3;
                } else if (tempNum % 5 == 0) {
                    tempNum /= 5;
                } else if (tempNum % 7 == 0) {
                    tempNum /= 7;
                }
                else {
                    break;
                }
                if (tempNum == 1) {
                    unglyNumber = number;
                    index--;
                }
            }
            number++;

        }
        return unglyNumber;
    }
}
