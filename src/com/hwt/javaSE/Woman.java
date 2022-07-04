package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/7 21:01
 * @Version V1.0
 */
public class Woman extends Human {
    @Override
    void walk() {
        System.out.println("女人两条腿走路");
    }

    @Override
    void eat() {
        super.eat();
    }
}
