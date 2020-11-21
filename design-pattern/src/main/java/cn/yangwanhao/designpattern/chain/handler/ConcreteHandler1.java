package cn.yangwanhao.designpattern.chain.handler;

/**
 * @author 杨万浩
 * @version V1.0
 * @since 2020/11/21 14:40
 */
public class ConcreteHandler1 extends BaseHandler {
    @Override
    public void handleRequest(int request) {
        if (request <= 10) {
            System.out.println(this.getClass().getSimpleName() + "处理请求" + request);
        } else {
            if (successor == null) {
                throw new RuntimeException("successor can not be null!");
            }
            System.out.println(this.getClass().getSimpleName() + "发现自己无权处理,交给上级");
            successor.handleRequest(request);
        }
    }
}
