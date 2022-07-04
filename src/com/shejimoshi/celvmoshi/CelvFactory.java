package com.shejimoshi.celvmoshi;

import java.util.HashMap;
import java.util.Map;

/**
 * @author curry
 * @package com.shejimoshi.celvmoshi
 * @date 2022/2/12 22:05
 * @Version V1.0
 */
public class CelvFactory {
    private static Map<String, Celvmoshi> map = new HashMap<>();

    static {
        map.put("1", new PayA());
        map.put("2", new PayB());
        map.put("3", new PayC());
        map.put("4", new PayD());
    }

    public static Celvmoshi getCelvmoshiByType(String type) {
        return map.get(type);
    }
}
