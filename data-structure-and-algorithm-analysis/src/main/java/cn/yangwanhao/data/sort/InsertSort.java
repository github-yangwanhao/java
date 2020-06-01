package cn.yangwanhao.data.sort;


/**
 * description InsertSort类 插入排序
 *
 * @author 杨万浩
 * @date 2020/5/28 10:59
 */
public class InsertSort {

    /**
     * Description: 插入算法，将数据分为两个数组，一个有序数组一个无序数组
     * @param args args
     * @author 杨万浩
     * @date 2020/5/30 22:41
     */
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 7, 2, 8, 9, 10, 5};
        insertSort1(array);
        print(array);
    }

   private static void insertSort1(int[] array) {
        int j;
        for (int i=0; i<array.length; i++) {
            int tmp = array[i];
            for (j=i; j>0 && tmp<array[j-1]; j--) {
                array[j] = array[j-1];
            }
            array[j] = tmp;
        }
   }

    private static void print(int[] array) {
        for (int num : array) {
            System.out.print(num + "\t");
        }
        System.out.println();
        System.out.println("----------end-----------");
    }

}
