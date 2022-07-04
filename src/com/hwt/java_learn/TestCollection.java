package com.hwt.java_learn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2022/3/29 17:50
 * @Version V1.0
 */
public class TestCollection {
    @Test
    public void testList() {
        String[] strings = {"a", "b", "c", "c", "d", "d"};
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        List<String> list1 = new LinkedList<>(Arrays.asList(strings));

        List<String> list2 = list.stream().distinct().collect(Collectors.toList());
        int count = (int) list.stream().count();
        int count1 = (int) list2.stream().count();
        list2.forEach(System.out::println);
        System.out.println(count);
        System.out.println(count1);
        System.out.println("=======================");
        list1.forEach(System.out::println);
    }

    @Test
    public void testStream() {
        Integer[] integers = {9, 5, 2, 7, 4, 3, 8, 1, 4, 2, 8};
        List<Integer> list =  Arrays.asList(integers);
        System.out.println("原列表：==========");
        list.forEach(System.out::println);

        System.out.println("排序后：==========");
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        System.out.println("去重后：==========");
        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        distinctList.forEach(System.out::println);
    }

    @Test
    public void testStream1() {
        String[] strings = {"a", "d", "c", "e", "e", "", ""};
        String[] strings1 = {"a", "d", "c"};
        List<String> list = Arrays.asList(strings);
        List<String> list1 = Arrays.asList(strings1);
        //List<String> list2 = list.stream().filter().collect(Collectors.toList());
        System.out.println("求两个集合的交集：");
        //list2.forEach(System.out::println);

        System.out.println("排除空的集合列表：");
        list.stream().filter(s -> !s.equals("")).collect(Collectors.toList()).forEach(System.out::println);
    }


}
