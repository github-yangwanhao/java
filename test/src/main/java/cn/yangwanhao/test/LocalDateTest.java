package cn.yangwanhao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDateTest
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/10/20 19:46
 */
public class LocalDateTest {

    static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

    public static void main(String[] args) {
        // LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        // LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        // LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        String string = LocalDateTime.now().format(FORMATTER);
        System.out.println(string + " : " + string.length());
    }
}
