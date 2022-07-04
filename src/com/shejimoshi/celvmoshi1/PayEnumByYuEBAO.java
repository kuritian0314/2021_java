package com.shejimoshi.celvmoshi1;

/**
 * @author curry
 * @package com.shejimoshi.test
 * @date 2022/1/13 15:34
 * @Version V1.0
 */
public class PayEnumByYuEBAO implements PayEnum {
    @Override
    public String pay() {
        System.out.println("支付宝余额宝支付");
        return "支付宝余额宝支付";
    }
}
