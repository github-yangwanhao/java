package cn.yangwanhao.test.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨万浩
 * @description Category类
 * @date 2020/3/6 19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable {

    private Integer id;

    private String name;

    private Boolean isParent;

    private Integer parentId;

    public static List<Department> getAllDepartment() {
        List<Department> list= new ArrayList<>(10);
        list.add(new Department(1, "a", true, 0));
        list.add(new Department(2, "aa1", true, 1));
        list.add(new Department(3, "aa2", true, 1));
        list.add(new Department(4, "aaa1", false, 2));
        list.add(new Department(5, "b", true, 0));
        list.add(new Department(6, "c", false, 0));
        list.add(new Department(7, "d", true, 0));
        list.add(new Department(8, "b1", false, 5));
        list.add(new Department(9, "d1", false, 7));
        list.add(new Department(10, "aaa2", false, 2));
        return list;
    }

    public static List<Department> getTopDepartment() {
        List<Department> topList = new ArrayList();
        List<Department> allData = getAllDepartment();
        for (Department department : allData) {
            if (department.getParentId() == 0) {
                topList.add(department);
            }
        }
        return topList;
    }

    public static List<Department> getChildrenDepartment(Department root) {
        List<Department> children = new ArrayList<>();
        List<Department> allData = getAllDepartment();
        for (Department department : allData) {
            if (department.getParentId().equals(root.getId())) {
                children.add(department);
            }
        }
        return children;
    }

}
