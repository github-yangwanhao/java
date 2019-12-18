package cn.yangwanhao.chothes.decorate.demo;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/18 11:10
 */

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
