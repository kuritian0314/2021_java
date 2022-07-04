package com.hwt.javaSE;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/1/7 21:47
 * @Version V1.0
 */
public class TestThread {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
//       ThreadTwo t2 = new ThreadTwo();
//
        t1.setName("线程1");
        t1.start();
        System.out.println("当前线程的名字是: " +t1.getName());


    }
}
