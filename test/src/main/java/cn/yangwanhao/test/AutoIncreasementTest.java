package cn.yangwanhao.test;

/**
 * 测试理解 i++ 和 ++i 的区别
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/30 9:45
 */

public class AutoIncreasementTest {

    public static void main(String[] args) {
        int i = 0, j = 0;
        // 后缀形式:先拿到值,在执行运算.在拿到值的时候i是0,因此输出的i是0,i++自增之后虽然i是1但是未赋给i
        i = i++;
        // 前缀形式:限制性运算,再得到值.执行++运算后i是1,再赋值给i,i就是1
        j = ++j;
        // 0
        System.out.println(i);
        // 1
        System.out.println(j);
        i = 0; j = 0;
        i++; ++j;
        // 1
        System.out.println(i);
        // 1
        System.out.println(j);
        i = 0; j = 0;
        for (int n=0; n<100; n++) {
            i = i++;
            j = ++j;
        }
        // 0 先赋值再加一 所以拿到的i永远是0
        System.out.println(i);
        // 100
        System.out.println(j);
    }

}
