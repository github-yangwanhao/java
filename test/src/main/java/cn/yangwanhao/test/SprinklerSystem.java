package cn.yangwanhao.test;

import lombok.AllArgsConstructor;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/31 14:39
 */

public class SprinklerSystem {

    private String value1, value2, value3, value4;

    private WaterSource waterSource = new WaterSource();

    private int i;

    private float f;

    public static void main(String[] args) {
        SprinklerSystem system = new SprinklerSystem();
        System.out.println(system);
    }

    @Override
    public String toString() {
        return "value1 = " + value1 + " " +
                "value2 = " + value2 + " " +
                "value3 = " + value3 + " " +
                "value4 = " + value4 + " " +
                "i = " + i + " " +
                "f = " + f + " " +
                "waterSource = " + waterSource;
    }

}

class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource Constructor");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

class Soap {
    private String s;
    Soap() {
        System.out.println("Soap Constructor");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

class Bath {
    private String s1 = "Happy", s2 = "Happy", s3, s4;
    private int i;
    private float f;
    private Soap soap;

    Bath() {
        System.out.println("Bath Constructor");
        s3 = "Joy";
        f = 3.14F;
        soap = new Soap();
    }
    {
        i = 47;
    }
    @Override
    public String toString() {
        return "s1 = " + s1 + " " +
                "s2 = " + s2 + " " +
                "s3 = " + s3 + " " +
                "s4 = " + s4 + " " +
                "i = " + i + " " +
                "f = " + f + " " +
                "soap = " + soap;
    }

    public static void main(String[] args) {
        System.out.println(new Bath());
    }
}

@AllArgsConstructor
class Father {
    private int i;
}

class Children extends Father {

    public Children() {
        /*
         * 这里会报错 因为子类构造方法会调用父类的默认构造方法(无参构造方法) 或者 如下所示指定调用父类的哪一个构造方法
         */
        // super();
        super(1);
    }

    public Children(int i) {
        super(i);
    }
}