package cn.yangwanhao.designpattern.strategy.factory;


import cn.yangwanhao.designpattern.strategy.strategy.Discount;
import cn.yangwanhao.designpattern.strategy.strategy.DiscountA;
import cn.yangwanhao.designpattern.strategy.strategy.DiscountB;

/**
 * DiscountContext
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/10/28 22:04
 */
public class DiscountContext {
    private Discount discount = null;
    public Discount getDiscount(String type) {
        switch (type) {
            case "aaa":
                discount = new DiscountA();
                break;
            case "bbb":
                discount = new DiscountB();
                break;
            default:
                System.out.println("类型错误");
        }
        return discount;
    }
}
