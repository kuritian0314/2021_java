package com.shejimoshi.AbstractFactory;

import com.shejimoshi.SimpleFactory.Iphone;
import com.shejimoshi.SimpleFactory.Phone;

/**
 * @author curry
 * @package com.shejimoshi.AbstractFactory
 * @date 2022/2/20 22:18
 * @Version V1.0
 */
//苹果工厂，是抽象工厂的实现类。由子类实现类去具体的生产不同的产品，如生产苹果手机、生产苹果电脑。
public class AppleFactory implements AbstractFactory {

    @Override
    public Phone makePhone() {
        return new Iphone();
    }

    @Override
    public PC makePC() {
        return new MAC() ;
    }
}
