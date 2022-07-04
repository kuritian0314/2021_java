package com.shejimoshi.FactoryMethod;

/**
 * @author curry
 * @package com.shejimoshi.FactoryMethod
 * @date 2022/2/20 22:03
 * @Version V1.0
 */

//工厂方法模式：定义了一个顶级抽象工厂接口，只能生产一种产品。由其子类工厂实现类去具体生产产品，如苹果工厂，生产苹果手机；小米工厂，生产小米手机！
public interface AbstractFactory {
    Phone makePhone();
}
