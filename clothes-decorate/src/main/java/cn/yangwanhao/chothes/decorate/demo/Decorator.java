package cn.yangwanhao.chothes.decorate.demo;

import lombok.Getter;
import lombok.Setter;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/18 11:11
 */

public class Decorator implements Component {

    @Getter
    @Setter
    private Component component;

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
