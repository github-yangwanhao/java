package cn.yangwanhao.designpattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 被通知的同事类
 *
 * @author 杨万浩
 * @version V1.0
 * @since 2020/11/24 15:21
 */
public class StockObserver extends AbstractObserver {

    public StockObserver() {}

    public StockObserver(String name, Subject s) {
        this.name = name;
        this.subject = s;
    }

    @Override
    public void update() {
        System.out.println(subject.getAction() + "," + name + "关闭股票行情,继续工作!");
    }

}
