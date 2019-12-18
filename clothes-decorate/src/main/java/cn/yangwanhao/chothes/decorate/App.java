package cn.yangwanhao.chothes.decorate;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/16 11:24
 */

public class App {

    public static void main(String[] args) {
        Person person = new Person("someone");
        System.out.println("第一种装扮");
        Tshirts tshirts = new Tshirts();
        BigTrouser bigTrouser = new BigTrouser();
        tshirts.Decorate(person);
        bigTrouser.Decorate(tshirts);
        bigTrouser.show();
    }

}
