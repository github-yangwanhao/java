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
public class GameObserver extends AbstractObserver {

    public GameObserver() {}

    public GameObserver(String name, Subject s) {
        this.name = name;
        this.subject = s;
    }

    @Override
    public void update() {
        System.out.println(subject.getAction() + "," + name + "关闭游戏直播,继续工作!");
    }

}
