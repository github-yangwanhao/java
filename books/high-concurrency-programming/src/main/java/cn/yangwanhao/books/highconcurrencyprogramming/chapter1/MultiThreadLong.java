package cn.yangwanhao.books.highconcurrencyprogramming.chapter1;

import lombok.AllArgsConstructor;

/**
 * description MultiThreadLong类
 *
 * @author 杨万浩
 * @date 2020/6/8 22:49
 */
public class MultiThreadLong {

    public static long t = 0;

    @AllArgsConstructor
    public static class ChangeT implements Runnable {
        private long to;
        @Override
        public void run() {
            while (true) {
                MultiThreadLong.t = to;
                Thread.yield();
            }
        }
    }

    public static class ReadT implements Runnable {
        @Override
        public void run() {
            while (true) {
                long tmp = MultiThreadLong.t;
                if (tmp != 111L && tmp != -999L && tmp != 333L && tmp != -444L) {
                    System.out.println(tmp);
                    Thread.yield();
                }
            }
        }
    }

    public static void main(String[] args) {

        /**
         * 32位JVM下运行会出错
         * 64位没问题
         */

        new Thread(new ChangeT(111L)).start();
        new Thread(new ChangeT(-999L)).start();
        new Thread(new ChangeT(333L)).start();
        new Thread(new ChangeT(-444L)).start();
        new Thread(new ReadT()).start();
    }

}
