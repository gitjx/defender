package com.cib.defender.dao.mapper;

import com.cib.defender.dao.entity.ExecutionDevice;

public interface ExecutionDeviceMapper {
    int deleteByPrimaryKey(Long execdeviceid);

    int insert(ExecutionDevice record);

    int insertSelective(ExecutionDevice record);

    ExecutionDevice selectByPrimaryKey(Long execdeviceid);

    int updateByPrimaryKeySelective(ExecutionDevice record);

    int updateByPrimaryKey(ExecutionDevice record);
}