package cn.yangwanhao.designpattern.strategy.strategy;

import java.math.BigDecimal;

/**
 * Strategy
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/10/21 22:08
 */
public interface Discount {

    /**
     * description
     *
     * @param num 总金额
     * @author 杨万浩
     * @return 打折后的金额
     * @date 2019/10/21 22:09
     */
    BigDecimal discount(BigDecimal num);
}
