package cn.yangwanhao.base.common.util;

import org.apache.commons.lang3.StringUtils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author 杨万浩
 * @description ObjectUtils类
 * @date 2020/2/24 14
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ObjectUtils {

    public static String toString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

}
