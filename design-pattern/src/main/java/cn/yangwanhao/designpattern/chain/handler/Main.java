package cn.yangwanhao.designpattern.chain.handler;

/**
 * @author 杨万浩
 * @version V1.0
 * @since 2020/11/21 14:49
 */
public class Main {

    public static void main(String[] args) {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        ConcreteHandler3 handler3 = new ConcreteHandler3();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        int[] array = new int[] {1,3,5,7,10,14,17,20,22};
        for (int num : array) {
            System.out.println("---------------------------------------");
            handler1.handleRequest(num);
        }
    }

}
