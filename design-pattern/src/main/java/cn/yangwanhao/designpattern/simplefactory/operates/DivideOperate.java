package cn.yangwanhao.designpattern.simplefactory.operates;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * DivideOperate
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/10/17 22:03
 */
public class DivideOperate implements Operate {
    @Override
    public BigDecimal getResult(BigDecimal num1, BigDecimal num2) {
        // 如果除数为0
        if (num2.compareTo(BigDecimal.ZERO) == 0) {
            try {
                throw new Exception("除数不能为0");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        // 四舍五入
        return num1.divide(num2, RoundingMode.HALF_UP);
    }
}
