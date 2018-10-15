package com.qst.mapper;

import com.qst.pojo.AuctionRecord;
import com.qst.pojo.AuctionRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuctionRecordMapper {
    int countByExample(AuctionRecordExample example);

    int deleteByExample(AuctionRecordExample example);

    int deleteByPrimaryKey(Integer arId);

    int insert(AuctionRecord record);

    int insertSelective(AuctionRecord record);

    List<AuctionRecord> selectByExample(AuctionRecordExample example);

    AuctionRecord selectByPrimaryKey(Integer arId);

    int updateByExampleSelective(@Param("record") AuctionRecord record, @Param("example") AuctionRecordExample example);

    int updateByExample(@Param("record") AuctionRecord record, @Param("example") AuctionRecordExample example);

    int updateByPrimaryKeySelective(AuctionRecord record);

    int updateByPrimaryKey(AuctionRecord record);
}