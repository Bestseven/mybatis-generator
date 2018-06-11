package com.share.talkseven.dao;

import com.share.talkseven.modal.vo.HoneyMember;
import com.share.talkseven.modal.vo.HoneyMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HoneyMemberMapper {
    long countByExample(HoneyMemberExample example);

    int deleteByExample(HoneyMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HoneyMember record);

    int insertSelective(HoneyMember record);

    List<HoneyMember> selectByExample(HoneyMemberExample example);

    HoneyMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HoneyMember record, @Param("example") HoneyMemberExample example);

    int updateByExample(@Param("record") HoneyMember record, @Param("example") HoneyMemberExample example);

    int updateByPrimaryKeySelective(HoneyMember record);

    int updateByPrimaryKey(HoneyMember record);
}