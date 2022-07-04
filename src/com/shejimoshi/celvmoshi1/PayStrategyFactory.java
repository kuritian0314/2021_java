package com.shejimoshi.celvmoshi1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author curry
 * @package com.shejimoshi.test
 * @date 2022/1/13 15:53
 * @Version V1.0
 */

/**
 * 工厂模式+策略模式优化if-else
 */
public class PayStrategyFactory {

    private static Map<String, PayStrategy> payTypeMap = new HashMap<>();

    static {
        payTypeMap.put("1", new PayStrategyByBalance());
        payTypeMap.put("2", new PayStrategyByYuEBAO());
        payTypeMap.put("3", new PayStrategyByHuabei());
        payTypeMap.put("4", new PayStrategyByWeiXin());

    }

    public static PayStrategy getPayType(String payType) {
        return payTypeMap.get(payType);
    }
}

class llPayStrategyFactoryTest {
    public static void main(String[] args) {

        PayContext payContext = new PayContext(PayStrategyFactory.getPayType("1"));
        payContext.executeStrategy();

        PayContext payContext2 = new PayContext(PayStrategyFactory.getPayType("2"));
        payContext2.executeStrategy();

        PayContext payContext3 = new PayContext(PayStrategyFactory.getPayType("3"));
        payContext3.executeStrategy();

        PayContext payContext4 = new PayContext(PayStrategyFactory.getPayType("4"));
        payContext4.executeStrategy();
    }
}
