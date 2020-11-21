package cn.yangwanhao.designpattern.chain.manager;

/**
 * 经理类
 *
 * @author 杨万浩
 * @version V1.0
 * @since 2020/11/21 15:17
 */
public class CommonManager extends AbstractManager {

    private Request[] permissions = new Request[] {
        new Request("请假", 3),
        new Request("调休", 3),
        new Request("补卡", 3)
    };

    @Override
    public void doApprove(Request request) {
        int handleResult = 0;
        for (Request var : permissions) {
            if (request.getRequestType().equals(var.getRequestType())
                && request.getNum() <= var.getNum()) {
                System.out.println(this.getClass().getSimpleName() + "处理成功" + request);
                handleResult = 1;
                break;
            }
        }
        if (handleResult == 0) {
            if (superManager == null) {
                throw new RuntimeException("没有上级了");
            }
            System.out.println(this.getClass().getSimpleName() + "无权处理,转交给上级" + request);
            superManager.doApprove(request);
        }
    }

}
