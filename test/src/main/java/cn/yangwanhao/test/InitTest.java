package cn.yangwanhao.test;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/30 14:16
 */

public class InitTest {

    private int intValue;

    static Table table = new Table();
    static CupBoard cupBoard = new CupBoard();

    InitTest(int intValue) {
        System.out.println("自动初始化的值: " + this.intValue);
        this.intValue = intValue;
        System.out.println("手动初始化的值: " + this.intValue);
    }

    public static void main(String[] args) {
        /*new InitTest(5);
        System.out.println("-------------------------------");
        House house = new House();
        house.f();
        House house1 = new House();
        house1.f();
        System.out.println("--------------------------------");*/
        System.out.println("Create new CupBoard in main");
        new CupBoard();
        System.out.println("Create new CupBoard in main");
        new CupBoard();
        table.f2(1);
        cupBoard.f3(1);
    }

}

class Window {
    Window(int i) {
        System.out.println("Window(" + i + ")");
    }
}

class House {
    Window w1 = new Window(1);
    Window w2 = new Window(2);
    Window w3 = new Window(3);
    House() {
        System.out.println("House()");
        w3 = new Window(33);
    }
    void f() {
        System.out.println("f()");
    }
}

class Bowl {
    Bowl(int i) {
        System.out.println("Bowl(" + i + ")");
    }
    void f1(int i) {
        System.out.println("f1(" + i + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);
    static Bowl bowl2 = new Bowl(2);
    Table() {
        System.out.println("Table()");
        bowl2.f1(2);
    }
    void f2(int i) {
        System.out.println("f2(" + i + ")");
    }
}

class CupBoard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    static Bowl bowl5 = new Bowl(5);
    CupBoard() {
        System.out.println("CupBoard()");
        bowl4.f1(5);
    }
    void f3(int i) {
        System.out.println("f3(" + i + ")");
    }
}