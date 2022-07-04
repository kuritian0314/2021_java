package com.hwt.javaSE;

import java.util.concurrent.Callable;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/7 21:58
 * @Version V1.0
 */
public class ThreadThree implements Callable {
    @Override
    public Object call() throws Exception {
        return "这是一个callable异步运算结果";
    }
}
