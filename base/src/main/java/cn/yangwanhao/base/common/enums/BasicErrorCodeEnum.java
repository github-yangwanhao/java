package cn.yangwanhao.base.common.enums;

import cn.yangwanhao.base.common.exception.BasicException;
import lombok.Getter;

/**
 * 全局通用异常
 *
 * @author yangwh@yunrong.cn
 * @version V3.0
 * @since 2020/7/18 11:51
 */
public enum BasicErrorCodeEnum {

    /**
     * 全局异常以 G500 开头,101为第一个
     */
    G500101(500101, "参数异常"),
    G500102(500102, "参数不能为空"),

    /**
     * 格式不正确系列
     */
    G500201(500201, "数字格式不正确"),

    /**
     * 未找到系列
     */
    G500301(500301, "未找到该枚举类")
    ;

    @Getter
    private int code;
    @Getter
    private String msg;

    BasicErrorCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static BasicErrorCodeEnum getByCode(int code) {
        for (BasicErrorCodeEnum e : BasicErrorCodeEnum.values()) {
            if (e.getCode() == code) {
                return e;
            }
        }
        throw new BasicException(G500301);
    }

}
