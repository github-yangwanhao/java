package cn.yangwanhao.test;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/30 9:54
 */

public class BitOperationTest {

    public static void main(String[] args) {

        /*
         * & 操作是按位与运算: 两个输入位都是1 则输出1 否则输出0: (1 & 1 == 1; 1 & 0 == 0; 0 & 0 == 0)
         * 1 & 1 =1; 2 & 1 = 0; 3 & 1 = 1; 4 & 1 = 0 由此可见: 奇数 & 1 == 1；/ 偶数 & 1 == 0
         */
        System.out.println("------------------------- & ----------------------------");
        // 1
        System.out.println("1 & 1 = " + (1 & 1));
        // 0
        System.out.println("2 & 1 = " + (2 & 1));
        // 1
        System.out.println("3 & 1 = " + (3 & 1));
        // 0
        System.out.println("4 & 1 = " + (4 & 1));
        // 2
        System.out.println("3 & 2 = " + (3 & 2));
        // 0
        System.out.println("4 & 2 = " + (4 & 2));
        // 0
        System.out.println("5 & 2 = " + (5 & 2));
        // 2
        System.out.println("6 & 2 = " + (6 & 2));

        /*
         * | 操作是按位或操作: 两个输入位都是0 则输出0 否则输出1: (0 | 0 == 0; 1 | 1 == 1; 1 | 0 == 1)
         */
        System.out.println("------------------------- | ----------------------------");
        // 1
        System.out.println("1 | 1 = " + (1 | 1));
        // 1
        System.out.println("1 | 0 = " + (1 | 0));
        // 0
        System.out.println("0 | 0 = " + (0 | 0));
        // 3
        System.out.println("2 | 1 = " + (2 | 1));
        // 3
        System.out.println("3 | 1 = " + (3 | 1));
        // 3
        System.out.println("3 | 2 = " + (3 | 2));
        // 6
        System.out.println("4 | 2 = " + (4 | 2));

        /*
         * ^ 操作是异或操作: 两个数想同(同1或者同0) 则输出0 两个数不相同(一个是1一个是0) 则输出1
         * 1 ^ 1 == 0; 0 ^ 0 == 0; 1 ^ 0 == 1
         */
        System.out.println("------------------------- ^ ----------------------------");
        // 0
        System.out.println("1 ^ 1 = " + (1 ^ 1));
        // 1
        System.out.println("1 ^ 0 = " + (1 ^ 0));
        // 0
        System.out.println("0 ^ 0 = " + (0 ^ 0));
        // 3
        System.out.println("2 ^ 1 = " + (2 ^ 1));
        // 2
        System.out.println("3 ^ 1 = " + (3 ^ 1));

        /*
         * ~ 操作是按位非操作: 也称为按位取反操作,是一元操作符,只对一个操作数进行操作; 按位非生成与输入位相反的值, ~1 == 0; ~0 == 1
         */
        // TODO 取反操作涉及到了反码和补码 1; 0000 0001; 取反是 1111 1110; 补码就是 1111 1101; 原码就是 1000 0010; 符号位 1负0正 所以是-2
        System.out.println("------------------------- ~ ----------------------------");
        // -1
        System.out.println("~0 = " + ~0);
        // 0
        System.out.println("~1 = " + ~1);
        // 1
        System.out.println("~2 = " + ~2);
        // 0
        System.out.println("~3 = " + ~3);
        // 1
        System.out.println("~4 = " + ~4);

        /*
         * << 左移操作符 将操作数向左移动,低位补0 100 << 2:将100向左移动2位 X << n相当于乘以 X * (2^n)
         * >> 右移操作符 将操作数向右移动,若操作数是正数高位补0,反之高位补1 100 << 2:将100向右移动2位 X >> n相当于乘以 X / (2^n)
         * >>> 无符号右移 将操作数向右移动 无论正负 都在高位补0
         */
        System.out.println("------------------------- << ----------------------------");
        System.out.println("100 << 2 = " + (100 << 2));
        System.out.println("100移位前 " + Integer.toBinaryString(100));
        System.out.println("100移位后 " + Integer.toBinaryString((100 << 2)));
        System.out.println("------------------------- >>正数 ----------------------------");
        System.out.println("100 >> 2 = " + (100 >> 2));
        System.out.println("100移位前 " + Integer.toBinaryString(100));
        System.out.println("100移位后 " + Integer.toBinaryString((100 >> 2)));
        System.out.println("------------------------- >>负数 ----------------------------");
        System.out.println("-100 >> 2 = " + (-100 >> 2));
        // TODO 看不懂 -100移位前 11111111111111111111111110011100
        System.out.println("-100移位前 " + Integer.toBinaryString(-100));
        // TODO 看不懂 -100移位后 11111111111111111111111111100111
        System.out.println("-100移位后 " + Integer.toBinaryString((-100 >> 2)));
    }

}
