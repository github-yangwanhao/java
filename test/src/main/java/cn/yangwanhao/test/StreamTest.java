package cn.yangwanhao.test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/27 10:37
 */

public class StreamTest {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aaa","bbb", "", "ccc", "", "", "ddd", "e", "fff", "gg");
        System.out.println("列表:" + strings);
        System.out.println("空字符串数量:" + strings.stream().filter(s -> s.isEmpty()).count());
        System.out.println("字符串长度为3的数量:" + strings.stream().filter(s -> s.length() == 3).count());
        System.out.println("字符串长度为2的数量:" + strings.stream().filter(s -> s.length() == 2).count());
        System.out.println("字符串长度为1的数量:" + strings.stream().filter(s -> s.length() == 1).count());
        System.out.println("非空的集合:" + strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList()));
        System.out.println("合并非空字符串:" + strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(",")));
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("数字列表:" + numbers);
        System.out.println("平方数列表:" + numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList()));
        IntSummaryStatistics summaryStatistics = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("最大值:" + summaryStatistics.getMax());
        System.out.println("最小值:" + summaryStatistics.getMin());
        System.out.println("总和:" + summaryStatistics.getSum());
        System.out.println("平均值:" + summaryStatistics.getAverage());
        List<String> list = null;
        /// list.forEach(str ->{
        ///    System.out.println("-------------------------");
        /// });
        // Will NPE Here
    }

}
