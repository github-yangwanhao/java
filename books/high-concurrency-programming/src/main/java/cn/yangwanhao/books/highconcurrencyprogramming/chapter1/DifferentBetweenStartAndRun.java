package cn.yangwanhao.books.highconcurrencyprogramming.chapter1;

/**
 * description DifferentBetweenStartAndRun类
 *
 * @author 杨万浩
 * @date 2020/6/8 23:13
 */
public class DifferentBetweenStartAndRun {

    public static void main(String[] args) {
        /**
         * 程序运行结果是：
         * ------run----
         * main
         * ------start----
         * Thread-0
         *
         * 这说明Thread.run()只是执行run()方法 还是在当前线程 并未创建新线程
         * 而Thread.start()是创建一个新线程并执行新线程的run()方法
         */
        ThreadDemo demo = new ThreadDemo();
        System.out.println("------run----");
        demo.run();
        System.out.println("------start----");
        demo.start();
    }

}

class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
