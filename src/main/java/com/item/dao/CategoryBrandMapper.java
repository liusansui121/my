package com.item.dao;

import com.item.pojo.CategoryBrand;
import com.item.pojo.CategoryBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryBrandMapper {
    long countByExample(CategoryBrandExample example);

    int deleteByExample(CategoryBrandExample example);

    int insert(CategoryBrand record);

    int insertSelective(CategoryBrand record);

    List<CategoryBrand> selectByExample(CategoryBrandExample example);

    int updateByExampleSelective(@Param("record") CategoryBrand record, @Param("example") CategoryBrandExample example);

    int updateByExample(@Param("record") CategoryBrand record, @Param("example") CategoryBrandExample example);
}