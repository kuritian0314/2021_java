package com.hwt.collection;

import com.hwt.entity.News;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class list {
    //测试list功能出bug了，已修复
    //2021.9.29 测试了list集合
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("aa");
        list.add("bb");
        list.add("cc");
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void test1() {
        List<News> list = new ArrayList<>();
        list.add(new News(1, "English", "curry"));
        list.add(new News(1, "English", "curry"));
        list.add(new News(2, "Math", "tmc"));
        list.add(new News(2, "Math", "tmc"));
        list.add(new News(3, "yuwen", "green"));
        list.add(new News(3, "yuwen", "green"));
        // 增强for循环变量list集合
        //for (News s : list) {
        //    System.out.println(s.getId() + "," + s.getTitle() + "," + s.getAuthor());
        //    System.out.println(s);
        //}

        // 流API操作
        // 1、过滤
        //List<News> list1 = list.stream().filter(item -> item.getId() > 0).collect(Collectors.toList());
        //System.out.println(list1);

        // 2、计数
        long l = list.stream().filter(news -> news.getId() == 1).count();
        System.out.println(l);

        // 3、聚合map
        //List<Integer> ids = list.stream().map(news -> news.getId()).collect(Collectors.toList());
        //ids.forEach(System.out::println);
        //List<String> strList = list.stream().map(News::getAuthor).collect(Collectors.toList());
        //strList.forEach(System.out::println);

        // 4、从Stream中获取指定数量的元素
        //List<News> newsList = list.stream().limit(1).collect(Collectors.toList());
        //newsList.forEach(System.out::println);

        // 5、去重distinct
        List<News> newsList1 = list.stream().distinct().collect(Collectors.toList());
        newsList1.forEach(System.out::println);

    }

    @Test
    public void test2() {
        List<News> list = new ArrayList<>();
        list.add(new News(1, "English", "curry"));
        list.add(new News(2, "Math", "tmc"));
        list.add(new News(3, "yuwen", "green"));

//        Iterator it = list.iterator();
//        while (it.hasNext()) {
//            News s = (News) it.next();
//            System.out.println(s.getId() + s.getTitle() + s.getAuthor());
//        }

        // list迭代器变量list集合
        ListIterator it = list.listIterator();
        while (it.hasNext()) {
            News s = (News) it.next();
            System.out.println(s.getId() + "," + s.getTitle() + "," + s.getAuthor());
        }
    }

    @Test
    public void test3() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");

        System.out.println("链表的第一个元素是：" + linkedList.getFirst());
        System.out.println("链表的最后一个元素是：" + linkedList.getLast());

        for (String str: linkedList) {
            System.out.println(str);
        }

    }

    @Test
    public void test4() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        String[] my = linkedList.toArray(new String[0]);
        for (int i = 0; i < my.length; i++) {
            System.out.println(my[i]);
        }
    }

    @Test
    public void test5() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(3);

        List<String> list3 = new ArrayList<>();

       //boolean b = list.contains(2);
       // boolean b = list.containsAll(list2);
       // System.out.println(b);

        //boolean b2 = list3.isEmpty();
        if (list.isEmpty()) {
            System.out.println("集合为空");
        } else {
            System.out.println("集合不为空");
        }
        //System.out.println(b2);
    }
}
