package com.hwt.array;

import org.junit.Test;

import java.util.*;

/**
 * @author curry
 * @package com.hwt.array
 * @date 2022/1/7 19:39
 * @Version V1.0
 */
public class TestArray {
    /**
     * 数组的静态初始化
     */
    @Test
    public void testArray() {
        int[] array = new int[]{1, 3, 5, 7, 9};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//
//        }
        for (int i : array) {
            System.out.println(i);
        }

    }

    /**
     * 数组的动态初始化
     */
    @Test
    public void testArray2() {
        Integer[] array2 = new Integer[4];
        array2[0] = 1;
        array2[1] = 4;
        array2[2] = 5;
        array2[3] = 8;
//        for (int i = 0; i < array2.length; i++) {
//            System.out.println(array2[i]);
//        }
//        for (int i : array2) {
//            System.out.println(i);
//        }
        //数组转化为集合，使用的数组工具类Arrays
        List<Integer> list = Arrays.asList(array2);
        System.out.println("list = " + list);

    }

    @Test
    public void testArray3() {
        String[] strs = new String[]{"a", "b", "c", "d"};
        List<String> list = Arrays.asList(strs);
        //list.forEach(System.out::println);
        list.forEach(s -> System.out.println(s));
    }

    @Test
    public void testMap() {
        Map<Long, String> map = new HashMap<>();
        map.put(1L, "aa");
        map.put(2L, "bb");
        map.put(3L, "cc");

        //jdk8新特性
        for (Map.Entry<Long, String> entry : map.entrySet()) {
            System.out.println("entry = {" + entry + "}");
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }

        //map.forEach((k, v) -> System.out.println("key = " + k + ", value = " + v));

//        for (Long key : map.keySet()) {
//            System.out.println("key = " + key + ", value = " + map.get(key));
//        }

        //Iterator<Map.Entry<Long, String>> it = map.entrySet().iterator();
        //while (it.hasNext()) {
        //    Map.Entry<Long, String> entry = it.next();
        //    System.out.println("entry = {" + entry + "}");
        //}

    }

    @Test
    public void testList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);//0
        list.add(1);//1
        list.add(2);//2
        list.add(3);//3
        list.add(4);//4

        System.out.println("list的长度为：" + list.size());

        List<Integer> list2 = new ArrayList<>(list);
        System.out.println("list2的长度为：" + list2.size());

        ListIterator<Integer> it = list2.listIterator();
//        it.add(5);
        while (it.hasNext()) {
            //int index = it.nextIndex();
            int index = it.previousIndex();
            Integer i = it.next();
            System.out.println("index = " + index);
            System.out.println("i = " + i);
        }
    }

    @Test
    public void testListToArray() {
        List<Integer> list = new ArrayList<>();
        list.add(1);//1
        list.add(2);//2
        list.add(3);//3
        list.add(4);//4
        //集合转数组，使用Collections.toArray方法
        Integer[] array = list.toArray(new Integer[0]);
        for (Integer integer : array) {
            System.out.println("转换后的数组为：[" + integer + "]");
        }

    }

}
