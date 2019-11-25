package cn.yangwanhao.test;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/11/13 19:38
 */

public class Test {
    static Object object;
    public static void main(String[] args) {
        if (object == null) {
            object = new Object();
        }
        System.out.println(object);
    }
}
