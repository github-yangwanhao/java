package cn.yangwanhao.base.common.enums;

import cn.yangwanhao.base.common.exception.BasicException;
import lombok.Getter;

/**
 * 全局"是否"枚举类 1是0否
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2020/7/20 14:26
 */
public enum BooleanEnum {

    /**
     * 1 是
     */
    TRUE(1, "是"),
    /**
     * 0 否
     */
    FALSE(0, "否");

    @Getter
    private int key;
    @Getter
    private String value;

    BooleanEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public BooleanEnum getValueByKey(Integer key) {
        for (BooleanEnum item : values()) {
            if (item.getKey() == key) {
                return item;
            }
        }
        throw new BasicException(BasicErrorCodeEnum.G500301);
    }

}