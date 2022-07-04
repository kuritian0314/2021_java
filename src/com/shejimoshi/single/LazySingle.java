package com.shejimoshi.single;

/**
 * @author curry
 * @package com.shejimoshi.single
 * @date 2022/2/12 22:37
 * @Version V1.0
 */
public class LazySingle {
    private static LazySingle instance = null;

    private LazySingle() {

    }

    public static LazySingle getInstance() {
        if (instance == null) {
            instance = new LazySingle();
        }
        return instance;
    }
}
