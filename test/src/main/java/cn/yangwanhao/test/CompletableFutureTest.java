package cn.yangwanhao.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @author 杨万浩
 * @version V1.0
 * @since 2020/12/16 18:01
 */
public class CompletableFutureTest {

    private static int[] seconds = new int[] {10, 5, 20, 15, 8};

    public static void main(String[] args) {
        // slow();
        // faster();
        withReturn();
    }

    private static void slow() {
        try {
            long startTime = System.currentTimeMillis();
            for (int s : seconds) {
                runRandomSeconds(s);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("慢:" + (endTime - startTime)/1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void faster() {
        try {
            long startTime = System.currentTimeMillis();
            List<CompletableFuture<Void>> cfs = new ArrayList<>();
            for (int s : seconds) {
                CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> {
                    runRandomSeconds(s);
                });
                cfs.add(cf);
            }
            CompletableFuture.allOf(cfs.toArray(new CompletableFuture[1])).join();
            long endTime = System.currentTimeMillis();
            System.out.println("快:" + (endTime - startTime)/1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void withReturn() {
        try {
            long startTime = System.currentTimeMillis();
            List<CompletableFuture<Long>> cfs = new ArrayList<>();
            for (int s : seconds) {
                if (s == 5) {
                    int a = 1/0;
                }
                CompletableFuture<Long> cf = CompletableFuture.supplyAsync(() -> runRandomSeconds(s));
                cfs.add(cf);
            }
            CompletableFuture.allOf(cfs.toArray(new CompletableFuture[1])).join();
            long endTime = System.currentTimeMillis();
            long time = (endTime - startTime)/1000;
            System.out.println("快:" + time);
            for (CompletableFuture<Long> f : cfs) {
                System.out.println(f.get());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static long runRandomSeconds(int seconds) {
        try {
            long startTime = System.currentTimeMillis();
            Thread.sleep(seconds * 1000L);
            long endTime = System.currentTimeMillis();
            return (endTime - startTime)/1000;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return -1L;
    }

}
