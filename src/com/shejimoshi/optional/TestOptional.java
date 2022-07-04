package com.shejimoshi.optional;

import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * @author curry
 * @package com.shejimoshi.optional
 * @date 2022/3/27 16:46
 * @Version V1.0
 */
public class TestOptional {
    @Test(expected = NoSuchElementException.class)
    public void whenCreateEmptyOptional_thenNull() {
        Optional<User> emptyOpt = Optional.empty();
        emptyOpt.get();// 没有值 将会抛出异常
    }

    @Test(expected = NullPointerException.class)
    public void test_of() {
        User user = null;
        Optional<User> optional = Optional.of(user);
    }

    @Test
    public void test_ofNuLLAble() {
        User user = null;
        Optional<User> optional = Optional.ofNullable(user);
        optional.orElse(new User());
        // 一般不使用 optional.get();
    }
}
