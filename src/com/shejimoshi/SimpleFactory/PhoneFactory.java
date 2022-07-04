package com.shejimoshi.SimpleFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author curry
 * @package com.shejimoshi.SimpleFactory
 * @date 2022/2/20 21:55
 * @Version V1.0
 */
//简单工厂模式：在工厂中初始化Bean对象，并提供了一个获取Bean对象的方法。通过工厂，来创建Bean并获取Bean！
    //是通过传入的参数来获取Bean的方式，如String类型的参数。
public class PhoneFactory {
    /*   public Phone makePhone(String phoneType) {
           if (phoneType.equalsIgnoreCase("MiPhone")) {
               return new MiPhone();
           } else if (phoneType.equalsIgnoreCase("iphone")) {
               return new Iphone();
           }
           return null;
       }*/
    private static Map<String, Phone> map = new HashMap<>();

    static {
        map.put("1", new Iphone());
        map.put("2", new MiPhone());
    }

    public Phone makePhone(String phoneType) {
        return map.get(phoneType);
    }
}
