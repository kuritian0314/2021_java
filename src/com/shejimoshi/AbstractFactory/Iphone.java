package com.shejimoshi.AbstractFactory;

import com.shejimoshi.SimpleFactory.Phone;

/**
 * @author curry
 * @package com.shejimoshi.SimpleFactory
 * @date 2022/2/20 21:54
 * @Version V1.0
 */
public class Iphone implements Phone {
    public Iphone() {

    }
    @Override
    public void make() {
        System.out.println("make iphone!");
    }
}
