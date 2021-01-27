package com.silentsunshine.common.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/1/27 - 01 - 27 - 9:00
 * @description practice com.silentsunshine.common.date
 */
public class BirthdayTest {
    public static void main(String[] args) {
        System.out.println("Please input your birthday.(eg,1972-11-20)");
        Scanner scanner = new Scanner(System.in);
        String birthday = scanner.nextLine();
        scanner.close();
        try {
            System.out.println(BirthdayTest.lives(birthday));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    /**
     * 该方法返回给定日期到目前为止生存的天数
     * @param birthday 日期，eg：1972-11-20
     * @return string
     * @throws ParseException，输入字符串不符合规定时，抛出异常
     */
    private static String lives(String birthday) throws ParseException {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date bir = simpleDateFormat.parse(birthday);
        long liveDate = now.getTime() - bir.getTime();
        liveDate = liveDate/1000/60/60/24;
        return String.format("You have lived %d days.", liveDate);
    }

}
