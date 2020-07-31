package cn.yangwanhao.base.common.util.test;

import java.util.Date;

import org.junit.Test;

import cn.yangwanhao.base.common.util.DateUtils;

/**
 * DateUtilsTest
 *
 * @author 杨万浩
 * @since 2020/7/31 16:30
 */
public class DateUtilsTest {

    @Test
    public void testGetDayBegin() {
        System.out.println(DateUtils.getDayBegin(new Date()));
    }

    @Test
    public void testGetDayEnd() {
        System.out.println(DateUtils.getDayEnd(new Date()));
    }

}
