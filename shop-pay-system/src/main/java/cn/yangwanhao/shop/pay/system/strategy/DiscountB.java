package cn.yangwanhao.shop.pay.system.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * DiscountB:满400-50
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/10/28 22:01
 */
public class DiscountB implements Discount {
    @Override
    public BigDecimal discount(BigDecimal num) {
        return num.subtract((num.divide(new BigDecimal("400"), RoundingMode.DOWN).multiply(new BigDecimal("50"))));
    }
}
