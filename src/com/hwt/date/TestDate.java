package com.hwt.date;

import com.hwt.entity.User;

//日期测试
public class TestDate {
    //日期测试
    //2021.9.28添加
    public static void main(String[] args) {
        User user = new User();
        user.getId(1L);
        user.getAge(18);
        user.getName("张三");

        System.out.println(user);





    }
}
