package com.hwt.Thread;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author curry
 * @package com.hwt.Thread
 * @date 2021/10/22 20:05
 * @Version V1.0
 */
public class TestMap {
    @Test
    public void test() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aa");
        map.put(2, "bb");
        map.put(3, "cc");

        for (Map.Entry entry : map.entrySet()) {
//            System.out.println(entry);
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }

    @Test
    public void test1() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aa");
        map.put(2, "bb");
        map.put(3, "cc");

        for (Integer key : map.keySet()) {
//            System.out.println("key = " + key + ", value = " + map.get(key));
            System.out.println(key);
        }
        System.out.println("==============");
        for (String value : map.values()) {
            System.out.println(value);
        }
    }

    @Test
    public void test3() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aa");
        map.put(2, "bb");
        map.put(3, "cc");
    }
}
