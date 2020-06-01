package cn.yangwanhao.designpattern.factorymethod;

import cn.yangwanhao.designpattern.factorymethod.factory.AddFactory;
import cn.yangwanhao.designpattern.factorymethod.factory.IFactory;
import cn.yangwanhao.designpattern.simplefactory.operates.Operate;

import java.math.BigDecimal;

/**
 * description App类
 *
 * @author 杨万浩
 * @date 2020/6/1 16:49
 */
public class App {

    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operate operate = factory.createOperate();
        BigDecimal result = operate.getResult(new BigDecimal("1"), new BigDecimal("2"));
        System.out.println(result);
    }

}
