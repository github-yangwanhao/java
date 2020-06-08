package cn.yangwanhao.writtenexamination;

/**
 * description FinallyTest类
 *
 * @author 杨万浩
 * @date 2020/6/6 17:28
 */
public class FinallyTest {

    public static void main(String[] args) {
        FinallyTest test = new FinallyTest();
        System.out.println(test.test());
    }
    private int test() {
        int a;
        try {
            a = 10;
            return a;
        } catch (Exception e) {
            a = 11;
            e.printStackTrace();
        } finally {
            a = 5;
            System.out.println(a + "--------------------");
        }
        return a;
    }

}
