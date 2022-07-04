package com.shejimoshi.AbstractFactory;

public class Demo {
    public static void main(String[] arg) {
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();

        miFactory.makePhone().make();            // make xiaomi phone!
        miFactory.makePC().make();                // make xiaomi PC!
        appleFactory.makePhone().make();        // make iphone!
        appleFactory.makePC().make();            // make MAC!
    }
}