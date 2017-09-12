package com.spawpaw.lab.dao;

import com.spawpaw.lab.entity.DetailedArticle;
import com.spawpaw.lab.entity.DetailedArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetailedArticleMapper {
    long countByExample(DetailedArticleExample example);

    int deleteByExample(DetailedArticleExample example);

    int insert(DetailedArticle record);

    int insertSelective(DetailedArticle record);

    List<DetailedArticle> selectByExampleWithBLOBs(DetailedArticleExample example);

    List<DetailedArticle> selectByExample(DetailedArticleExample example);

    int updateByExampleSelective(@Param("record") DetailedArticle record, @Param("example") DetailedArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") DetailedArticle record, @Param("example") DetailedArticleExample example);

    int updateByExample(@Param("record") DetailedArticle record, @Param("example") DetailedArticleExample example);
}