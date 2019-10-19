package cn.yangwanhao.calculator.factory;

import cn.yangwanhao.calculator.operates.*;

/**
 * OperateFactory：运算方法工厂类
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/10/17 22:07
 */
public class OperateFactory {

    private OperateFactory() {

    }

    /**
     * 通过运算符得到对应的运算类的对象
     *
     * @param operateStr 运算符
     * @return Operate对应子类的对象
     * @author 杨万浩
     * @date 2019/10/17 22:11
     */
    public static Operate getOperate(String operateStr) {
        Operate operate = null;
        switch (operateStr) {
            case "+":
                operate = new AddOperate();
                break;
            case "-":
                operate = new DeleteOperate();
                break;
            case "*":
                operate = new MultiplyOperate();
                break;
            case "/":
                operate = new DivideOperate();
                break;
            default:
                try {
                    throw new Exception("运算符错误");
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
        }
        return operate;
    }
}
