package cn.yangwanhao.bookshop.controller.user.mapper;

import cn.yangwanhao.bookshop.common.pojo.user.CustomerAddress;
import cn.yangwanhao.bookshop.common.pojo.user.CustomerAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerAddressMapper {
    int countByExample(CustomerAddressExample example);

    int deleteByExample(CustomerAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerAddress record);

    int insertSelective(CustomerAddress record);

    List<CustomerAddress> selectByExample(CustomerAddressExample example);

    CustomerAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerAddress record, @Param("example") CustomerAddressExample example);

    int updateByExample(@Param("record") CustomerAddress record, @Param("example") CustomerAddressExample example);

    int updateByPrimaryKeySelective(CustomerAddress record);

    int updateByPrimaryKey(CustomerAddress record);
}