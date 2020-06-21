package cn.yangwanhao.designpattern.singleton;

/**
 * 最简单的单例模式例子,懒汉式,线程安全,调用效率低,可以延迟加载
 *
 * @author 杨万浩
 * @since 2020/6/21 16:03
 */
public class SingletonDemo02 {

    private SingletonDemo02() {}

    private static SingletonDemo02 instance;

    public static synchronized SingletonDemo02 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo02();
        }
        return instance;
    }

}
