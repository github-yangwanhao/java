package cn.yangwanhao.designpattern.chain.manager;

/**
 * @author 杨万浩
 * @version V1.0
 * @since 2020/11/21 15:36
 */
public class Main {

    public static void main(String[] args) {
        CommonManager commonManager = new CommonManager();
        commonManager.setName("经理");
        MajorManager majorManager = new MajorManager();
        majorManager.setName("总监");
        GeneralManager generalManager = new GeneralManager();
        generalManager.setName("总经理");

        commonManager.setSuperManager(majorManager);
        majorManager.setSuperManager(generalManager);

        Request[] requests = new Request[] {
            new Request("调薪", 100),
            new Request("调薪", 2000),
            new Request("请假", 1),
            new Request("请假", 6),
            new Request("请假", 14),
            new Request("调休", 1),
            new Request("调休", 6),
            new Request("调休", 14),
        };
        for (Request var : requests) {
            System.out.println("------------------------------------");
            commonManager.doApprove(var);
        }
    }

}
