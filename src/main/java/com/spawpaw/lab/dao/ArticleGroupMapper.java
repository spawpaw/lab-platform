package com.spawpaw.lab.dao;

import com.spawpaw.lab.entity.ArticleGroup;
import com.spawpaw.lab.entity.ArticleGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleGroupMapper {
    long countByExample(ArticleGroupExample example);

    int deleteByExample(ArticleGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArticleGroup record);

    int insertSelective(ArticleGroup record);

    List<ArticleGroup> selectByExample(ArticleGroupExample example);

    ArticleGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArticleGroup record, @Param("example") ArticleGroupExample example);

    int updateByExample(@Param("record") ArticleGroup record, @Param("example") ArticleGroupExample example);

    int updateByPrimaryKeySelective(ArticleGroup record);

    int updateByPrimaryKey(ArticleGroup record);
}