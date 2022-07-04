package com.shejimoshi.AbstractFactory;

/**
 * @author curry
 * @package com.shejimoshi.AbstractFactory
 * @date 2022/2/20 22:14
 * @Version V1.0
 */
public class MiPC implements PC {
    public MiPC() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make xiaomi PC!");
    }
}
