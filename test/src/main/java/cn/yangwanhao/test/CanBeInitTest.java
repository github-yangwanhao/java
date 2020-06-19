package cn.yangwanhao.test;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/11/13 19:38
 */

public class CanBeInitTest {
    private static Object object;
    private static String str1;
    public static void main(String[] args) {
        String str2;
        if (object == null) {
            object = new Object();
        }
        System.out.println(object);
        System.out.println(str1);
        // 类属性会被自动初始化为null, 而方法里的局部变量不会被初始化,不能引用
        // System.out.println(str2); ERROR
    }
}
