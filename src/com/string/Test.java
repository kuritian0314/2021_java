package com.string;

/**
 * finally中的return，会覆盖try、catch中的return返回值！！！
 */
public class Test {
    /*    public static int num = 1;

        public static void main(String[] args) throws ParseException {
            int result;
            result = num();
            System.out.println(result);
        }

        private static int num() {
            try {
                int b = 4 / 1;
                return num = num + 2;
            } catch (Exception e) {
                return num = num + 3;
            } finally {
                System.out.println("不管你怎么样，我都是要执行");
                return num = num + 4;
            }
        }*/
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {3, 2, 1, 5, 4};
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
    //快速排序
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = getMiddle(arr, low, high);
            quickSort(arr, low, middle - 1);
            quickSort(arr, middle + 1, high);
        }
    }

    private static int getMiddle(int[] arr, int low, int high) {
        int temp = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= temp) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= temp) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }


}
