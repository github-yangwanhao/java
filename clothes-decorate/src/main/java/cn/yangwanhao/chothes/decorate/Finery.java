package cn.yangwanhao.chothes.decorate;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/18 15:24
 */

public class Finery extends Person {

    protected Person person;

    public void Decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person!=null) {
            person.show();
        }
    }

}
