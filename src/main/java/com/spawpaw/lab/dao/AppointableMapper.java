package com.spawpaw.lab.dao;

import com.spawpaw.lab.entity.Appointable;
import com.spawpaw.lab.entity.AppointableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppointableMapper {
    long countByExample(AppointableExample example);

    int deleteByExample(AppointableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Appointable record);

    int insertSelective(Appointable record);

    List<Appointable> selectByExample(AppointableExample example);

    Appointable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Appointable record, @Param("example") AppointableExample example);

    int updateByExample(@Param("record") Appointable record, @Param("example") AppointableExample example);

    int updateByPrimaryKeySelective(Appointable record);

    int updateByPrimaryKey(Appointable record);
}