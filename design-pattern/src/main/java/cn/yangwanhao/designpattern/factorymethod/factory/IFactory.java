package cn.yangwanhao.designpattern.factorymethod.factory;


import cn.yangwanhao.designpattern.simplefactory.operates.Operate;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/20 11:09
 */

public interface IFactory {

    /**
     * Description: 工厂接口
     * @return
     * @author 青鲤
     * @createDate 2019/12/20 11:10
     */
    Operate createOperate();
}
