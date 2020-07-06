package cn.yangwanhao.writtenexamination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 1~100共一百个整数中有98个被放到了数组a[98]中，请写程序找出没有被放入数组的那2个数。
 *
 * @author 杨万浩
 * @since 2020/7/6 10:00
 */
public class FoundNumberNotExistsTest {

    private static final int START = 1;

    private static final int END = 100;

    private static Integer[] RANDOM_ARRAY = new Integer[98];

    private static Random random = new Random();

    public static void main(String[] args) {
        RANDOM_ARRAY = getRandomNumArray();
        printNumNotExist();
        Arrays.sort(RANDOM_ARRAY);
        printArray(RANDOM_ARRAY);
    }

    private static void printNumNotExist() {
        // 初始全部是0
        // 这里不能用Integer创建数组,因为Integer默认值是null,在下面判断时会出现NPE,也可以修改下面的判断条件
        // Integer[] arrayTemp = new Integer[101];
        int[] arrayTemp = new int[101];
        // 给98个自然数标识为1
        for (Integer num : RANDOM_ARRAY) {
            arrayTemp[num] = 1;
        }
        // 从1开始遍历,遇到0则输出
        for (int i =START; i <=END; i++) {
            // if (null == arrayTemp[i]) {
            if (arrayTemp[i]==0) {
                System.out.println(i);
            }
        }
    }

    private static Integer[] getRandomNumArray() {
        List<Integer> list = new ArrayList<>();
        do {
            int num = random.nextInt(END) + 1;
            if (list.contains(num)) {
                continue;
            }
            list.add(num);
        } while (list.size() < 98);
        return list.toArray(new Integer[0]);
    }

    private static void printArray(Object[] array) {
        for (Object o : array) {
            System.out.print(o + ";");
        }
    }

}
