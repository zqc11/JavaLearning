package com.silentsunshine.common.math;

/**
 * @auther: zhouqichun
 * @date: 2021/1/20 - 01 - 20 - 8:44
 * @description: com.silentSunshine.common.math
 * @version: 1.0
 */
public class MathTest {
    public static void main(String[] args) {
        //角度转弧度
        System.out.println(Math.toRadians(30));
        //lne
        System.out.println(Math.exp(Math.log(Math.E)));
        //立方根函数
        System.out.println(Math.cbrt(- 8));
        //求余函数
        System.out.println(Math.IEEEremainder(5.687, 7.642));
        //返回大于或等于自变量的最小整数的double形式
        System.out.println(Math.ceil(6.1));
        //返回小于或等于自变量的最大整数的double形式
        System.out.println(Math.floor(6.1));
        //返回最接近自变量的整数,如果是相等距离，则取偶数
        System.out.println(Math.rint(6.5));
        //返回直角坐标的在极坐标上的角度
        System.out.println(Math.atan2(2, 2));
        System.out.println(Math.toDegrees(Math.atan2(2, 2)));
        //四舍五入
        System.out.println(Math.round(4.5));
        System.out.println(Math.round(4.4));
        //生成0.0到1.0之间的随机数
        System.out.println(Math.random());
        System.out.println(Math.random());
        //返回x1到x2之间的随机数
        double f = Math.random() / Math.nextDown(1.0);
        double x1 = 2;
        double x2 = 5;
        double x = x1 * (1.0 - f) + x2 * f;
        System.out.println(x);
        //溢出自动抛出异常的加法函数
        System.out.println(Math.addExact(99999999, Integer.MIN_VALUE));
        //还有乘法、减法、自增、自减溢出检测的函数

        //Integer.MAX_VALUE 不等于 Integer.MIN_VALUE
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //由Integer.MIN_VALUE取反时自动抛出异常的取反函数
        System.out.println(Math.negateExact(50));
        //返回64x64乘法的高64
        System.out.println(Math.multiplyHigh(Long.MAX_VALUE, Long.MAX_VALUE));
        System.out.println(Long.MAX_VALUE * Long.MAX_VALUE);//溢出
        //返回小于或等于代数商的最大（最接近正无穷大）整数值
        //一般搭配 Math.floorMod( )使用
        System.out.println(Math.floorDiv(4, -3)); //-2
        System.out.println(4/(-3)); //-1

        //返回a*b+c
        System.out.println(Math.fma(1, 2, 3));
        //
        System.out.println(Math.ulp(2));
        //数学上的signum函数，x < 0 -> y=-1, x>0 -> y=1, x=0 -> y=0
        System.out.println(Math.signum(2));
        //返回平方和的开根号
        System.out.println(Math.hypot(6, 8)); //10
        //返回第二个浮点参数符号和第一个浮点参数的大小组成的数
        System.out.println(Math.copySign(-1, -2));
        //返回两个参数之间的下一个数
        System.out.println(Math.nextAfter(1, 4)); //1.0000001
        System.out.println(Math.nextUp(1));
        //返回d × 2^scaleFactor
        System.out.println(Math.scalb(3, 3)); //24

    }
}
