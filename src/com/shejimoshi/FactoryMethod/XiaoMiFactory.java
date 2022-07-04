package com.shejimoshi.FactoryMethod;



/**
 * @author curry
 * @package com.shejimoshi.FactoryMethod
 * @date 2022/2/20 22:04
 * @Version V1.0
 */
//小米工厂，实现抽象工厂，具体去生产小米手机！
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}
