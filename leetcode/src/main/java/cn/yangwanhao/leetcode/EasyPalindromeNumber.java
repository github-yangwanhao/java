package cn.yangwanhao.leetcode;

/**
 * 测试一个数字是否为回文数
 * 回文数：正反读起来都一样的数字 eg: 101 1001,0是回文数,负数因为有负号所以都不是回文数
 * PS:不要用额外的字符串来承担数字
 *
 * @author 杨万浩
 * @since 2020/7/2 11:15
 */
public class EasyPalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(121));
        System.out.println(isPalindromeNumber(-121));
        System.out.println(isPalindromeNumber(0));
        System.out.println(isPalindromeNumber(123));
        System.out.println(isPalindromeNumber(1221));
    }

    private static Boolean isPalindromeNumber(Integer num) {
        // 负数不是回文数
        if (num < 0) {
            return false;
        }
        // 大于0且以0结尾的一定不是回文数,因为高位不可能是0
        if (num > 0 && num % 10 == 0) {
            return false;
        }
        int newNum = 0;
        while(num > newNum) {
            newNum= newNum* 10 + num % 10;
            num /= 10;
        }
        // 由于处于中位的数字不影响回文(它总是与自己相等),所以我们可以简单地将其去除.
        return num == newNum || num == newNum/10;
    }

}
