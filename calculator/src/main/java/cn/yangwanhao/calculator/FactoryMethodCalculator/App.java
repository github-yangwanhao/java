package cn.yangwanhao.calculator.FactoryMethodCalculator;

import cn.yangwanhao.calculator.operates.Operate;

import java.math.BigDecimal;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/20 11:15
 */

public class App {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operate operate = factory.createOperate();
        BigDecimal result = operate.getResult(new BigDecimal("1"), new BigDecimal("2"));
        System.out.println(result);
    }
}
