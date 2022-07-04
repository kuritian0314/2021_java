package com.hwt.date;

import java.util.Date;

/**
 * @author curry
 * @package com.hwt.date
 * @date 2022/1/14 16:49
 * @Version V1.0
 */
public class Test extends Date {
    public static void main(String[] args) {
        new Test().test();
    }

    public void test() {
        //获取当前类的类名
        System.out.println(super.getClass().getName());
        //获取当前类的父类的类名
        System.out.println(getClass().getSuperclass().getName());
    }
}
