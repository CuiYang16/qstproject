package com.qst.mapper;

import com.qst.pojo.Business;
import com.qst.pojo.BusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessMapper {
    int countByExample(BusinessExample example);

    int deleteByExample(BusinessExample example);

    int deleteByPrimaryKey(Integer businessId);

    int insert(Business record);

    int insertSelective(Business record);

    List<Business> selectByExampleWithBLOBs(BusinessExample example);

    List<Business> selectByExample(BusinessExample example);

    Business selectByPrimaryKey(Integer businessId);

    int updateByExampleSelective(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByExampleWithBLOBs(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByExample(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKeyWithBLOBs(Business record);

    int updateByPrimaryKey(Business record);
}