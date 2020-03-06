package cn.yangwanhao.test;

import cn.yangwanhao.test.bean.Department;

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
