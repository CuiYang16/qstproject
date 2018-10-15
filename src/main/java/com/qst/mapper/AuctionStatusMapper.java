package com.qst.mapper;

import com.qst.pojo.AuctionStatus;
import com.qst.pojo.AuctionStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuctionStatusMapper {
    int countByExample(AuctionStatusExample example);

    int deleteByExample(AuctionStatusExample example);

    int deleteByPrimaryKey(Integer asId);

    int insert(AuctionStatus record);

    int insertSelective(AuctionStatus record);

    List<AuctionStatus> selectByExample(AuctionStatusExample example);

    AuctionStatus selectByPrimaryKey(Integer asId);

    int updateByExampleSelective(@Param("record") AuctionStatus record, @Param("example") AuctionStatusExample example);

    int updateByExample(@Param("record") AuctionStatus record, @Param("example") AuctionStatusExample example);

    int updateByPrimaryKeySelective(AuctionStatus record);

    int updateByPrimaryKey(AuctionStatus record);
}