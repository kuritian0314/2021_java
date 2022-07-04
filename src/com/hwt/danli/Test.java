package com.hwt.danli;

import java.util.*;

/**
 * @author curry
 * @package com.hwt.danli
 * @date 2022/4/3 2:15
 * @Version V1.0
 */
public class Test {
    public static void main(String[] args) {
        //    Map<Integer, String> map = new HashMap<>();
        //    map.put(1, "1");
        //    map.put(2, "2");
        //    map.put(3, "3");
        //
        //    map.forEach((k, v) -> System.out.println(k + ":" + v));
        //    System.out.println("==========================");
        //    //for循环遍历map
        //    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        //        System.out.println(entry.getKey() + ":" + entry.getValue());
        //    }
        //
        //    System.out.println("==========================");
        //    //迭代器遍历map
        //    Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        //    while (iterator.hasNext()) {
        //        Map.Entry<Integer, String> entry = iterator.next();
        //        System.out.println(entry.getKey() + ":" + entry.getValue());
        //    }
        //
        //    System.out.println("==========================");
        //    //keySet()遍历map
        //    for (Integer key : map.keySet()) {
        //        System.out.println(key + ":" + map.get(key));
        //    }
        //}

        //遍历Set
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        for (Integer integer : set) {
            System.out.println(integer);
        }

        //ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        //LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);

        for (Integer integer : linkedList) {
            System.out.println(integer);
        }
    }
}