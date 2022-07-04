package com.shejimoshi.gongchang;

/**
 * @author curry
 * @package com.shejimoshi.gongchang
 * @date 2022/2/12 22:24
 * @Version V1.0
 */
public class Bean3 implements FactoryInterface {
    @Override
    public void createBean() {
        System.out.println("Bean3创建成功");
    }
}
