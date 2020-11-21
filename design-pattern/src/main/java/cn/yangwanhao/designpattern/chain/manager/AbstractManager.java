package cn.yangwanhao.designpattern.chain.manager;

import lombok.Setter;

/**
 * @author 杨万浩
 * @version V1.0
 * @since 2020/11/21 15:12
 */
public abstract class AbstractManager {

    @Setter
    protected String name;

    @Setter
    protected AbstractManager superManager;

    /**
     * 审批进件
     * @param request 进件
     */
    public abstract void doApprove(Request request);

}
