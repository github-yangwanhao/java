package cn.yangwanhao.data.recursion;

/**
 * description StringRecursionPrintTest 字符串递归翻转输出测试
 *
 * @author 杨万浩
 * @date 2020/6/29 10:50
 */
public class StringRecursionPrintTest {

    public static void main(String[] args) {
        System.out.println(printStr("123456789"));
    }

    private static String printStr(String str) {
        if (str.length() == 1) {
            return str;
        }
        return printStr(str.substring(1)) + str.charAt(0);
    }

}
