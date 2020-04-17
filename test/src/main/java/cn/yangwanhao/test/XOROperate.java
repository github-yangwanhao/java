package cn.yangwanhao.test;

/**
 * description XOROperate类
 *
 * @author 杨万浩
 * @date 2020/4/17 08
 */
public class XOROperate {

    public static void main(String[] args) {
        /*
         * 异或运算
         * 相同的数字异或得0
         * 不同的数字异或得1
         * 任何数字和0异或得本身
         */
        int a = 3, b=4;
        // 要求是不新增变量 把 a 和 b交换
        // 步骤1
        a = a^b;
        // 步骤2
        b = a^b;
        // 步骤3
        a = a^b;
        System.out.println("a = " + a + ", b = " + b);
        /*
         * 步骤1：a=3(011) b=4(100) a=a^b=7(111)
         * 步骤2：a=7(111) b=4(100) b=a^b=3(011)
         * 步骤3：a=7(111) b=3(011) a=a^b=4(100)
         */
        /*
         * 步骤1步骤2 a=a^b b=a^b 即 b = a^b^b = a (b^b=0; a^0=a) 所以经过步骤1步骤2 b=a
         * 步骤2得a = a^b b=a 即步骤3 a= a^b = a^b^a=b 得a=b
         */
        System.out.println("-----------------------------------------------------------");
        // 数组中有2n+1个数，其中一个出现单数次，剩下的都是出现双数次
        // 需求 找出那个出现单次数的数字
        int[] array = new int[]{1, 2, 2, 3, 3, 4, 4};
        int complete = 0;
        for (int num : array) {
            complete ^= num;
        }
        System.out.println("出现单次数的数字是："+complete);
        /*
         * 相同的数字异或得0 所以双数次数的数字相互异或最后结果都是0
         * 单数次数的数字与0异或得其本身
         */
    }

}
