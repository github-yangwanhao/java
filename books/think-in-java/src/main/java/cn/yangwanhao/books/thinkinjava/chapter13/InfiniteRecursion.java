package cn.yangwanhao.books.thinkinjava.chapter13;

/**
 * 演示toString()方法递归引起的StackOverflowError
 *
 * @author yangwh@yunrong.cn
 * @version V3.0
 * @since 2020/11/18 16:06
 */
public class InfiniteRecursion {

    /*
     * will occur java.lang.StackOverflowError here
     * 编译器会在打印instance时调用toString()方法,toString方法中的this又会调用InfiniteRecursion的toString方法,无限递归
     * 想要打印instance这个对象的内存地址,应该使用super.toString()方法
     * @Override
     * public String toString() {
     *    return "InfiniteRecursion instance address is : " + this;
     * }
     */

    @Override
    public String toString() {
        return "InfiniteRecursion instance address is : " + super.toString();
    }

    public static void main(String[] args) {
        InfiniteRecursion instance = new InfiniteRecursion();
        System.out.println(instance);
    }
}
