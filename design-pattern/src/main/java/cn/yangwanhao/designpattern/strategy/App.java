package cn.yangwanhao.designpattern.strategy;


import cn.yangwanhao.designpattern.strategy.factory.DiscountContext;
import cn.yangwanhao.designpattern.strategy.strategy.Discount;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * App
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/10/21 22:05
 */
public class App {
    public static void main(String[] args) {
        DiscountContext context = new DiscountContext();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请输入模式:(aaa-8折优惠/bbb-满400减50)/exit-退出");
            String pattern = in.nextLine();
            if ("exit".equals(pattern)) {
                System.exit(0);
            }
            Discount discount = context.getDiscount(pattern);
            System.out.println("请输入总额:");
            String money = in.nextLine();
            System.out.println(discount.discount(new BigDecimal(money)));
            System.out.println("---------------------------------------");
        }
    }
}
