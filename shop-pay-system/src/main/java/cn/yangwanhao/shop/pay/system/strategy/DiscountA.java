package cn.yangwanhao.shop.pay.system.strategy;

import java.math.BigDecimal;

/**
 * DiscountA:8折优惠
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/10/28 21:57
 */
public class DiscountA implements Discount {
    @Override
    public BigDecimal discount(BigDecimal num) {
        return num.multiply(new BigDecimal("0.8"));
    }
}
