package cn.yangwanhao.bookshop.controller.goods.mapper;

import cn.yangwanhao.bookshop.common.pojo.goods.GoodsBase;
import cn.yangwanhao.bookshop.common.pojo.goods.GoodsBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsBaseMapper {
    int countByExample(GoodsBaseExample example);

    int deleteByExample(GoodsBaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsBase record);

    int insertSelective(GoodsBase record);

    List<GoodsBase> selectByExample(GoodsBaseExample example);

    GoodsBase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsBase record, @Param("example") GoodsBaseExample example);

    int updateByExample(@Param("record") GoodsBase record, @Param("example") GoodsBaseExample example);

    int updateByPrimaryKeySelective(GoodsBase record);

    int updateByPrimaryKey(GoodsBase record);
}