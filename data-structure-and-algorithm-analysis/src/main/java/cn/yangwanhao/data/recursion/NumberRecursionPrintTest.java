package cn.yangwanhao.data.recursion;

/**
 * description NumberRecursionPrintTest 数字递归输出测试
 * @author 杨万浩
 * @date 2020/3/25 17
 */
public class NumberRecursionPrintTest {

    public static void main(String[] args) {
        /*
         * 给定一个数字n 依次输出1~n之间的所有数字
         */
        // 结果是依次输出1 2 3 4 5
        print(5);
    }

    private static void print(int n) {
        if (n > 1) {
            print(n - 1);
        }
        System.out.println(n);
    }

}
