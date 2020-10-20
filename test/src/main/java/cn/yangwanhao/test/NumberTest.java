package cn.yangwanhao.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

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
        for (int i=0; i<6; i++) {
            Random r = new Random();
            System.out.println(r.nextInt(10));
        }
        // 浮点数之间的等值判断，基本数据类型不能用==来比较，包装数据类型不能用equals()来判断
        // false
        System.out.println(0.1+0.2 == 0.3);
        // true
        System.out.println(2000000000F == 2000000050F);
        Float float1 = 1.0F - 0.9F;
        Float float2 = 0.9F - 0.8F;
        // false
        System.out.println(float1.equals(float2));
        Double double1 = 1.0D - 0.9D;
        Double double2 = 1.1D - 1.0D;
        // false
        System.out.println(double1.equals(double2));
        Integer a = 129;
        int b = 129;
        System.out.println(a == b);
        while (true) {
            System.out.println((int)((Math.random()*9+1)*10000));
        }
    }
}
