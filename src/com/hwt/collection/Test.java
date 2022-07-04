package com.hwt.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author curry
 * @package com.hwt.collection
 * @date 2022/1/14 13:54
 * @Version V1.0
 */
public class Test {
    public static void main(String[] args) {
//        Object o = new Object();
//        /**
//         * 测试ArrayList和LinkedList的插入效率，得到：在插入大量数据的情况下，LinkedList插入效率远远大于ArrayList！！！
//         */
//        List aList = new ArrayList<>();
//        List bList = new LinkedList();
//
//        long t1 = System.currentTimeMillis();
//        for (int i = 0; i < 500000; i++) {
//            aList.add(0, o);
//        }
//
//        long t2 = System.currentTimeMillis() - t1;
//        System.out.println(t2);
//
//        t1 = System.currentTimeMillis();
//        for (int i = 0; i < 500000; i++) {
//            bList.add(0, o);
//        }
//
//        long t3 = System.currentTimeMillis() - t1;
//        System.out.println(t3);
//    }
        Object o = new Object();
        List arrayList = new ArrayList<>();
        List linkedList = new LinkedList<>();
        //arrayList插入开始前
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            arrayList.add(0, o);
        }
        //arrayList插入结束后
        long t2 = System.currentTimeMillis() - t1;
        //arrayList插入花费的时间：
        System.out.println("arrayList插入花费的时间：" + t2);

        long t3 = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            linkedList.add(0, o);
        }
        long t4 = System.currentTimeMillis() - t3;
        System.out.println("linkedList插入花费的时间: " + t4);

    }
}
