package learning.javase;

/**
 * @author curry
 * @package learning.javase
 * @date 2022/5/7 2:12
 * @Version V1.0
 */
public class TestException {
    public static void main(String[] args) {
        //try {
        //    throw new Exception("异常");
        //} catch (Exception e) {
        //    e.printStackTrace();
        //}finally {
        //    System.out.println("finally");
        //}

        //测试数组越界异常
   /*     try {
            int[] arr = new int[2];
            arr[0] = 1;
            arr[1] = 2;
            arr[3] = 3;
            System.out.println(arr[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //自定义异常
        try {
            throw new MyException("自定义异常");
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    private static class MyException extends Throwable {
        public MyException(String 自定义异常) {
            super(自定义异常);
        }
    }
}
