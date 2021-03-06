package cn.yangwanhao.designpattern.simplefactory;

import cn.yangwanhao.designpattern.simplefactory.factory.OperateFactory;
import cn.yangwanhao.designpattern.simplefactory.operates.Operate;
import cn.yangwanhao.designpattern.utils.ValidateUtil;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * description App类
 *
 * @author 杨万浩
 * @date 2020/6/1 16:33
 */
public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num1,num2,operateStr;
        Boolean isNum1, isNum2, isOperate;
        while (true) {
            do {
                System.out.println("请输入第一个数字：");
                num1 = in.nextLine();
                isNum1 = ValidateUtil.isNumber(num1);
                if (!isNum1) {
                    System.err.println("数字不正确");
                }
            } while (!isNum1);
            do {
                System.out.println("请输入第二个数字：");
                num2 = in.nextLine();
                isNum2 = ValidateUtil.isNumber(num2);
                if (!isNum2) {
                    System.err.println("数字不正确");
                }
            } while (!isNum2);
            do {
                System.out.println("请输入运算符(+、-、*、/)：");
                operateStr = in.nextLine();
                isOperate = ValidateUtil.idOperate(operateStr);
                if (!isOperate) {
                    System.err.println("运算符不正确");
                }
            } while (!isOperate);
            Operate operate = OperateFactory.getOperate(operateStr);
            BigDecimal result = operate.getResult(new BigDecimal(num1), new BigDecimal(num2));
            System.out.println(result);
            System.out.println("-----------------------------------------------------");
        }
    }

}
