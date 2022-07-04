package com.shejimoshi.celvmoshi1;

/**
 * @author curry
 * @package com.shejimoshi.test
 * @date 2022/1/13 15:47
 * @Version V1.0
 */
public class PayStrategyByBalance implements PayStrategy {
    @Override
    public String pay() {
        System.out.println("支付宝余额支付");
        return "支付宝余额支付";
    }
}

class PayStrategyByHuabei implements PayStrategy {
    @Override
    public String pay() {
        System.out.println("支付宝花呗支付");
        return "支付宝花呗支付";
    }
}

class PayStrategyByYuEBAO implements PayStrategy {
    @Override
    public String pay() {
        System.out.println("支付宝余额宝支付");
        return "支付宝余额宝支付";
    }
}

class PayStrategyByWeiXin implements PayStrategy {
    @Override
    public String pay() {
        System.out.println("微信支付");
        return "微信支付";
    }
}

class PayStrategyTest {

    public static void main(String[] args) {
        PayStrategyTest payStrategyTest = new PayStrategyTest();
        payStrategyTest.method("1");
        payStrategyTest.method("2");
        payStrategyTest.method("3");
        payStrategyTest.method("4");
        payStrategyTest.method("5");
    }

    public void method(String payType){

        PayContext payContext;
        if ("1".equals(payType)){
            payContext = new PayContext(new PayStrategyByHuabei());
            payContext.executeStrategy();

        }else if ("2".equals(payType)){
            payContext = new PayContext(new PayStrategyByYuEBAO());
            payContext.executeStrategy();

        } else if ("3".equals(payType)) {
            payContext = new PayContext(new PayStrategyByBalance());
            payContext.executeStrategy();

        } else {
            payContext = new PayContext(new PayStrategyByWeiXin());
            payContext.executeStrategy();
        }
    }

}