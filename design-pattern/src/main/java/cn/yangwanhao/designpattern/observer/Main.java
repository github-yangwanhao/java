package cn.yangwanhao.designpattern.observer;

/**
 * @author 杨万浩
 * @version V1.0
 * @since 2020/11/24 15:30
 */
public class Main {

    public static void main(String[] args) {
        Secretary s = new Secretary();

        AbstractObserver observer1 = new StockObserver("同事1", s);
        AbstractObserver observer2 = new GameObserver("同事2", s);

        s.attach(observer1);
        s.attach(observer2);

        s.setAction("老板回来了");

        s.notifyObservers();

        System.out.println("----------------------另一天--------------------------");
        Boss boss = new Boss();

        observer1.setSubject(boss);
        observer2.setSubject(boss);

        boss.attach(observer1);
        boss.attach(observer2);
        boss.detach(observer2);

        boss.setAction("我胡汉三回来了");

        boss.notifyObservers();
    }

}
