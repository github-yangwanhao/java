package cn.yangwanhao.writtenexamination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 随机播放音乐test
 *
 * @author 杨万浩
 * @since 2020/6/27 15:51
 */
public class RandomSongsPlay {

    private static final String[] SONGS = new String[] {
        "歌曲1", "歌曲2", "歌曲3", "歌曲4", "歌曲5",
        "歌曲6", "歌曲7", "歌曲8", "歌曲9", "歌曲10"
    };

    public static void main(String[] args) {
        /*
         * 数组中10首歌 要求随机播放全部 但是不能重复
         */
        String separator = "----------------------------------";
        play1();
        System.out.println(separator);
        play2();
        System.out.println(separator);
        play3();
    }

    private static void play1() {
        /*
         * 简单思路
         * 每播放一首就把下标作为key放入Map中
         * 每次生成随机数时都看一下下标是否已经在Map中存在
         * 如果存在就跳过 不存在就播放并存入Map
         * 问题：如果访问不中 需要生成很多次随机数 假设就那么巧一直生成不中 程序一直执行
         */
        Random random = new Random();
        // 看看总共执行了几次循环
        int executeCount = 0;
        Map<Integer, String> map = new HashMap<>(SONGS.length);
        do {
            executeCount++;
            int index = random.nextInt(10);
            if (map.containsKey(index)) {
                continue;
            }
            // 假装播放
            map.put(index, SONGS[index]);
        } while (map.size() != SONGS.length);
        System.out.println("play1() : " + executeCount);
        System.out.println(map);
    }

    private static void play2() {
        /*
         * 解决上边的问题(执行次数可控：有几首歌循环执行几次)
         * 先把数组的下标复制到List中(数组不利于删除)
         * PS：使用LinkedList,ArrayList底层也是使用数组,完全没区别,而LinkedList使用链表
         */
        List<Integer> songsIndexList = new LinkedList<>();
        for (int i = 0; i < SONGS.length; i++) {
            songsIndexList.add(i);
        }
        // 下边使用List存放已播放的歌曲名
        List<String> resultList = new ArrayList<>(SONGS.length);
        // 看看总共执行了几次循环
        int executeCount = 0;
        Random random = new Random();
        do {
            executeCount++;
            // 以当前下标集合的长度作为生成随机数的范围
            int index = random.nextInt(songsIndexList.size());
            // doSomething 假装播放
            // 放入歌曲名(这里的index是歌曲下标集合的位置,这个位置存的值才是数组songs真正的下标)
            resultList.add(SONGS[songsIndexList.get(index)]);
            // 删掉下标集合
            songsIndexList.remove(index);
        } while (songsIndexList.size() > 0);
        System.out.println("play2() : " + executeCount);
        System.out.println(resultList);
    }

    private static void play3() {
        /*
         * 第三种：在网上看到一哥们的文章,也很有想法,但是效率和play1()一样不可控制
         * 文章地址：https://blog.csdn.net/JinKin_OldWang/article/details/93520936
         */
        Random random = new Random();
        Map<Integer,String> map = new HashMap<>(SONGS.length);
        // 看看总共执行了几次循环
        int executeCount = 0;
        //遍历10首歌曲，存到map集合
        for (int i = 0; i < SONGS.length; i++) {
            executeCount++;
            int num = random.nextInt(10) + 1;
            // 如果歌曲播放过 那么这次循环无效 i-- 让i回退一次
            if (map.containsKey(num)) {
                i--;
            } else {
                // doSomething 假装播放。
                // 放入歌曲名
                map.put(num,SONGS[i]);
            }
        }
        System.out.println("play3() : " + executeCount);
        System.out.println(map);
    }

}
