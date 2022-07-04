package com.shejimoshi.celvmoshi;

/**
 * @author curry
 * @package com.shejimoshi.celvmoshi
 * @date 2022/2/12 22:09
 * @Version V1.0
 */
public class TestCelvm {
    public static void main(String[] args) {
        CelvContext context = new CelvContext(CelvFactory.getCelvmoshiByType("1"));
        String a = context.executeCelv();
        System.out.println(a);

        CelvContext context1 = new CelvContext(CelvFactory.getCelvmoshiByType("2"));
        String b = context1.executeCelv();
        System.out.println(b);

        CelvContext context2 = new CelvContext(CelvFactory.getCelvmoshiByType("3"));
        String c = context2.executeCelv();
        System.out.println(c);

        CelvContext context3 = new CelvContext(CelvFactory.getCelvmoshiByType("4"));
        String d = context3.executeCelv();
        System.out.println(d);
    }


}
