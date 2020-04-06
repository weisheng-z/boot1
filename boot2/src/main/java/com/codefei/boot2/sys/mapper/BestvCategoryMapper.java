package com.codefei.boot2.sys.mapper;

import com.codefei.boot2.sys.entity.BestvCategory;

import java.util.List;

public interface BestvCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BestvCategory record);

    int insertSelective(BestvCategory record);

    BestvCategory selectByPrimaryKey(Integer id);

    List<BestvCategory> selectBestvCategory();

    int updateByPrimaryKeySelective(BestvCategory record);

    int updateByPrimaryKey(BestvCategory record);
}