package cn.yangwanhao.designpattern.simplefactory.operates;

import java.math.BigDecimal;

/**
 * AddOperate：加法运算类
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/10/17 21:59
 */
public class AddOperate implements Operate {

    @Override
    public BigDecimal getResult(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }
}
