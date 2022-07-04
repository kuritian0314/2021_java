package com.string;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author curry
 * @package com.string
 * @date 2022/3/15 1:18
 * @Version V1.0
 */
public class Learn1 {
    @Test
    public void test1() {
        Integer i1 = 1;
        Integer i2 = 0;
        Long memberId = 123L;
        String memberIdStr = String.valueOf(memberId);

        StringBuilder sb = new StringBuilder();
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        sb.append(date);
        sb.append(String.format("%02d", i1));
        sb.append(String.format("%02d", i2));
        if (memberIdStr.length() <= 6) {
            sb.append(String.format("%06d", memberId));
        } else {
            sb.append(memberIdStr.substring(memberIdStr.length() - 6));
        }
        System.out.println(sb.toString());
    }
}
