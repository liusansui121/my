package com.item.dao;

import com.item.pojo.SpuDetail;
import com.item.pojo.SpuDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpuDetailMapper {
    long countByExample(SpuDetailExample example);

    int deleteByExample(SpuDetailExample example);

    int insert(SpuDetail record);

    int insertSelective(SpuDetail record);

    List<SpuDetail> selectByExampleWithBLOBs(SpuDetailExample example);

    List<SpuDetail> selectByExample(SpuDetailExample example);

    int updateByExampleSelective(@Param("record") SpuDetail record, @Param("example") SpuDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") SpuDetail record, @Param("example") SpuDetailExample example);

    int updateByExample(@Param("record") SpuDetail record, @Param("example") SpuDetailExample example);
}