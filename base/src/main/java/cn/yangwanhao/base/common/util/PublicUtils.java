package cn.yangwanhao.base.common.util;

import cn.yangwanhao.base.common.enums.BasicErrorCodeEnum;
import cn.yangwanhao.base.common.exception.BasicException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * PublicUtil
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/19 10:21
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PublicUtils {


    /**
     * Description: 获取脱敏手机号(前3 + **** + 后4)
     * @param phone 手机号
     * @return 脱敏手机号
     */
    public static String getMaskPhone(String phone) {
        return phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
    }

}
