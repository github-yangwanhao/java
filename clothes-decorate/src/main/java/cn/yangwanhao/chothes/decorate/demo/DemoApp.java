package cn.yangwanhao.chothes.decorate.demo;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/18 11:40
 */

public class DemoApp {

    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteComponentA a = new ConcreteComponentA();
        ConcreteComponentB b = new ConcreteComponentB();
        a.setComponent(c);
        b.setComponent(c);
        b.operation();
    }

}
