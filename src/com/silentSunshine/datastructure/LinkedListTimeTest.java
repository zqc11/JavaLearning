package com.silentsunshine.datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/1/28 - 01 - 28 - 10:19
 * @description practice com.silentsunshine.datastructure, 该类旨在证明
 * next方法遍历比get方法遍历效率高
 */
public class LinkedListTimeTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.add("a");
        }
        long t = System.currentTimeMillis();
        getMethod(list);
        t = System.currentTimeMillis() - t;
        System.out.println(t);
        t = System.currentTimeMillis();
        nextMethod(list);
        t = System.currentTimeMillis() - t;
        System.out.println(t);
    }

    private static void nextMethod(List<String> list) {
        Iterator<String> stringIterator = list.iterator();
        while (stringIterator.hasNext()) {
            stringIterator.next();
        }
    }

    private static void getMethod(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }
}
