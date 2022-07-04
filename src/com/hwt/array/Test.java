package com.hwt.array;

/**
 * @author curry
 * @package com.hwt.array
 * @date 2022/4/3 1:52
 * @Version V1.0
 */
public class Test {
    public static void main(String[] args) {
        //去除数组中的空值
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Integer.parseInt(null), Integer.parseInt(null), 11, 12, 13, 14, 15};
        int[] newArr = removeNull(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    private static int[] removeNull(int[] arr) {
        //定义一个新的数组，用来存储去除空值后的数组
        int[] newArr = new int[arr.length];
        //定义一个变量，用来记录新数组的下标
        int index = 0;
        //遍历原数组
        for (int i = 0; i < arr.length; i++) {
            //判断原数组中的元素是否为空
            if (arr[i] != 0) {
                //将原数组中的非空元素放入新数组中
                newArr[index] = arr[i];
                //下标加1
                index++;
            }
        }
        //创建一个新的数组，用来存储去除空值后的数组
        int[] newArr2 = new int[index];
        //定义一个变量，用来记录新数组的下标
        int index2 = 0;
        //遍历新数组
        for (int i = 0; i < newArr.length; i++) {
            //判断新数组中的元素是否为空
            if (newArr[i] != 0) {
                //将新数组中的非空元素放入新数组中
                newArr2[index2] = newArr[i];
                //下标加1
                index2++;
            }
        }
        return newArr2;
    }
}
