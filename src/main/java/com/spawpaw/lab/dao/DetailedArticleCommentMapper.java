package com.spawpaw.lab.dao;

import com.spawpaw.lab.entity.DetailedArticleComment;
import com.spawpaw.lab.entity.DetailedArticleCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetailedArticleCommentMapper {
    long countByExample(DetailedArticleCommentExample example);

    int deleteByExample(DetailedArticleCommentExample example);

    int insert(DetailedArticleComment record);

    int insertSelective(DetailedArticleComment record);

    List<DetailedArticleComment> selectByExampleWithBLOBs(DetailedArticleCommentExample example);

    List<DetailedArticleComment> selectByExample(DetailedArticleCommentExample example);

    int updateByExampleSelective(@Param("record") DetailedArticleComment record, @Param("example") DetailedArticleCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") DetailedArticleComment record, @Param("example") DetailedArticleCommentExample example);

    int updateByExample(@Param("record") DetailedArticleComment record, @Param("example") DetailedArticleCommentExample example);
}