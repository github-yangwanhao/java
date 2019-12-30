package cn.yangwanhao.test;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/30 13:43
 */

public class MethodParamTest {

    /**
     * f1 全类型
     */
    private static void f1(byte b) {
        System.out.println("f1()--> byte");
    }
    private static void f1(short s) {
        System.out.println("f1()--> short");
    }
    private static void f1(int i) {
        System.out.println("f1()--> int");
    }
    private static void f1(long l) {
        System.out.println("f1()--> long");
    }
    private static void f1(double d) {
        System.out.println("f1()--> double");
    }
    private static void f1(float f) {
        System.out.println("f1()--> float");
    }
    private static void f1(char c) {
        System.out.println("f1()--> char");
    }
    private static void f1(boolean b) {
        System.out.println("f1()--> boolean");
    }

    /**
     * f2 数字类型
     */
    private static void f2(byte b) {
        System.out.println("f2()--> byte");
    }
    private static void f2(short s) {
        System.out.println("f2()--> short");
    }
    private static void f2(int i) {
        System.out.println("f2()--> int");
    }
    private static void f2(long l) {
        System.out.println("f2()--> long");
    }
    private static void f2(double d) {
        System.out.println("f2()--> double");
    }
    private static void f2(float f) {
        System.out.println("f2()--> float");
    }

    /**
     * short int long double float
     */
    private static void f3(short s) {
        System.out.println("f3()--> short");
    }
    private static void f3(int i) {
        System.out.println("f3()--> int");
    }
    private static void f3(long l) {
        System.out.println("f3()--> long");
    }
    private static void f3(double d) {
        System.out.println("f3()--> double");
    }
    private static void f3(float f) {
        System.out.println("f3()--> float");
    }

    /**
     * int long double float
     */
    private static void f4(int i) {
        System.out.println("f4()--> int");
    }
    private static void f4(long l) {
        System.out.println("f4()--> long");
    }
    private static void f4(double d) {
        System.out.println("f4()--> double");
    }
    private static void f4(float f) {
        System.out.println("f4()--> float");
    }

    /**
     * long double float
     */
    private static void f5(long l) {
        System.out.println("f5()--> long");
    }
    private static void f5(double d) {
        System.out.println("f5()--> double");
    }
    private static void f5(float f) {
        System.out.println("f5()--> float");
    }

    /**
     * double float
     */
    private static void f6(double d) {
        System.out.println("f6()--> double");
    }
    private static void f6(float f) {
        System.out.println("f6()--> float");
    }

    /**
     * double
     */
    private static void f7(double d) {
        System.out.println("f7()--> double");
    }

    private static void testByte(byte i) {
        System.out.println(i);
        f1(i); f2(i); f3(i); f4(i); f5(i); f6(i); f7(i);
        System.out.println("--------------------------------------------------------------");
    }

    private static void testShort(short i) {
        System.out.println(i);
        f1(i); f2(i); f3(i); f4(i); f5(i); f6(i); f7(i);
        System.out.println("--------------------------------------------------------------");
    }

    private static void testInt(int i) {
        System.out.println(i);
        f1(i); f2(i); f3(i); f4(i); f5(i); f6(i); f7(i);
        System.out.println("--------------------------------------------------------------");
    }

    private static void testLong(long i) {
        System.out.println(i);
        f1(i); f2(i); f3(i); f4(i); f5(i); f6(i); f7(i);
        System.out.println("--------------------------------------------------------------");
    }

    private static void testDouble(double i) {
        System.out.println(i);
        f1(i); f2(i); f3(i); f4(i); f5(i); f6(i); f7(i);
        System.out.println("--------------------------------------------------------------");
    }

    private static void testFloat(float i) {
        System.out.println(i);
        f1(i); f2(i); f3(i); f4(i); f5(i); f6(i); f7(i);
        System.out.println("--------------------------------------------------------------");
    }

    private static void testChar(char i) {
        System.out.println(i);
        f1(i); f2(i); f3(i); f4(i); f5(i); f6(i); f7(i);
        System.out.println("--------------------------------------------------------------");
    }

    private static void testConstant() {
        System.out.println(5);
        f1(5); f2(5); f3(5); f4(5); f5(5); f6(5); f7(5);
        System.out.println("--------------------------------------------------------------");
    }

    public static void main(String[] args) {
        // testConstant();

        /*byte byteValue = 5;
        testByte(byteValue);*/

        /*short shortValue = 5;
        testShort(shortValue);*/

        /*int intValue = 5;
        testInt(intValue);*/

        /*long longValue = 5L;
        testLong(longValue);*/

        /*float floatValue = 5F;
        testFloat(floatValue);*/

        /*double doubleValue = 5D;
        testDouble(doubleValue);*/

        char charValue = '5';
        testChar(charValue);
    }

}
