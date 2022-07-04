package com.hwt.javaSE;

import java.util.ArrayList;
import java.util.List;

/**
 * @author curry
 * @package com.hwt.javaSE
 * @date 2022/2/13 9:38
 * @Version V1.0
 */
public class Learning01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(1);
        nums.add(6);
        nums.add(0, 4);
        System.out.println(nums);
        nums.remove(1);
        System.out.println(nums);
    }
}
