package com.shejimoshi.FactoryMethod;


/**
 * @author curry
 * @package com.shejimoshi.FactoryMethod
 * @date 2022/2/20 22:05
 * @Version V1.0
 */
//苹果工厂，实现抽象工厂接口，具体去生产苹果手机！
public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new Iphone();
    }
}
