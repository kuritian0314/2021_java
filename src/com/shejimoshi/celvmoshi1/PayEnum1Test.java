package com.shejimoshi.celvmoshi1;

/**
 * @author curry
 * @package com.shejimoshi.test
 * @date 2022/1/13 15:39
 * @Version V1.0
 */
public class PayEnum1Test {

    public static void main(String[] args) {
        PayEnum1Test payEnum1Test = new PayEnum1Test();
        payEnum1Test.pay("PAY_TYPE_BALANCE");
        payEnum1Test.pay("PAY_TYPE_HUABEI");
        payEnum1Test.pay("PAY_TYPE_YUEBAO");
    }

    public String pay(String payType){
        return PayTypeEnum1.valueOf(payType).pay();
    }
}
