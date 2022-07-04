package com.hwt.danli;

/**
 * @author curry
 * @package com.hwt.danli
 * @date 2022/4/3 2:55
 * @Version V1.0
 */
public class Test2 {
    public static void main(String[] args) {
    //    //try-catch-finally
    //    try {
    //        //try
    //        System.out.println("try");
    //        int a = 1 / 5;
    //    } catch (Exception e) {
    //        //catch
    //        System.out.println("catch");
    //    } finally {
    //        //finally
    //        System.out.println("finally");
    //    }
    //    System.out.println("end");
    //}

        //finally的return覆盖了try的return、catch的return
        //try的return
        //try
        int a = 1;
        try {
            System.out.println("try");
            return;
        }  catch (Exception e) {
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("end");
    }

}
