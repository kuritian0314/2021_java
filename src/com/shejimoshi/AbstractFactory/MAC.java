package com.shejimoshi.AbstractFactory;

/**
 * @author curry
 * @package com.shejimoshi.AbstractFactory
 * @date 2022/2/20 22:15
 * @Version V1.0
 */
public class MAC implements PC {
    public MAC() {
        this.make();
    }
    @Override
    public void make() {
        System.out.println("make MAC!");
    }
}
