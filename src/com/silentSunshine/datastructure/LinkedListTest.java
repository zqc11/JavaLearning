package com.silentsunshine.datastructure;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/1/28 - 01 - 28 - 9:43
 * @description practice com.silentsunshine.datastructure
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("hello, ");
        list.add("world");
        list.add(1, "woshidisanzhe ");
        System.out.println(list.size());
        System.out.println(list.get(1));
        Iterator<String> stringIterator = list.listIterator();
        //迭代器遍历，效率高
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
