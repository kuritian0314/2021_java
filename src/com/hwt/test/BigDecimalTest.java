package com.hwt.test;

import java.math.BigDecimal;

/**
 * @author curry
 * @package com.hwt.test
 * @date 2021/10/10 11:20
 * @Version V1.0
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal v1 = new BigDecimal(100.1);
        BigDecimal v2 = new BigDecimal(200);

        BigDecimal v3 = v1.add(v2);
        System.out.println(v3);

        BigDecimal v4 = v1.multiply(v2);
        System.out.println(v4);

    }
}
