package cn.yangwanhao.base.common.support;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * BaseQueryPageDto
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2020/7/20 14:36
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseQueryPageDto implements Serializable {

    private static final long serialVersionUID = -3133418092766629129L;

    /**
     * 页码
     */
    private Integer pageNum = 1;

    /**
     * 页面大小
     */
    private Integer pageSize = 10;

}
