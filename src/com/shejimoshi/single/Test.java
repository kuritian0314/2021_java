package com.shejimoshi.single;

/**
 * @author curry
 * @package com.shejimoshi.single
 * @date 2022/5/30 10:22
 * @Version V1.0
 */
public class Test {

    private enum singleHolder {
        INSTANCE;
        private static final Test instance = new Test();
    }

    private Test() {

    }

    public static Test getInstance() {
        return singleHolder.instance;
    }

    public static void main(String[] args) {
       Test test = Test.getInstance();
        System.out.println(test);
    }

}
