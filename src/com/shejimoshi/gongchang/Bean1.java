package com.shejimoshi.gongchang;

/**
 * @author curry
 * @package com.shejimoshi.gongchang
 * @date 2022/2/12 22:22
 * @Version V1.0
 */
public class Bean1 implements FactoryInterface {
    @Override
    public void createBean() {
        System.out.println("Bean1创建成功");
    }
}
