package cn.yangwanhao.data.recursion;

/**
 * description RecursionPrintTest类 测试递归输出
 * @author 杨万浩
 * @date 2020/3/25 17
 */
public class RecursionPrintTest {

    public static void main(String[] args) {
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
