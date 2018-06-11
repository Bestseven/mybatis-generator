package com.share.talkseven.dao;

import com.share.talkseven.modal.vo.HoneyArticleMain;
import com.share.talkseven.modal.vo.HoneyArticleMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HoneyArticleMainMapper {
    long countByExample(HoneyArticleMainExample example);

    int deleteByExample(HoneyArticleMainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HoneyArticleMain record);

    int insertSelective(HoneyArticleMain record);

    List<HoneyArticleMain> selectByExampleWithBLOBs(HoneyArticleMainExample example);

    List<HoneyArticleMain> selectByExample(HoneyArticleMainExample example);

    HoneyArticleMain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HoneyArticleMain record, @Param("example") HoneyArticleMainExample example);

    int updateByExampleWithBLOBs(@Param("record") HoneyArticleMain record, @Param("example") HoneyArticleMainExample example);

    int updateByExample(@Param("record") HoneyArticleMain record, @Param("example") HoneyArticleMainExample example);

    int updateByPrimaryKeySelective(HoneyArticleMain record);

    int updateByPrimaryKeyWithBLOBs(HoneyArticleMain record);

    int updateByPrimaryKey(HoneyArticleMain record);
}