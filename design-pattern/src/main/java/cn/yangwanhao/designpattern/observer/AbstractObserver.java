package cn.yangwanhao.designpattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 杨万浩
 * @version V1.0
 * @since 2020/11/24 15:50
 */
@Data
public abstract class AbstractObserver {

    protected String name;

    protected Subject subject;

    protected abstract void update();

}
