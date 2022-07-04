package com.shejimoshi.gongchang;

import java.util.HashMap;
import java.util.Map;

/**
 * @author curry
 * @package com.shejimoshi.gongchang
 * @date 2022/2/12 22:24
 * @Version V1.0
 */
public class BeanFactory {
    private static Map<Integer, FactoryInterface> map = new HashMap<>();

    static {
        map.put(1, new Bean1());
        map.put(2, new Bean2());
        map.put(3, new Bean3());
    }

    public static FactoryInterface getBean(Integer type) {
        return map.get(type);
    }
}
