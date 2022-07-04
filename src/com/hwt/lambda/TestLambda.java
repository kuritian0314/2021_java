package com.hwt.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * create by weihua on 2022/3/22
 */
public class TestLambda {
    public static void main(String[] args) {
        //lambda表达式遍历集合
        List<Student> studentList = gen();
        studentList.forEach(a -> System.out.println(a.getId() + ":" + a.getName()));
        //lambda表达式排序
        studentList.sort((a, b) -> a.getName().compareTo(b.getName()));
        studentList.forEach(a -> System.out.println(a.getId() + ":" + a.getName()));
        //lambda表达式删除元素
        studentList.removeIf(a -> a.getId().equals("2"));
        studentList.forEach(a -> System.out.println(a.getId() + ":" + a.getName()));
        //lambda表达式查找元素
        Student student = studentList.stream().filter(a -> a.getId().equals("1")).findFirst().get();
        System.out.println(student.getId() + ":" + student.getName());
        //lambda表达式查找元素
        Student student1 = studentList.stream().filter(a -> a.getId().equals("1")).findAny().get();
        System.out.println(student1.getId() + ":" + student1.getName());
        //lambda表达式查找元素
        Student student2 = studentList.stream().filter(a -> a.getId().equals("1")).findAny().orElse(new Student("1", "curry"));
        System.out.println(student2.getId() + ":" + student2.getName());
        //lambda表达式查找元素
        Student student3 = studentList.stream().filter(a -> a.getId().equals("1")).findAny().orElseGet(() -> new Student("1", "curry"));
        System.out.println(student.getId() + ":" + student.getName());
        //lambda表达式查找元素
        Student student4 = studentList.stream().filter(a -> a.getId().equals("1")).findAny().orElseThrow(() -> new RuntimeException("没有找到"));
        System.out.println(student.getId() + ":" + student.getName());
        //lambda表达式查找元素
        Student student5 = studentList.stream().filter(a -> a.getId().equals("1")).findAny().orElseGet(() -> new Student("1", "curry"));
        System.out.println(student.getId() + ":" + student.getName());
    }

    private static List<Student> gen() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("1", "curry"));
        list.add(new Student("2", "green"));
        return list;
    }
}
