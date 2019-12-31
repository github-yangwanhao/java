package cn.yangwanhao.test;

import lombok.ToString;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/31 15:45
 */

@ToString
public class SpaceShip {
    private String name;
    SpaceShip(String name) {
        this.name = name;
    }

}

class SpaceShipControl {
    void up(int i) {
        System.out.println("向上"+ i +"步");
    }

    void down(int i) {
        System.out.println("向下"+ i +"步");
    }

    void left(int i) {
        System.out.println("向左"+ i +"步");
    }

    void right(int i) {
        System.out.println("向右"+ i +"步");
    }
}

class SpaceShipDelegation {
    private String name;
    private SpaceShipControl control = new SpaceShipControl();

    SpaceShipDelegation(String name) {
        this.name = name;
    }

    void up(int i) {
        control.up(i);
    }

    void down(int i) {
        control.down(i);
    }

    void left(int i) {
        control.left(i);
    }

    void right(int i) {
        control.right(i);
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("AAA");
        protector.down(100);
    }
}
