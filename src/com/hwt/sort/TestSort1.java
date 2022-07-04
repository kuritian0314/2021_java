package com.hwt.sort;

import java.util.ArrayList;

/**
 * @author curry
 * @package com.hwt.sort
 * @date 2022/1/5 11:35
 * @Version V1.0
 */
public class TestSort1 {
    public static void main(String[] args) {
        ArrayList<Entity1> list = new ArrayList<Entity1>();
        list.add(new Entity1("李四", 24));
        list.add(new Entity1("张三", 13));
        list.add(new Entity1("王五", 25));
        System.out.println("排序前：" + list);
        list.sort((o1, o2) -> {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            }
            return 0;
        });
//        List<Entity1> entity1List = list.stream().sorted().collect(Collectors.toList());
        System.out.println("排序后：" + list);

    }
}
