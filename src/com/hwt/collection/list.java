package com.hwt.collection;

import com.hwt.entity.News;
import org.junit.Test;

import java.util.*;

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

//        for (String s : list) {
//            System.out.println(s);
//        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }

    @Test
    public void test1() {
        List<News> list = new ArrayList<>();
        list.add(new News(1, "English", "curry"));
        list.add(new News(2, "Math", "tmc"));
        list.add(new News(3, "yuwen", "green"));
        // 增强for循环变量list集合
        for (News s : list) {
            System.out.println(s.getId() + "," + s.getTitle() + "," + s.getAuthor());
//            System.out.println(s);
        }

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
            System.out.println("{" + s.getId() + "," + s.getTitle() + "," + s.getAuthor() + "}") ;
        }
//        Iterator it = list.listIterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
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

//        for (String str: linkedList) {
//            System.out.println(str);
//        }
        for (String s : linkedList) {
            System.out.println(s);
        }

    }

    @Test
    public void test4() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        String[] my = linkedList.toArray(new String[linkedList.size()]);
        for (int i = 0; i < my.length; i++) {
            System.out.println(my[i]);
        }
    }

}
