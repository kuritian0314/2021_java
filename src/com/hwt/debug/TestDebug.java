package com.hwt.debug;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author curry
 * @package com.hwt.debug
 * @date 2022/1/16 18:09
 * @Version V1.0
 */
public class TestDebug {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (isInterested(random.nextInt(10))) {
                count++;
            }
        }
        System.out.printf("Found %d interested values%n", count);
    }

    private static boolean isInterested(int i) {
        //0 2 4 6 8
        return i % 2 == 0;
    }
}
