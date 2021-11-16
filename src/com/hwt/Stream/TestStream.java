package com.hwt.Stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author curry
 * @package com.hwt.Stream
 * @date 2021/10/22 22:22
 * @Version V1.0
 */
public class TestStream {

    /**
     * filter过滤
     */
    @Test
    public void test() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //截取所有能被2整除的数据
        List<Integer> collect = integers.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }

    /**
     * distinct去重
     */
    @Test
    public void test1() {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }

    /**
     * sort排序
     */
    @Test
    public void test2() {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person(6, "java", 1, false);
        Person p2 = new Person(7, "cat", 3, true);
        Person p3 = new Person(8, "lee", 2, true);
        Person p4 = new Person(9, "javacat", 3, false);
        Person p5 = new Person(10, "lmy", 3, true);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        List<Integer> integers = Arrays.asList(5, 8, 2, 6, 41, 11);
        //排序默认为顺序 顺序 = [2, 5, 6, 8, 11, 41]
        List<Integer> sorted = integers.stream().sorted().collect(Collectors.toList());
        System.out.println("顺序 = " + sorted);
        //逆序 逆序 = [41, 11, 8, 6, 5, 2]
        List<Integer> reverseOrder = integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("逆序 = " + reverseOrder);
        //也可以接收一个lambda
        List<Person> ages = personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        System.out.println("ages = " + ages);

//        List<Integer> ids = personList.stream().map(person -> person.getId()).collect(Collectors.toList());
//        System.out.println("ids = " + ids);
        List<Integer> ids = personList.stream().map(Person::getAge).collect(Collectors.toList());
        System.out.println("ids = " + ids);
//        List<Integer> ages1 = personList.stream().filter(person -> person.getSex().equals(true)).map(item -> item.getAge()).collect(Collectors.toList());
//        System.out.println(ages1);
        List<Person> personList1 = personList.stream().filter(item -> item.getSex().equals(false)).map(item -> {
            if (item.getAge() > 2) {
                return item;
            }
            return null;
        }).collect(Collectors.toList());
        System.out.println(personList1);
    }

    /**
     * limit截取
     */
    @Test
    public void test3() {
        List<Integer> integers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        //截取流中的前三个元素 collect = [1, 2, 1]
        List<Integer> collect = integers.stream().limit(3).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }

    /**
     * 用collect方法将list转成map
     */
    @Test
    public void test4() {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person(6, "java", 1, false);
        Person p2 = new Person(7, "cat", 3, true);
        Person p3 = new Person(8, "lee", 2, true);
        Person p4 = new Person(9, "javacat", 3, false);
        Person p5 = new Person(10, "lmy", 3, true);
        Collections.addAll(personList, p1, p2, p3, p4, p5);
        System.out.println(personList);

//        Map<Integer, Person> map = personList.stream().collect(Collectors.toMap(person -> person.getId(), person -> person));
//        System.out.println(map);
        Map<String, Person> map1 = personList.stream().collect(Collectors.toMap(person -> person.getName(), person -> person));
        System.out.println(map1);
    }

    @Test
    public void test5() {
        List<String> arr1 = new ArrayList<>();
        List<Person> arr2 = new ArrayList<>();
        Person p1 = new Person(6, "java", 1, false);
        Person p2 = new Person(7, "cat", 3, true);
        Person p3 = new Person(8, "lee", 2, true);
        Person p4 = new Person(9, "javacat", 3, false);
        Person p5 = new Person(10, "lmy", 3, true);

        Collections.addAll(arr1, "1.html", " 2.html", "3.html", "lib", "99.html");
        Collections.addAll(arr2, p1, p2, p3, p4, p5);
//        List<String> collect = arr1.stream().map(String::trim).collect(Collectors.toList());
//        System.out.println(collect);
//
//        List<Integer> collect2 = arr1.stream().map(String::length).collect(Collectors.toList());
//        System.out.println(collect2);
//
//        List<Boolean> collect3 = arr1.stream().map(Objects::isNull).collect(Collectors.toList());
//        System.out.println(collect3);

//        List<String> collect4 = arr1.stream().map((pre) -> {
//            pre = pre + "ssss";
//            return pre;
//        }).collect(Collectors.toList());
//        System.out.println(collect4);
//
//        List<String> collect5 = arr1.stream().map(pre ->
//                pre = pre + "ssss").collect(Collectors.toList());
//        System.out.println(collect5);

        List<String> nameList = arr2.stream().map(Person::getName).collect(Collectors.toList());
//        System.out.println(nameList);
        System.out.println("nameList = " + nameList);

        List<Person> personList = arr2.stream().map((pre) -> {
                    pre.setAge(18);
                    if (pre.getName() != "lmy") {
                        pre.setName("java");
                    }
                    return pre;
                }
        ).collect(Collectors.toList());
        System.out.println("personList = " + personList);

        List<String> stringList = arr1.stream().map((str) -> {
            if (str.endsWith(".html")) {
                return str.replace(".html", "").trim();
            } else {
                return null;
            }
        }).collect(Collectors.toList());
        System.out.println("stringList = " + stringList);

        List<String> stringList1 = arr1.stream().filter(str -> str.endsWith(".html")).map((str) -> {
            if (str.endsWith(".html")) {
                return str.replace(".html", "").trim();
            } else {
                return null;
            }
        }).collect(Collectors.toList());
        System.out.println("stringList1 = " + stringList1);
    }
}
