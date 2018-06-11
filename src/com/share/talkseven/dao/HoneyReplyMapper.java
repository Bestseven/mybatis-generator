package com.share.talkseven.dao;

import com.share.talkseven.modal.vo.HoneyReply;
import com.share.talkseven.modal.vo.HoneyReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HoneyReplyMapper {
    long countByExample(HoneyReplyExample example);

    int deleteByExample(HoneyReplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HoneyReply record);

    int insertSelective(HoneyReply record);

    List<HoneyReply> selectByExample(HoneyReplyExample example);

    HoneyReply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HoneyReply record, @Param("example") HoneyReplyExample example);

    int updateByExample(@Param("record") HoneyReply record, @Param("example") HoneyReplyExample example);

    int updateByPrimaryKeySelective(HoneyReply record);

    int updateByPrimaryKey(HoneyReply record);
}