package com.shejimoshi.AbstractFactory;

import com.shejimoshi.SimpleFactory.Phone;

/**
 * @author curry
 * @package com.shejimoshi.AbstractFactory
 * @date 2022/2/20 22:16
 * @Version V1.0
 */
//抽象工厂模式：定义了一个顶级抽象工厂接口，用来生产多种产品，而不是只生产一种产品。如生产手机、生产电脑。
public interface AbstractFactory {
    Phone makePhone();

    PC makePC();
}
