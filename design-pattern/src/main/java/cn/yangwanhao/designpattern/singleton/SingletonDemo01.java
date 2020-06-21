package cn.yangwanhao.designpattern.singleton;

/**
 * 最简单的单例模式例子,饿汉式,线程安全,调用效率高,不能延迟加载
 *
 * @author 杨万浩
 * @since 2020/6/21 15:48
 */
public class SingletonDemo01 {

    private SingletonDemo01() {}

    private static SingletonDemo01 instance = new SingletonDemo01();

    public static SingletonDemo01 getInstance() {
        return instance;
    }

}
