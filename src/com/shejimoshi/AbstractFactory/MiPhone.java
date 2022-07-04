package com.shejimoshi.AbstractFactory;

import com.shejimoshi.SimpleFactory.Phone;

/**
 * @author curry
 * @package com.shejimoshi.SimpleFactory
 * @date 2022/2/20 21:53
 * @Version V1.0
 */
public class MiPhone implements Phone {
    public MiPhone() {

    }
    @Override
    public void make() {
        System.out.println("make xiaomi phone!");
    }
}
