package cn.yangwanhao.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/11/11 14:59
 */

public class NumberTest {

    public static void main(String[] args) {
        int num1 = (int) (1.6/0.5);
        System.out.println(num1);
        int num2 = (int) (1.0/0.5);
        System.out.println(num2);
        String str1 = "0.5";
        String str2 = "1.5";
        System.out.println(Double.parseDouble(str1));
        System.out.println(Double.parseDouble(str2));
        String str3 = "3";
        String str4 = "4";
        BigDecimal bigDecimal1 = new BigDecimal(str3);
        BigDecimal bigDecimal2 = new BigDecimal(str4);
        System.out.println(bigDecimal1.divide(new BigDecimal(2)).toString());
        System.out.println(bigDecimal2.divide(new BigDecimal(2)).toString());
        Long num3 = 100024L;
        int num4 = Integer.parseInt(num3.toString());
        System.out.println(num4);
        System.out.println(new BigDecimal("10").divide(new BigDecimal("3"),1, RoundingMode.HALF_UP));
        BigDecimal bigDecimal3 = new BigDecimal("1024");
        System.out.println(bigDecimal3.movePointLeft(2).doubleValue());
        System.out.println(bigDecimal3.movePointRight(-2).doubleValue());
        System.out.println(bigDecimal3.movePointRight(0).doubleValue());
        System.out.println(bigDecimal3.movePointLeft(0).doubleValue());
    }
}
