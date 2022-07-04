package com.shejimoshi.FactoryMethod;

/**
 * @author curry
 * @package com.shejimoshi.FactoryMethod
 * @date 2022/2/20 22:05
 * @Version V1.0
 */
public class Demo {
    public static void main(String[] arg) {
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        miFactory.makePhone().make();            // make xiaomi phone!

        appleFactory.makePhone().make();        // make iphone!
    }
}
