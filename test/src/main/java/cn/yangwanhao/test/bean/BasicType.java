package cn.yangwanhao.test.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 杨万浩
 * @description BasicType类
 * @date 2020/3/7 07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicType {
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
