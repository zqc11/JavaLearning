package com.silentsunshine.common.packaging;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/1/26 - 01 - 26 - 15:45
 * @description practice com.silentsunshine.common.packaging
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        //创建对象
        BigDecimal bigDecimal = BigDecimal.valueOf(20.2);
        System.out.println(bigDecimal.divide(BigDecimal.valueOf(23.1), 5, RoundingMode.HALF_DOWN));
        //RoundingMode类为舍入模式类
        BigDecimal bigDecimal2 = bigDecimal.setScale(-1, RoundingMode.CEILING);
        System.out.println(bigDecimal2);
    }
}
