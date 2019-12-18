package cn.yangwanhao.chothes.decorate.demo;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/18 11:34
 */

public class ConcreteComponentB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior() {
        System.out.println("ConcreteComponentB的独有操作");
    }

}
