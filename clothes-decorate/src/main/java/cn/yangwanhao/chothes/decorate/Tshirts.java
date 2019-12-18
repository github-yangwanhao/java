package cn.yangwanhao.chothes.decorate;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/18 15:28
 */

public class Tshirts extends Finery {

    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
