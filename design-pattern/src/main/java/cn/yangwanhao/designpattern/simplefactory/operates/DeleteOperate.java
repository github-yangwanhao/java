package cn.yangwanhao.designpattern.simplefactory.operates;

import java.math.BigDecimal;

/**
 * DeleteOperate：减法运算类
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/10/17 22:00
 */
public class DeleteOperate implements Operate {
    @Override
    public BigDecimal getResult(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }
}
