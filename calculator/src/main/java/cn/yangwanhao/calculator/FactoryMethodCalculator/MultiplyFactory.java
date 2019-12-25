package cn.yangwanhao.calculator.FactoryMethodCalculator;

import cn.yangwanhao.calculator.operates.MultiplyOperate;
import cn.yangwanhao.calculator.operates.Operate;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/20 11:10
 */

public class MultiplyFactory implements IFactory {
    @Override
    public Operate createOperate() {
        return new MultiplyOperate();
    }
}
