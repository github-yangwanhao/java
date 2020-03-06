package cn.yangwanhao.test;

import cn.yangwanhao.test.bean.User;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2020/1/2 9:43
 */

public class FinalTest {

    /**
     * final 修饰基本类型不可更改(数值恒定不变)
     * final 修饰引用类型(引用恒定不变,一旦引用被初始化并指定一个对象,那么这个引用不可被更改至指向其他对象,但是这个引用指向的对象本身的值是可以更改的)
     */

    private static final byte BYTE_VALUE = 1;
    private static final int INT_VALUE = 1;

    private static final User USER = new User("杨万浩", 22);

    public static void main(String[] args) {
        // Error final 修饰的基本类型不允许更改
        // BYTE_VALUE = 2;
        // Error final 修饰的引用类型不允许更换引用指向的对象
        // USER = new User("aaa", 21);
        System.out.println(BYTE_VALUE);
        System.out.println(INT_VALUE);
        // User(name=杨万浩, age=22)
        System.out.println(USER);
        USER.setAge(23);
        // User(name=杨万浩, age=23)
        System.out.println(USER);
    }

}

