package com.spawpaw.lab.dao;

import com.spawpaw.lab.entity.DetailedLostAndFound;
import com.spawpaw.lab.entity.DetailedLostAndFoundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetailedLostAndFoundMapper {
    long countByExample(DetailedLostAndFoundExample example);

    int deleteByExample(DetailedLostAndFoundExample example);

    int insert(DetailedLostAndFound record);

    int insertSelective(DetailedLostAndFound record);

    List<DetailedLostAndFound> selectByExample(DetailedLostAndFoundExample example);

    int updateByExampleSelective(@Param("record") DetailedLostAndFound record, @Param("example") DetailedLostAndFoundExample example);

    int updateByExample(@Param("record") DetailedLostAndFound record, @Param("example") DetailedLostAndFoundExample example);
}