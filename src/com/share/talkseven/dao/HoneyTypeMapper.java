package com.share.talkseven.dao;

import com.share.talkseven.modal.vo.HoneyType;
import com.share.talkseven.modal.vo.HoneyTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HoneyTypeMapper {
    long countByExample(HoneyTypeExample example);

    int deleteByExample(HoneyTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HoneyType record);

    int insertSelective(HoneyType record);

    List<HoneyType> selectByExample(HoneyTypeExample example);

    HoneyType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HoneyType record, @Param("example") HoneyTypeExample example);

    int updateByExample(@Param("record") HoneyType record, @Param("example") HoneyTypeExample example);

    int updateByPrimaryKeySelective(HoneyType record);

    int updateByPrimaryKey(HoneyType record);
}