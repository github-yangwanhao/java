package cn.yangwanhao.test.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 杨万浩
 * @description GoodsCategoryTreeVo类
 * @date 2020/3/7 07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsCategoryTreeVo {

    private Integer id;

    private String text;

    private String state = "open";

    private List<GoodsCategoryTreeVo> children;
}
