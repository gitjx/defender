package com.cib.defender.dao.mapper;

import com.cib.defender.dao.entity.ExecutionResult;

public interface ExecutionResultMapper {
    int deleteByPrimaryKey(Long resultid);

    int insert(ExecutionResult record);

    int insertSelective(ExecutionResult record);

    ExecutionResult selectByPrimaryKey(Long resultid);

    int updateByPrimaryKeySelective(ExecutionResult record);

    int updateByPrimaryKey(ExecutionResult record);
}