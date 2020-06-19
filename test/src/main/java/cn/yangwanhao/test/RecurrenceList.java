package cn.yangwanhao.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/11/27 20:02
 */

public class RecurrenceList {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class Category {
        private Integer id;

        private String name;

        private Integer parentId;

        private Integer isParent;

        private Integer sort;

        private static final long serialVersionUID = 1L;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class GoodsCategoryTreeVo {

        private Integer id;

        private String text;

        private String state = "open";

        private List<GoodsCategoryTreeVo> children;
    }

    public static void main(String[] args) {
        System.out.println(getChildrenIds());
        System.err.println("--------------------------------------------------------------------------------");
        System.out.println(getTree());
    }

    // -----------------------------------------------------------------------------------------------------------------

    private static Set<Integer> getChildrenIds() {
        return getChildId(initCategoryList(), 1);
    }

    private static Set<Integer> getChildId(List<Category> categoryList, Integer id) {
        Set<Integer> set = new TreeSet<>();
        for (Category category : categoryList) {
            if (category.getParentId().equals(id)) {
                set.add(category.getId());
                set.addAll(getChildId(categoryList, category.getId()));
            }
        }
        return set;
    }

    // -----------------------------------------------------------------------------------------------------------------

    private static List<GoodsCategoryTreeVo> getTree() {
        List<Category> categoryList = initCategoryList();
        List<GoodsCategoryTreeVo> list = new ArrayList<>();
        for (Category category : categoryList) {
            if (category.getParentId() == 0) {
                GoodsCategoryTreeVo vo = new GoodsCategoryTreeVo();
                vo.setId(category.getId());
                vo.setText(category.getName());
                vo.setChildren(getChildren(categoryList, category));
                list.add(vo);
            }
        }
        return list;
    }

    private static List<GoodsCategoryTreeVo> getChildren(List<Category> categoryList, Category parentCategory) {
        List<GoodsCategoryTreeVo> resultList = new ArrayList<>();
        for (Category category : categoryList) {
            if (category.getParentId().equals(parentCategory.getId())) {
                GoodsCategoryTreeVo vo = new GoodsCategoryTreeVo();
                vo.setId(category.getId());
                vo.setText(category.getName());
                vo.setChildren(getChildren(categoryList, category));
                resultList.add(vo);
            }
        }
        return resultList;
    }

    private static List<Category> initCategoryList() {
        List<Category> categoryList = new ArrayList<>(10);
        Category category0 = new Category(1, "aaa", 0, 1, 1);
        Category category1 = new Category(2, "bbb", 1, 1, 2);
        Category category2 = new Category(3, "ccc", 0, 0, 3);
        Category category3 = new Category(4, "ddd", 2, 1, 4);
        Category category4 = new Category(5, "eee", 4, 1, 5);
        Category category5 = new Category(6, "fff", 4, 1, 6);
        Category category6 = new Category(7, "ggg", 5, 0, 7);
        Category category7 = new Category(8, "hhh", 6, 0, 8);
        Category category8 = new Category(9, "iii", 0, 0, 9);
        Category category9 = new Category(10, "jjj", 9, 0, 10);
        categoryList.add(category0);
        categoryList.add(category1);
        categoryList.add(category2);
        categoryList.add(category3);
        categoryList.add(category4);
        categoryList.add(category5);
        categoryList.add(category6);
        categoryList.add(category7);
        categoryList.add(category8);
        categoryList.add(category9);
        return categoryList;
    }
}

