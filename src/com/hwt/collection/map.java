package com.hwt.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class map {
    @Test
    public void testMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("aa", 10);
        map.put("bb", 20);
        map.put("cc", 30);
        map.put("cc", 31);
        map.put("dd", 40);

        System.out.println(map.size());
        System.out.println("------map.keySet()-------");
        //获取所有的Key
        for (String key : map.keySet()) {
            System.out.println("key:" + key + ",value:" + map.get(key));

        }
        //获取所有的value
        for (Integer value : map.values()) {
            System.out.println("value:" + value);
        }
    }

    @Test
    public void testMap1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("aa", 10);
        map.put("bb", 20);
        map.put("cc", 30);
        map.put("dd", 40);

        System.out.println("------获取键值对：map.entrySet()------");
        //获取所有的键值对
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("键值对：" + entry);
            //获取键值对
            System.out.println("键值对：" + entry.getKey() + "==" + entry.getValue());
            //获取键值对的key
            System.out.println("key:" + entry.getKey());
            //获取键值对的value
            System.out.println("value:" + entry.getValue());
        }
    }

    @Test
    public void testMap2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("aa", 10);
        map.put("bb", 20);
        map.put("cc", 30);
        map.put("dd", 40);

//        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
//        System.out.println("-----map.foreach遍历mapJDK1.8新特性-----");
//        map.forEach((key, value) -> {
//            System.out.println("key=" + key + ",value=" + value);
//        });
        map.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v)
        );


//        map.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String k, Integer v) {
//                System.out.println(k + "," + v);
//            }
//        });

    }
}


