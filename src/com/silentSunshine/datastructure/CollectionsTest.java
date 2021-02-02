package com.silentsunshine.datastructure;

import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/1/29 - 01 - 29 - 9:56
 * @description practice com.silentsunshine.datastructure
 */
public class CollectionsTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list,"张三", "李四" );
        Iterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        BitSet bitSet = new BitSet(20000);
        for (int i = 0; i < 20000; i++) {
            bitSet.set(i);
        }
        System.out.println(bitSet.get(15445));

    }
}
