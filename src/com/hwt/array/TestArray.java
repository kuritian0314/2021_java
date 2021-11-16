package com.hwt.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author curry
 * @package com.hwt.array
 * @date 2021/11/5 20:15
 * @Version V1.0
 */
public class TestArray {
   @Test
    public void test() {
       Integer[] arr = {1, 2, 3, 4, 5, 6};
       //使用数组工具类Arrays：数组转字符串，数组转集合
       String newArr = Arrays.toString(arr);
       List<Integer> list = Arrays.asList(arr);
       System.out.println(newArr);
       System.out.println(list);

   }

   @Test
    public void test1() {
       int[] arr = {1, 2, 3, 4, 5, 6};
       //使用for循环遍历数组
       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }
       System.out.println("=====使用增强for循环遍历数组=====");
       for (int i : arr) {
           System.out.println(i);
       }
   }

    @Test
    public void test2() {
       //数组的动态初始化
        Integer[] arr1 = new Integer[4];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        List<Integer> list = Arrays.asList(arr1);
//        Integer[] arr2 = new Integer[];

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    @Test
    public void test3() {
        String[] arr = {"ID", "姓名", "年龄"};
        //数组转集合1
        List<String> list1 = Arrays.asList(arr);
        //定义集合2
        List<String> list2 = new ArrayList<>();
        //在集合2中添加元素
        list2.add("性别");
        list2.add("出生日期");
        //定义集合tileList，将集合1和集合2添加到集合titleList中
        List<String> titleList = new ArrayList<>();
        titleList.addAll(list1);
        titleList.addAll(list2);
        //将集合titleList转化为新的数组newArr
        String[] newArr = titleList.toArray(new String[titleList.size()]);
        //使用Arrays.toString()方法将数组newArr转化为字符串并打印
        System.out.println(Arrays.toString(newArr));
    }

    @Test
    public void test4() {
        String[] aArray = new String[5];
        String[] bArray = {"a","b","c", "d", "e"};
        String[] cArray = new String[]{"a","b","c","d","e"};
//        int[] intArray = { 1, 2, 3, 4, 5 };
//        String intArrayString = Arrays.toString(intArray);

        // 直接打印,则会打印出引用对象的Hash值
        // [I@7150bd4d
//        System.out.println(intArray);

        // [1, 2, 3, 4, 5]
//        System.out.println(intArrayString);
        String[] stringArray = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
        boolean b = Arrays.asList(stringArray).contains("a");
        //true
        System.out.println(b);

        int[] intArray = { 1, 2, 3, 4, 5 };
        int[] intArray2 = { 6, 7, 8, 9, 10 };

    }
}
