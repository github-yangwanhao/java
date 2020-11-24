package cn.yangwanhao.designpattern.observer;

import java.util.List;

import com.google.common.collect.Lists;

import lombok.Data;

/**
 * @author 杨万浩
 * @version V1.0
 * @since 2020/11/24 16:11
 */
@Data
public abstract class Subject {

    protected String action;

    protected List<AbstractObserver> observers = Lists.newArrayList();

    protected abstract void attach(AbstractObserver observer);

    protected abstract void detach(AbstractObserver observer);

    protected abstract void notifyObservers();
}
