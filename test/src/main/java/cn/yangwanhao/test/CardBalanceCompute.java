package cn.yangwanhao.test;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/11/13 15:09
 */

public class CardBalanceCompute {
    public static void main(String[] args) {
        int balance = 88;
        int price1 = 13;
        int price2 = 15;
        for (int i = 0; i <= balance/price1; i++) {
            for (int j = 0; j <= balance/price2; j++) {
                if (price1*i + price2*j == balance) {
                    System.out.println("(" + price1 + "*" + i + ") + (" + price2 + "*" + j +") = " + balance);
                }
            }
        }
    }
}
