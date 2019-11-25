package cn.yangwanhao.bookshop.controller.order.mapper;

import cn.yangwanhao.bookshop.common.pojo.order.PayRecord;
import cn.yangwanhao.bookshop.common.pojo.order.PayRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayRecordMapper {
    int countByExample(PayRecordExample example);

    int deleteByExample(PayRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PayRecord record);

    int insertSelective(PayRecord record);

    List<PayRecord> selectByExample(PayRecordExample example);

    PayRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PayRecord record, @Param("example") PayRecordExample example);

    int updateByExample(@Param("record") PayRecord record, @Param("example") PayRecordExample example);

    int updateByPrimaryKeySelective(PayRecord record);

    int updateByPrimaryKey(PayRecord record);
}