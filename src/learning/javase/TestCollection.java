package learning.javase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author curry
 * @package learning.javase
 * @date 2022/4/13 3:09
 * @Version V1.0
 */
public class TestCollection {
    public static void main(String[] args) {
/*        // 创建集合
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        // 向集合中添加元素
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");

        // 获取集合中的元素
        System.out.println(map.get("1"));
        System.out.println(map.get("2"));
        System.out.println(map.get("3"));

        // 获取集合中的所有元素
        System.out.println(map.values());

        // 获取集合中的所有键
        System.out.println(map.keySet());

        // 获取集合中的所有键值对
        System.out.println(map.entrySet());

        // 判断集合是否为空
        System.out.println(map.isEmpty());

        // 判断集合中是否包含某个元素
        System.out.println(map.containsKey("1"));

        // 判断集合中是否包含某个元素
        System.out.println(map.containsValue("a"));

        // 删除集合中的某个元素
        map.remove("1");

        // 清空集合
        map.clear();*/

/*        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        // 迭代集合中的元素
        for (String s : set) {
            System.out.println(s);
        }

        //迭代器遍历
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        //创建集合
        List<String> list = new ArrayList<>();
        //向集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");

        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("e");

        //求交集
        list.retainAll(list1);
        System.out.println(list);
        System.out.println("===========================");
        //求并集
        list.addAll(list1);
        System.out.println(list);
        System.out.println("===========================");
        //求差集
        list.removeAll(list1);
        System.out.println(list);

    }
}
