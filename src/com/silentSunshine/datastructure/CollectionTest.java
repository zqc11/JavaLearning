package com.silentsunshine.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/1/29 - 01 - 29 - 21:01
 * @description practice com.silentsunshine.datastructure
 */
public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "hello", "world", "java");
        Object[] objects = list.toArray();
        for (Object object : objects) {
            System.out.println(object);
            /*
            System.out.println(object.length) //error
             */
        }
        String[] strings = list.toArray(new String[list.size()]);
        for (String string : strings) {
            System.out.println(string.length());//ok
        }
    }
}
