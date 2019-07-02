package com.item.dao;

import com.item.pojo.SpecParam;
import com.item.pojo.SpecParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecParamMapper {
    long countByExample(SpecParamExample example);

    int deleteByExample(SpecParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpecParam record);

    int insertSelective(SpecParam record);

    List<SpecParam> selectByExample(SpecParamExample example);

    SpecParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpecParam record, @Param("example") SpecParamExample example);

    int updateByExample(@Param("record") SpecParam record, @Param("example") SpecParamExample example);

    int updateByPrimaryKeySelective(SpecParam record);

    int updateByPrimaryKey(SpecParam record);
}