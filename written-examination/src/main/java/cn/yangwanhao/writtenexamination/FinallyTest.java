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
            /*
             * 此处a=10并return a
             * 但是仍然会执行finally 将a=5
             * 但是仍然返回的是10 因为实际返回的值是虚拟机规定的一个临时变量
             */
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
