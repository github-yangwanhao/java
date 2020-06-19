package cn.yangwanhao.books.highconcurrencyprogramming.chapter1;

import lombok.Data;

/**
 * description StopThreadUnsafe类
 *
 * @author 杨万浩
 * @date 2020/6/9 22:32
 */
public class StopThreadUnsafe {

    public static User u = new User();

    @Data
    public static class User {
        public User() {
            this.id = 0;
            this.name = "0";
        }
        private int id;
        private String name;
    }

    public static class ChangeObjectThread extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (u) {
                    int v = (int) (System.currentTimeMillis()/1000);
                    u.setId(v);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    u.setName(String.valueOf(v));
                }
                Thread.yield();
            }
        }
    }

    public static class ReadObjectThread extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (u) {
                    if (u.getId() != Integer.parseInt(u.getName())) {
                        System.out.println(u);
                    }
                }
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ReadObjectThread().start();
        while (true) {
            Thread t = new ChangeObjectThread();
            t.start();
            Thread.sleep(1000L);
            t.stop();
        }
    }

}
