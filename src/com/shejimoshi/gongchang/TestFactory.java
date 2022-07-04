package com.shejimoshi.gongchang;

/**
 * @author curry
 * @package com.shejimoshi.gongchang
 * @date 2022/2/12 22:28
 * @Version V1.0
 */
public class TestFactory {
    public static void main(String[] args) {
        FactoryInterface bean1 = BeanFactory.getBean(1);
        bean1.createBean();
        FactoryInterface bean2 = BeanFactory.getBean(2);
        bean2.createBean();
        FactoryInterface bean3 = BeanFactory.getBean(3);
        bean3.createBean();
    }
}
