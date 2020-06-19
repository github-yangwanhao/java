package cn.yangwanhao.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author 杨万浩
 * @description CategoryTreeGenerate类
 * @date 2020/3/6 19
 */
public class DepartmentTreeGenerate {

    public static void main(String[] args) {
        String prefix = "├─";
        // 方式一
        for (Department top : Department.getTopDepartment()) {
            showOneTree(top);
        }
        System.out.println("---------------");
        // 方式二
        showAllTree(Department.getTopDepartment(), prefix);
        System.out.println("---------------");
        // 方式3
        List<String> nameList = getNameList(prefix);
        for (String name : nameList) {
            System.out.println(name);
        }
    }

    /**
     * Description: 显示一颗分类树的节点信息
     * @author 杨万浩
     * @date 2020/3/6 19:48
     */
    private static void showOneTree(Department department) {
        // 顶点
        System.out.println(department.getName());
        // 子树
        for (Department child : Department.getChildrenDepartment(department)) {
            showOneTree(child);
        }
    }

    private static void showAllTree(Collection<Department> topList, String prefix) {
        for (Department top : topList) {
            System.out.println(prefix + top.getName());
            showAllTree(Department.getChildrenDepartment(top), "  "+prefix);
        }
    }

    private static List<String> getNameList(String prefix) {
        List<String> result = new ArrayList<>();
        setNameList(Department.getTopDepartment(), prefix, result);
        return result;
    }

    private static void setNameList(List<Department> topList, String prefix, List<String> result) {
        for (Department top : topList) {
            result.add(prefix + top.getName());
            setNameList(Department.getChildrenDepartment(top), "  "+prefix, result);
        }
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Department implements Serializable {

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

