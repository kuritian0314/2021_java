package com.shejimoshi.celvmoshi1;

/**
 * @author curry
 * @package com.shejimoshi.test
 * @date 2022/1/13 15:33
 * @Version V1.0
 */
public class PayEnumByBalance implements PayEnum {
    @Override
    public String pay() {
        System.out.println("支付宝余额支付");
        return "支付宝余额支付";
    }
}
