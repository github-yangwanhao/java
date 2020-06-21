package cn.yangwanhao.designpattern.singleton;

/**
 * 静态内部类
 *
 * @author 杨万浩
 * @since 2020/6/21 16:17
 */
public class SingletonDemo04 {

    private static class SingletonClassInstance{
        private static final SingletonDemo04 INSTANCE = new SingletonDemo04();
    }
    private SingletonDemo04() {}

    public static SingletonDemo04 getInstance() {
        return SingletonClassInstance.INSTANCE;
    }

}
