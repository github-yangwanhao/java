package cn.yangwanhao.calculator.operates;

import java.math.BigDecimal;

/**
 * 运算类接口
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/10/17 21:55
 */

public interface Operate {

    /**
     * 运算两个数得到结果
     *
     * @param num1 第一个数
     * @param num2 第二个数
     * @return 结果
     * @author 杨万浩
     * @date 2019/10/17 21:58
     */
    BigDecimal getResult(BigDecimal num1, BigDecimal num2);

}
