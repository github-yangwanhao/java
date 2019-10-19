package cn.yangwanhao.calculator.operates;

import java.math.BigDecimal;

/**
 * MultiplyOperate：乘法运算
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/10/17 22:02
 */
public class MultiplyOperate implements Operate {

    @Override
    public BigDecimal getResult(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }
}
