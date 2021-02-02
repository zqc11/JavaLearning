package com.silentsunshine.datastructure;

import java.util.HashMap;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/1/28 - 01 - 28 - 20:45
 * @description practice com.silentsunshine.datastructure
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("lihua", 12);
        hashMap.put("caifeng", 20);
        hashMap.put("hello", 56);
        System.out.println(hashMap.get("caifeng"));
        //每个键值对执行给定操作
        hashMap.forEach((k,v) -> System.out.printf("%s:%d\n", k, v));
        hashMap.put("hello", 23);
        //键值对不存在返回给定的默认值
        System.out.println(hashMap.getOrDefault("qichun", -1));

        String string = "adfsfsfdkgjslohsdkffhkendskgnhjsdkius";
        for (int i = 0; i < string.length(); i++) {
            hashMap.put(String.valueOf(string.charAt(i)), hashMap.getOrDefault(String.valueOf(string.charAt(i)), 0)+1);
        }
        hashMap.forEach((k,v) -> System.out.printf("%s:%d \n", k,v));

    }
}
