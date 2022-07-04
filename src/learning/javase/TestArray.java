package learning.javase;

/**
 * @author curry
 * @package learning.javase
 * @date 2022/4/13 3:04
 * @Version V1.0
 */
public class TestArray {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = new int[5];
        // 赋值
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        // 打印
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("===========================");
        // 循环输出
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("===========================");
        int[] arr2 = {1, 2, 3, 4, 5};
        for (int i : arr2) {
            System.out.println(i);
        }
        //数组的反转
        System.out.println("===========================");
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.println(arr2[i]);
        }
    }
}
