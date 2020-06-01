package cn.yangwanhao.designpattern.factorymethod.factory;

import cn.yangwanhao.designpattern.simplefactory.operates.AddOperate;
import cn.yangwanhao.designpattern.simplefactory.operates.Operate;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/20 11:10
 */

public class AddFactory implements IFactory {
    @Override
    public Operate createOperate() {
        return new AddOperate();
    }
}
