package com.cib.defender.dao.mapper;

import com.cib.defender.dao.entity.PerformanceExecution;

public interface PerformanceExecutionMapper {
    int deleteByPrimaryKey(Long executionid);

    int insert(PerformanceExecution record);

    int insertSelective(PerformanceExecution record);

    PerformanceExecution selectByPrimaryKey(Long executionid);

    int updateByPrimaryKeySelective(PerformanceExecution record);

    int updateByPrimaryKey(PerformanceExecution record);
}