package com.hwt.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author curry
 * @package com.hwt.collection
 * @date 2022/1/14 14:02
 * @Version V1.0
 */
public class Test_01 {
    @Test
    public void test() {
        /**
         * i++和++i的区别：一个先加，一个后加。
         */
        int i = 1;
        System.out.println(i);
//        int j = i++;
//        System.out.println(j);
        int k = ++i;
        System.out.println(k);
//        System.out.println(i++);
//        System.out.println(++i);
        System.out.println(i);
    }

    @Test
    public void test1() {
        TreeSet<Integer> set = new TreeSet<>();
        TreeSet<Integer> subSet = new TreeSet<>();
        for (int i = 606; i < 613; i++) {
            if (i % 2 == 0) {
                set.add(i);
            }
        }

        subSet = (TreeSet<Integer>) set.subSet(608, true, 611, true);
        set.add(609);
        System.out.println(set + " " + subSet);
    }

    @Test
    public void test2() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "aa");
        map.put("2", "bb");
        map.put("3", "cc");
        map.put("4", "dd");

//        map.forEach((k, v) -> System.out.println(k + "==" + v));

//        Set set = map.keySet();
//        System.out.println(set);
//
//        Collection collection = map.values();
//        System.out.println(collection);

//        for (Map.Entry entry : map.entrySet()) {
//            System.out.println(entry);
//            System.out.println(entry.getKey() + "==" + entry.getValue());
//        }

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            if ("1".equals(entry.getKey())) {
                iterator.remove();
                continue;
            }
            System.out.println(entry.getKey() + "==" + entry.getValue());
        }

    }
}
