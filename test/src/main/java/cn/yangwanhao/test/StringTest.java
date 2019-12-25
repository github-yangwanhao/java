package cn.yangwanhao.test;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/12/13 10:56
 */

public class StringTest {

    public static void main(String[] args) {
        String punish = "171,172,173,185";
        System.out.println(punish.contains("171"));
        System.out.println(punish.contains("170"));
        // 测试手机号脱敏
        String phone = "18337281539";
        System.out.println(phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2"));
        String dateStr1 = "2017-01";
        String dateStr2 = "2017.01";
        System.out.println(dateStr1.replace('-','.'));
        System.out.println(dateStr2.replace('-','.'));
    }
}
