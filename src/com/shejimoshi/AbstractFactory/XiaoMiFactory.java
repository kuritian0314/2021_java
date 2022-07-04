package com.shejimoshi.AbstractFactory;

import com.shejimoshi.SimpleFactory.MiPhone;
import com.shejimoshi.SimpleFactory.Phone;

/**
 * @author curry
 * @package com.shejimoshi.AbstractFactory
 * @date 2022/2/20 22:17
 * @Version V1.0
 */
//小米工厂，是抽象工厂的实现类。由子类实现类去具体的生产不同的产品，如生产小米手机、生产小米电脑。
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }

    @Override
    public PC makePC() {
        return new MiPC();
    }
}
