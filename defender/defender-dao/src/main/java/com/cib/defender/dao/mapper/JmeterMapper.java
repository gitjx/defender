package com.cib.defender.dao.mapper;

import com.cib.defender.dao.entity.Jmeter;

public interface JmeterMapper {
    int deleteByPrimaryKey(Long jmeterid);

    int insert(Jmeter record);

    int insertSelective(Jmeter record);

    Jmeter selectByPrimaryKey(Long jmeterid);

    int updateByPrimaryKeySelective(Jmeter record);

    int updateByPrimaryKey(Jmeter record);
}