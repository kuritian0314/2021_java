package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/7 20:59
 * @Version V1.0
 */
public class Man extends Human {
    @Override
    void walk() {
        System.out.println("男人三条腿走路");
    }

    void sing() {
        System.out.println("男人会唱歌");
    }

    void eat() {
        System.out.println("男人偷吃");
    }
}
