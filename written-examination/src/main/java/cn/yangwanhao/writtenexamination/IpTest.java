package cn.yangwanhao.writtenexamination;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * description IpTest类
 *
 * @author 杨万浩
 * @date 2020/6/6 16:36
 */
public class IpTest {

    private static final Integer IPV4_LENGTH = 4;

    public static void main(String[] args) {
        /*
         * 题目：输入一个字符串,判断是否为IPV4地址
         */
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个IPV4地址");
        String ipStr = in.nextLine();
        System.out.println(isIpAddress(ipStr));
    }

    private static Boolean isIpAddress(String ipStr) {
        // 为空则false
        if (StringUtils.isBlank(ipStr)) {
            return false;
        }
        String[] array = ipStr.split("\\.");
        // 分割后字符串数组长度不等于4则false
        if (array.length != IPV4_LENGTH) {
            return false;
        }
        // 判断每个数字的范围 0 <= num <= 255
        for (String str : array) {
            int num = Integer.parseInt(str);
            if (num < 0 || num > 255) {
                return false;
            }
        }
        return true;
    }

}
