package com.spawpaw.lab.dao;

import com.spawpaw.lab.entity.ArticleMark;
import com.spawpaw.lab.entity.ArticleMarkExample;
import com.spawpaw.lab.entity.ArticleMarkKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleMarkMapper {
    long countByExample(ArticleMarkExample example);

    int deleteByExample(ArticleMarkExample example);

    int deleteByPrimaryKey(ArticleMarkKey key);

    int insert(ArticleMark record);

    int insertSelective(ArticleMark record);

    List<ArticleMark> selectByExample(ArticleMarkExample example);

    ArticleMark selectByPrimaryKey(ArticleMarkKey key);

    int updateByExampleSelective(@Param("record") ArticleMark record, @Param("example") ArticleMarkExample example);

    int updateByExample(@Param("record") ArticleMark record, @Param("example") ArticleMarkExample example);

    int updateByPrimaryKeySelective(ArticleMark record);

    int updateByPrimaryKey(ArticleMark record);
}