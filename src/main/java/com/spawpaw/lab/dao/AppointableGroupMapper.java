package com.spawpaw.lab.dao;

import com.spawpaw.lab.entity.AppointableGroup;
import com.spawpaw.lab.entity.AppointableGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppointableGroupMapper {
    long countByExample(AppointableGroupExample example);

    int deleteByExample(AppointableGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppointableGroup record);

    int insertSelective(AppointableGroup record);

    List<AppointableGroup> selectByExample(AppointableGroupExample example);

    AppointableGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppointableGroup record, @Param("example") AppointableGroupExample example);

    int updateByExample(@Param("record") AppointableGroup record, @Param("example") AppointableGroupExample example);

    int updateByPrimaryKeySelective(AppointableGroup record);

    int updateByPrimaryKey(AppointableGroup record);
}