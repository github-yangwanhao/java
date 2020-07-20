package cn.yangwanhao.base.common.enums;

import cn.yangwanhao.base.common.exception.BasicException;
import lombok.Getter;

/**
 *
 * 性别枚举类：0女1男
 *
 * @author 杨万浩
 * @date 2019/10/14 09:52
 * @version 1.0.0
 */

public enum GenderEnum {
    /**
     * 男
     */
    MAN(1, "男"),
    /**
     * 女
     */
    WOMAN(0, "女");

    @Getter
    private Integer key;
    @Getter
    private String value;

    GenderEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public GenderEnum getValueByKey(Integer key) {
        for (GenderEnum item : values()) {
            if (item.getKey().equals(key)) {
                return item;
            }
        }
        throw new BasicException(BasicErrorCodeEnum.G500301);
    }

}
