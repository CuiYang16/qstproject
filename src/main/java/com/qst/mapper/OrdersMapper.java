package com.qst.mapper;

import com.qst.pojo.Orders;
import com.qst.pojo.OrdersExample;
import com.qst.pojo.OrdersWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int insert(OrdersWithBLOBs record);

    int insertSelective(OrdersWithBLOBs record);

    List<OrdersWithBLOBs> selectByExampleWithBLOBs(OrdersExample example);

    List<Orders> selectByExample(OrdersExample example);

    int updateByExampleSelective(@Param("record") OrdersWithBLOBs record, @Param("example") OrdersExample example);

    int updateByExampleWithBLOBs(@Param("record") OrdersWithBLOBs record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);
}