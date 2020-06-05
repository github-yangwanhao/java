package cn.yangwanhao.test;

import org.apache.commons.lang3.StringUtils;

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
        // 测试字符串分隔
        String originalName = "aaa.jpg";
        String addStr = "_80x80";
        String thumbnailName = "aaa_80x80.jpg";
        StringBuffer sb = new StringBuffer();
        // 原图获取缩略图
        sb.append(StringUtils.substringBeforeLast(originalName, "."))
                .append(addStr)
                .append(".")
                .append(StringUtils.substringAfterLast(originalName, "."));
        System.out.println(sb.toString().equals(thumbnailName));
        // 缩略图获取原图
        sb.delete(0, sb.length());
        String prefix = StringUtils.substringBeforeLast(thumbnailName, ".");
        // jpg
        String extension = StringUtils.substringAfterLast(thumbnailName, ".");
        prefix = prefix.substring(0, prefix.length()-addStr.length());
        sb.append(prefix).append(".").append(extension);
        System.out.println(sb.toString().equals(originalName));
        String message1 = "order:orderNo:123456789123456789";
        String message2 = "order:orderNo:987654321587210";
        String message3 = "order:orderNo:17615648315624581455482111";
        System.out.println(message1.substring(message1.lastIndexOf(":")+1));
        System.out.println(message2.substring(message2.lastIndexOf(":")+1));
        System.out.println(message3.substring(message3.lastIndexOf(":")+1));
        // 测试hashcode相同但是不是同一个对象
        String hashcode1 = "hashcode";
        String hashcode2 = new String("hashcode");
        System.out.println(hashcode1.equals(hashcode2));
        System.out.println(hashcode1 == hashcode2);
        System.out.println(hashcode1.hashCode());
        System.out.println(hashcode2.hashCode());
    }
}
