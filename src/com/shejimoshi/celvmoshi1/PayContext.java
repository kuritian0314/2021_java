package com.shejimoshi.celvmoshi1;

/**
 * @author curry
 * @package com.shejimoshi.test
 * @date 2022/1/13 15:46
 * @Version V1.0
 */
public class PayContext {
    private PayStrategy payStrategy;

    public PayContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public String executeStrategy(){
        return payStrategy.pay();
    }
}
