package cn.yangwanhao.designpattern.chain.handler;

/**
 * 定义处理请示的接口
 *
 * @author 杨万浩
 * @version V1.0
 * @since 2020/11/21 14:31
 */
public abstract class BaseHandler {

    protected BaseHandler successor;

    public void setSuccessor(BaseHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求的对象
     * @param request 请求参数,代表级别
     */
    public abstract void handleRequest(int request);

}
