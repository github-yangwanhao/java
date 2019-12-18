package cn.yangwanhao.test;

import java.util.regex.Pattern;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/16 9:52
 */

public class PatternTest {

    private static final String NUMBER_REGEX = "^(\\-|\\+)?\\d+(\\.\\d+)?$";

    private static final Pattern NUMBER_PATTERN = Pattern.compile(NUMBER_REGEX);

    private static final int count = 10000000;

    public static void main(String[] args) {
        /**
         * 使用String.matches(regexStr)的方法进行验证
         */
        long beginTime1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Integer.toString(i).matches(NUMBER_REGEX);
        }
        long endTime1 = System.currentTimeMillis();
        System.err.println("原始版"+ (endTime1 - beginTime1));
        /**
         * 使用Pattern类进行验证
         */
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            NUMBER_PATTERN.matcher(Integer.toString(i)).matches();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("改进版"+ (endTime - beginTime));
    }
}
