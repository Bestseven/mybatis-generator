package com.share.talkseven.dao;

import com.share.talkseven.modal.vo.HoneyArticle;
import com.share.talkseven.modal.vo.HoneyArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HoneyArticleMapper {
    long countByExample(HoneyArticleExample example);

    int deleteByExample(HoneyArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HoneyArticle record);

    int insertSelective(HoneyArticle record);

    List<HoneyArticle> selectByExample(HoneyArticleExample example);

    HoneyArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HoneyArticle record, @Param("example") HoneyArticleExample example);

    int updateByExample(@Param("record") HoneyArticle record, @Param("example") HoneyArticleExample example);

    int updateByPrimaryKeySelective(HoneyArticle record);

    int updateByPrimaryKey(HoneyArticle record);
}