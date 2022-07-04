package com.hwt.sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author curry
 * @package com.hwt.sort
 * @date 2022/1/5 19:30
 * @Version V1.0
 */
public class TestArray1 {
    public static void main(String[] args) {
        String[] string = {"a", "b", null, "", "c", "a", null};
        System.out.println("转换前：" + Arrays.toString(string));
        string = deleteArrayNull(string);
        System.out.println("转换后：" + Arrays.toString(string));
    }

    private static String[] deleteArrayNull(String[] string) {
        String[] strArr = string;

        // step1: 定义一个list列表，并循环赋值
        ArrayList<String> strList = new ArrayList<String>();
        for (int i = 0; i < strArr.length; i++) {
            strList.add(strArr[i]);
        }

        // step2: 删除list列表中所有的空值
        while (strList.remove(null)) ;
        while (strList.remove("")) ;

        // step3: 把list列表转换给一个新定义的中间数组，并赋值给它
        String strArrLast[] = strList.toArray(new String[strList.size()]);

        return strArrLast;
    }

}
