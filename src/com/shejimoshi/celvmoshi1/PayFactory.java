package com.shejimoshi.celvmoshi1;

import java.util.HashMap;
import java.util.Map;

public interface PayFactory {
    String pay();
}

class PayFactoryByBalance implements PayFactory {

    @Override
    public String pay() {
        System.out.println("支付宝余额支付");
        return "支付宝余额支付";
    }
}

class PayFactoryByHuabei implements PayFactory {

    @Override
    public String pay() {
        System.out.println("支付宝花呗支付");
        return "支付宝花呗支付";
    }
}

class PayFactoryByYuEBAO implements PayFactory {

    @Override
    public String pay() {
        System.out.println("支付宝余额宝支付");
        return "支付宝余额宝支付";
    }
}

class PayFactoryByYunShanFu implements PayFactory {

    @Override
    public String pay() {
        System.out.println("云闪付支付");
        return "云闪付支付";
    }
}

class PayTypeFactory {

    private static Map<String, PayFactory> payTypeMap = new HashMap<>();

    static {
        payTypeMap.put("1", new PayFactoryByBalance());
        payTypeMap.put("2", new PayFactoryByHuabei());
        payTypeMap.put("3", new PayFactoryByYuEBAO());
        payTypeMap.put("4", new PayFactoryByYunShanFu());
    }

    public static PayFactory getPayType(String payType) {
        return payTypeMap.get(payType);
    }

}

class PayFactoryTest {
    public static void main(String[] args) {
        PayTypeFactory.getPayType("1").pay();
        PayTypeFactory.getPayType("2").pay();
        PayTypeFactory.getPayType("3").pay();
        PayTypeFactory.getPayType("4").pay();
    }
}
