package com.shejimoshi.celvmoshi1;

/**
 * @author curry
 * @package com.shejimoshi.test
 * @date 2022/1/13 15:36
 * @Version V1.0
 */
public class PayEnumTest {
    public static void main(String[] args) {

        PayEnum payEnum = PayTypeEnum.getPay("1");
        payEnum.pay();
        PayEnum payEnum1 = PayTypeEnum.getPay("2");
        payEnum1.pay();
        PayEnum payEnum2 = PayTypeEnum.getPay("3");
        payEnum2.pay();
    }
}
