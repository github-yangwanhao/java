package cn.yangwanhao.calculator.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * ValidateUtil：验证类
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/10/17 22:18
 */
public class ValidateUtil {

    private static final String NUMBER_REGEX = "";

    private ValidateUtil() {

    }

    /**
     * 验证输入的字符串是否为数字
     *
     * @param str 要验证的字符串
     * @return true是 false否
     * @author 杨万浩
     * @date 2019/10/17 22:19
     */
    public static Boolean isNumber(String str) {
        Pattern pattern = compile("^(\\-|\\+)?\\d+(\\.\\d+)?$");
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
    }

    /**
     * 验证输入的字符串是否是运算符
     *
     * @param str 输入的字符串
     * @return true是 false否
     * @author 杨万浩
     * @date 2019/10/19 11:50
     */
    public static Boolean idOperate(String str) {
        Pattern pattern = compile("[\\+\\-\\*\\/]");
        Matcher isOperate = pattern.matcher(str);
        return isOperate.matches();
    }
}
