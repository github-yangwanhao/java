package cn.yangwanhao.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author 杨万浩
 * @description BigDecimalTest类
 * @date 2020/3/13 16
 */
public class BigDecimalTest {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0.00");
        String format1 = format.format(new BigDecimal("2.00").doubleValue());
        System.out.println(format1);
    }

}
