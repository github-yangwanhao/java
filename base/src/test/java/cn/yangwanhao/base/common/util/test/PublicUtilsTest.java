package cn.yangwanhao.base.common.util.test;

import org.junit.Assert;
import org.junit.Test;

import cn.yangwanhao.base.common.exception.BasicException;
import cn.yangwanhao.base.common.util.PublicUtils;

/**
 * PublicUtilsTest
 *
 * @author 杨万浩
 * @since 2020/7/27 21:05
 */
public class PublicUtilsTest {

    @Test
    public void testMaskPhone() {
        String originPhone1 = "18337281539";
        String originPhone2 = "18337281540";
        String originPhone3 = "abc";
        Assert.assertEquals("183****1539", PublicUtils.getMaskPhone(originPhone1));
        Assert.assertEquals("183****1540", PublicUtils.getMaskPhone(originPhone2));
        Assert.assertThrows(BasicException.class, ()->PublicUtils.getMaskPhone(originPhone3));
    }

}
