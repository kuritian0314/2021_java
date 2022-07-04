package com.shejimoshi.celvmoshi1;

/**
 * @author curry
 * @package com.shejimoshi.test
 * @date 2022/1/13 15:30
 * @Version V1.0
 */
public class PayDemo {

    public String pay(String payType) {

        String pay = "";
        if ("1".equals(payType)) {
            pay = "支付宝余额支付";
        } else if ("2".equals(payType)) {
            pay = "支付宝余额宝支付";
        } else if ("3".equals(payType)) {
            pay = "支付宝花呗支付";
        } else {
            pay = "其他支付";
        }
        //...
        System.out.println(pay);
        return pay;
    }
}


class PayTest {
    public static void main(String[] args) {
        PayDemo payDemo = new PayDemo();
        payDemo.pay("1");
        payDemo.pay("2");
        payDemo.pay("3");
        payDemo.pay("4");
    }
}
