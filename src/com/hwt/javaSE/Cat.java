package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/7 20:08
 * @Version V1.0
 */
public class Cat implements Animal {
    int a = 10;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
