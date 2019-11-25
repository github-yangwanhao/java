package cn.yangwanhao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * description
 *
 * @author 杨万浩
 * @version 1.0.0
 * @date 2019/11/13 15:25
 */

public class DateTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2019-11-12");
        Date date2 = sdf.parse("2019-11-13");
        Date date3 = sdf.parse("2019-12-12");
        System.out.println(date1.getMonth());
        System.out.println(date2.getMonth());
        System.out.println(date3.getMonth());
        System.out.println(date1.getMonth() == date2.getMonth());
        System.out.println(date1.getMonth() == date3.getMonth());
    }
}
