package cn.yangwanhao.chothes.decorate.demo;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/18 11:34
 */

public class ConcreteComponentA extends Decorator {

    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }

}
