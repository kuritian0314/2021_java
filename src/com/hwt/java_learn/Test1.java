package com.hwt.java_learn;

/**
 * @author curry
 * @package com.hwt.java_learn
 * @date 2022/1/14 19:33
 * @Version V1.0
 */
public class Test1 {
    /*
    * 循环遍历二维数组
    *
    * */
    public static void main(String[] args) {
        int[][] b = {{1}, {2, 2}, {2, 2, 2}};
        int sum = 0;
        System.out.println("b.length = " + b.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "].length = " + b[i].length);
            for (int j = 0; j < b[i].length; j++) {
                System.out.println("b[" + i + "][" + j + "] = " + b[i][j]);
                sum += b[i][j];
            }
        }
        System.out.println("sum = " + sum);
    }
}
