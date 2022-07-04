package com.shejimoshi.single;

/**
 * @author curry
 * @package com.shejimoshi.single
 * @date 2022/2/12 22:40
 * @Version V1.0
 */
public class JiaSuoSingle {
    private volatile static JiaSuoSingle instance = null;

    private JiaSuoSingle() {

    }

    public static JiaSuoSingle getInstance() {
        if (instance == null) {
            synchronized (JiaSuoSingle.class) {
                if (instance == null) {
                    instance = new JiaSuoSingle();
                }
            }
        }
        return instance;
    }
}
