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
        /**
         * 有结果可见,char类型的默认值是 \u0000 表现形式是一个空格 但是不等于一个空格
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
        int i = (int) c;
        // \u0000 转化为整数后是0
        System.out.println(i);
        // true
        System.out.println(basicType.getCharValue() == c);
    }

}

@Data
@NoArgsConstructor
@AllArgsConstructor
class BasicType {
    /**
     * byte 0
     * short 0
     * int 0
     * long 0
     * double 0.0
     * float 0.0
     * char \u0000 这个值字符代表空
     * boolean false
     */
    private byte byteValue;
    private short shortValue;
    private int intValue;
    private long longValue;
    private double doubleValue;
    private float floatValue;
    private char charValue;
    private boolean booleanValue;
    private String string;
    private BasicType basicType;
}
