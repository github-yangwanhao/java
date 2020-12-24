package cn.yangwanhao.test;

/**
 * @author 杨万浩
 * @version V1.0
 * @since 2020/12/23 19:26
 */
public class SystemPrintTest {

    public static void main(String[] args) {
        outOnly();
        System.out.println("--------------------");
        outWithErr();
        System.out.println("--------------------");
        errOnly();
    }

    private static void outOnly() {
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
        System.out.println("ddd");
        System.out.println("eee");
        System.out.println("fff");
        System.out.println("ggg");
        System.out.println("hhh");
    }

    private static void outWithErr() {
        System.out.println("aaa");
        System.err.println("bbb");
        System.out.println("ccc");
        System.err.println("ddd");
        System.out.println("eee");
        System.err.println("fff");
        System.out.println("ggg");
        System.err.println("hhh");
    }

    private static void errOnly() {
        System.err.println("aaa");
        System.err.println("bbb");
        System.err.println("ccc");
        System.err.println("ddd");
        System.err.println("eee");
        System.err.println("fff");
        System.err.println("ggg");
        System.err.println("hhh");
    }

}
