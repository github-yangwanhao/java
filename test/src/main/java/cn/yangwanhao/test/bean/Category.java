package cn.yangwanhao.test.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 杨万浩
 * @description Category类
 * @date 2020/3/7 07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private Integer id;

    private String name;

    private Integer parentId;

    private Integer isParent;

    private Integer sort;

    private static final long serialVersionUID = 1L;

}
