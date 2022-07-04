package com.hwt.date;

import java.util.Date;

//日期测试
public class TestDate {
    //日期测试
    //2021.9.28添加
    public static void main(String[] args) {
        Long timeStamp = System.currentTimeMillis();
        System.out.println(timeStamp.intValue());
        Date date = new Date();
        System.out.println("date = " + date);
    }
}
