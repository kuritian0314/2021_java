package com.shejimoshi.zerenlian;

/**
 * @author curry
 * @package com.shejimoshi.zerenlian
 * @date 2022/2/12 22:19
 * @Version V1.0
 */
public class TestZerenlian {
    public static void main(String[] args) {
        ApplicationContext application = new ApplicationContext();
        application.createChain();
        application.responseClient(60);
        application.responseClient(90);
        application.responseClient(200);
    }
}
