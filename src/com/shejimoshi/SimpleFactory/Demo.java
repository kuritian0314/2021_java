package com.shejimoshi.SimpleFactory;

/**
 * @author curry
 * @package com.shejimoshi.SimpleFactory
 * @date 2022/2/20 21:57
 * @Version V1.0
 */
public class Demo {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();

        Phone miPhone = factory.makePhone("1");
        miPhone.make();

        Phone iphone = factory.makePhone("2");
        iphone.make();
    }
}
