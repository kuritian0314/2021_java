package com.shejimoshi.celvmoshi1;

public enum PayTypeEnum {

    PAY_BALANCE("1",new PayEnumByBalance()),
    PAY_HUABEI("2",new PayEnumByHuabei()),
    PAY_YUEBAO("3",new PayEnumByYuEBAO());

    private String payType;
    private PayEnum payEnum;

    PayTypeEnum(String payType, PayEnum payEnum) {
        this.payType = payType;
        this.payEnum = payEnum;
    }

    public static PayEnum getPay(String payType){
        for (PayTypeEnum payTypeEnum : PayTypeEnum.values()) {
            if (payTypeEnum.payType.equals(payType)) {
                return payTypeEnum.payEnum;
            }
        }
        return new PayEnumByBalance();
    }
}
