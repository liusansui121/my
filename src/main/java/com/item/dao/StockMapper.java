package com.item.dao;

import com.item.pojo.Stock;
import com.item.pojo.StockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockMapper {
    long countByExample(StockExample example);

    int deleteByExample(StockExample example);

    int insert(Stock record);

    int insertSelective(Stock record);

    List<Stock> selectByExample(StockExample example);

    int updateByExampleSelective(@Param("record") Stock record, @Param("example") StockExample example);

    int updateByExample(@Param("record") Stock record, @Param("example") StockExample example);
}