package cn.yangwanhao.test;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/25 15:35
 */

public class ValidateCodeTest {

    /**
     * 设原代码：12345
     * 对应的权数：32 16 8 4 2 （取几何数）
     * 求乘积之和 S = 1*32 + 2*16 + 3*8 + 4*4 + 5*2 = 114
     * 取模(设模为11) R = Smod(11) = 114 % 11 = 4
     * 得校验码 C6 = 11 - 4 = 7
     * 最后得到带校验码的代码123457，其中7是校验码
     */

    private static final Integer ORIGINAL_CODE = 12345;
    private static final Integer MOD = 11;

    public static void main(String[] args) {
        String validateCode = Integer.toString(getValidateCode(ORIGINAL_CODE));
        System.out.println(validateCode);
        System.out.println(ORIGINAL_CODE + validateCode);
    }

    private static Integer getValidateCode(Integer originalCode) {
        // 将 12345 分割成 1 2 3 4 5
        List<Integer> list = getIntegerList(originalCode);
        // 计算乘积之和
        int product = 0;
        int i =  list.size();
        for (Integer num : list) {
            product += num << i;
            i--;
        }
        // 计算模
        int r = product % MOD;
        // 计算校验码
        return (product/10) - r;
    }

    private static List<Integer> getIntegerList(int num) {
        List<Integer> list = new ArrayList<>(Integer.toString(num).length());
        if (num > 9) {
            list.addAll(getIntegerList(num / 10));
        }
        list.add(num % 10);
        return list;
    }

}
