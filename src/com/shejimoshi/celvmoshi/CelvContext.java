package com.shejimoshi.celvmoshi;

/**
 * @author curry
 * @package com.shejimoshi.celvmoshi
 * @date 2022/2/12 22:08
 * @Version V1.0
 */
public class CelvContext {
    Celvmoshi celvmoshi;

    public CelvContext(Celvmoshi celvmoshi) {
        this.celvmoshi = celvmoshi;
    }

    public String executeCelv() {
        return celvmoshi.pay();
    }
}
