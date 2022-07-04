package com.string;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author curry
 * @package com.string
 * @date 2022/3/15 1:33
 * @Version V1.0
 */
public class Learn2 {
    public static void main(String[] args) {
        Learn2 learn2 = new Learn2();
        String result = learn2.test1();
        System.out.println(result);
    }

    private String test1() {
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
        return sb.toString();
    }
}
