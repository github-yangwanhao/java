package cn.yangwanhao.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/27 13:56
 */

public class BasicTypeTest {

    public static void main(String[] args) {
        /*
         * 由结果可见,char类型的默认值是 \u0000 表现形式是一个空格 但是不等于一个空格
         */
        BasicType basicType = new BasicType();
        // BasicType(byteValue=0, shortValue=0, intValue=0, longValue=0, doubleValue=0.0, floatValue=0.0, charValue= , booleanValue=false, string=null, basicType=null)
        System.out.println(basicType);
        char c = '\u0000';
        // \u0000 作为字符的表现是一个空格
        System.out.println(c);
        // false 不是真的等于一个空格
        System.out.println(' ' == c);
        // false
        System.out.println(' ' == basicType.getCharValue());
        // \u0000 转化为整数后是0
        System.out.println((int) c);
        // true
        System.out.println(basicType.getCharValue() == c);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class BasicType {
        // byte 0
        private byte byteValue;
        // short 0
        private short shortValue;
        // int 0
        private int intValue;
        // long 0
        private long longValue;
        // double 0.0
        private double doubleValue;
        // float 0.0
        private float floatValue;
        // char \u0000 这个字符代表空
        private char charValue;
        // boolean false
        private boolean booleanValue;
        // null
        private String string;
        // null
        private BasicType basicType;
    }

}
