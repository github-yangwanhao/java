package cn.yangwanhao.test.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author 杨万浩
 * @description CategoryTreeVo类
 * @date 2020/3/6 19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentTreeVo implements Serializable {

    private Integer id;

    private Integer name;

    private List<DepartmentTreeVo> children;

}
