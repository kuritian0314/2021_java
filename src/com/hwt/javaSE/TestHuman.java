package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/7 21:18
 * @Version V1.0
 */
public class TestHuman {
    public static void main(String[] args) {
        Human woman = new Woman();
        Human man = new Man();

        woman.walk();
        woman.eat();
        man.eat();

    }
}
