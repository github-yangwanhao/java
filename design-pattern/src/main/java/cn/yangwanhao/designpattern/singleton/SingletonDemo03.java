package cn.yangwanhao.designpattern.singleton;

/**
 * 双重检测锁
 *
 * @author 杨万浩
 * @since 2020/6/21 16:07
 */
public class SingletonDemo03 {

    private volatile static SingletonDemo03 instance;

    private SingletonDemo03(){}

    private static SingletonDemo03 getInstance() {
        if( instance == null ) {
            SingletonDemo03 sc;
            synchronized (SingletonDemo03.class) {
                sc = instance;
                if( sc == null ) {
                    synchronized (SingletonDemo03.class) {
                        sc = new SingletonDemo03();
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }
}
