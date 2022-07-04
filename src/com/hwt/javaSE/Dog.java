package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/7 20:07
 * @Version V1.0
 */
public class Dog implements Animal {
    static int b = 10;
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
