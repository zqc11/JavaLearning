package com.silentSunshine.generic;

/**
 * @auther: zhouqichun
 * @date: 2021/1/17 - 01 - 17 - 21:32
 * @description: com.silentSunshine.generic
 * @version: 1.0
 */
public class GenericTest {
    public static void main(String[] args) {
        Generic<Integer> integerGeneric1 = new Generic<>(20);
        Generic<String> stringGeneric2 = new Generic<>("hello");
        Generic<Boolean> booleanGeneric3 = new Generic<>(true);
        System.out.println(integerGeneric1.getKey());
        System.out.println(stringGeneric2.getKey());
        System.out.println(booleanGeneric3.getKey());
        Generic a = new Generic(13);
        Generic b = new Generic("world");
        Generic c = new Generic(true);
        System.out.println(a.getKey());
        System.out.println(b.getKey());
        System.out.println(c.getKey());

    }
}
