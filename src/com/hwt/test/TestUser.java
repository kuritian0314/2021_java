package com.hwt.test;

import com.hwt.entity.User;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestUser {
    public static void main(String[] args) {
        Map<User, Integer> userHashMap = new HashMap<User, Integer>();
        User user1 = new User(1L, "Jay", 21);
        User user2 = new User(2L, "Jolin", 21);
        User user3 = new User(3L, "Jack Cheng", 22);
        User user4 = new User(4L, "Bruce Lee", 22);
        userHashMap.put(user1, 100);
        userHashMap.put(user2, 200);
        userHashMap.put(user3, 300);
        userHashMap.put(user4, 400);

        System.out.println(userHashMap);

        Map<User, Integer>  userTreeMap = new TreeMap<User, Integer>();
        userTreeMap.put(user1, 100);
        userTreeMap.put(user2, 200);
        userTreeMap.put(user3, 300);
        userTreeMap.put(user4, 400);

        System.out.println(userTreeMap);
    }
}
