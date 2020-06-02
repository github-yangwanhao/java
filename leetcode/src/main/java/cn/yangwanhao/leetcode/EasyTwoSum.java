package cn.yangwanhao.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * description TwoSum类
 *
 * @author 杨万浩
 * @date 2020/5/29 08:26
 */
public class EasyTwoSum {

    public static void main(String[] args) {
        /**
         * 给定数组array
         * 给定数字target
         * array中有且只有两个数字之和等于target，找出这两个数字的下标，每个数字只能使用一次
         */
        int[] array = new int[] {1, 2, 3, 4, 6, 8, 9};
        int target = 8;
        print(test1(array, target));
        print(test2(array, target));
        print(test3(array, target));
    }

    /**
     * Description: 暴力破解法，遍历数组中每一个元素x，并寻找是否有与target-x相等的元素
     * @param array 数组
     * @param target 数字
     * @return 下标
     * @author 杨万浩
     * @date 2020/5/29 9:17
     */
    private static int[] test1(int[] array, int target) {
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new RuntimeException("No two sum solution");
    }

    /**
     * Description: 使用hash表，HashMap.containsKey()方法和HashMap.get()时间复杂度都是O(1)
     * @param array 数组
     * @param target 数字
     * @return 下标
     * @author 杨万浩
     * @date 2020/5/29 9:27
     */
    private static int[] test2(int[] array, int target) {
        // 将数组放入HashMap中 key是值 value是下标
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<array.length; i++) {
            map.put(array[i], i);
        }
        // 遍历数组每一个元素x，检查HashMap中是否有与target-x相等的值，注意该元素不能是x自身
        for (int i=0; i<array.length; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
        }
        throw new RuntimeException("No two sum solution");
    }

    /**
     * Description: 与test2思路相同，但是改为在将元素放入HashMap中的时候就检查，如果有则直接返回，没有则放入Map，还避免了与自身相同
     * @param array 数组
     * @param target 数字
     * @return 下标
     * @author 杨万浩
     * @date 2020/5/29 9:34
     */
    private static int[] test3(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<array.length; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                return new int[] {i, map.get(complement)};
            }
            map.put(array[i], i);
        }
        throw new RuntimeException("No two sum solution");
    }

    private static void print(int[] array) {
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println("---------------------------------------------");
    }
}
