package cn.yangwanhao.writtenexamination;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * description WordPatternTest类
 *
 * @author 杨万浩
 * @since 2020/7/2 10:02
 */
public class WordPatternTest {

    public static void main(String[] args) {
        /*
         * 有一个字符串它的构成是词+空格的组合,如“北京 杭州 杭州 北京”,要求输入一个匹配模式(简单的以字符来写)
         * 比如 aabb,来判断该字符串是否符合该模式
         * 举个例子:
         * pattern = "abba",str="北京 杭州 杭州 北京",返回true
         * pattern = "aabb",str="北京 杭州 杭州 北京",返回false
         * pattern = "baab",str="北京 杭州 杭州 北京",返回true
         */
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要匹配的字符串(输入exit将退出程序):");
            String word = in.nextLine();
            if ("exit".equals(word)) {
                break;
            }
            System.out.println("请输入匹配模式:");
            String pattern = in.nextLine();
            System.out.println(isWordPattern(word, pattern));
        }
    }

    private static Boolean isWordPattern(String word, String pattern) {
        /*
         * 思路:
         * 首先按照空格分割字符串数组,并且把pattern分割为字符数组
         * 如果两个数组的长度不相等,则false
         * 然后开始判断 将pattern字符数组的元素作为key,对应位置的word数组元素作为value放入map
         * 如果map中不存在key,就查找value,如果找到了value则false,如果value也没找到,就放入map
         * 如果map中已经存在就拿出value和现在对应下标的字符数组元素作比较,相等则继续,不相等则false
         */
        if (StringUtils.isEmpty(pattern) || StringUtils.isEmpty(word)) {
            return false;
        }
        // 切割两个字符串成为两个数组
        String[] wordsArray = word.split(" ");
        char[] patternArray = pattern.toCharArray();
        // 判断两个数组的长度,不相等则直接false
        if (patternArray.length != wordsArray.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>(patternArray.length);
        // for循环遍历两个数组(此时两个数组的长度必然相等)
        for (int i = 0; i < patternArray.length; i++) {
            // 如果map中有key 那就比较value和wordsArray当前位置的元素是否相等,不相等直接false
            if (map.containsKey(patternArray[i])) {
                if (!wordsArray[i].equals(map.get(patternArray[i]))) {
                    return false;
                }
            } else {
                // 如果key不存在但value已经存在,则false
                // 如果没有这个判断,那么类似(a a b b)和(abcc)也会匹配成功,这显然是不正确的
                if (map.containsValue(wordsArray[i])) {
                    return false;
                }
                // 没有则放入map
                map.put(patternArray[i], wordsArray[i]);
            }
        }
        return true;
    }

}
