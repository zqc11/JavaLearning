package com.silentsunshine.common.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/1/27 - 01 - 27 - 8:48
 * @description practice com.silentsunshine.common.date
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = simpleDateFormat.format(date);
        System.out.println(dateString);

    }
}
