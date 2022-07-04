package com.shejimoshi.celvmoshi1;

/**
 * @author curry
 * @package com.shejimoshi.test
 * @date 2022/1/13 15:38
 * @Version V1.0
 */
public enum PayTypeEnum1 implements PayEnum1{

    PAY_TYPE_BALANCE{
        @Override
        public String pay() {
            System.out.println("支付宝余额支付");
            return "支付宝余额支付";
        }
    },
    PAY_TYPE_HUABEI{
        @Override
        public String pay() {
            System.out.println("支付宝花呗支付");
            return "支付宝花呗支付";
        }
    },
    PAY_TYPE_YUEBAO{
        @Override
        public String pay() {
            System.out.println("支付宝余额宝支付");
            return "支付宝余额宝支付";
        }
    };
}
