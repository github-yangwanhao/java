package cn.yangwanhao.designpattern.observer;

import java.util.List;

import com.google.common.collect.Lists;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 前台类
 *
 * @author 杨万浩
 * @version V1.0
 * @since 2020/11/24 15:20
 */
@Data
public class Boss extends Subject {

    private String action;

    private List<AbstractObserver> observers = Lists.newArrayList();

    @Override
    public void attach(AbstractObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(AbstractObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (AbstractObserver o : observers) {
            o.update();
        }
    }

}
