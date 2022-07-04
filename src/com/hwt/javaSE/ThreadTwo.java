package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/7 21:46
 * @Version V1.0
 */
public class ThreadTwo implements Runnable {
    @Override
    public void run() {
        System.out.println("这是线程2");
    }
}
