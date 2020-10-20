package com.cib.defender.dao.mapper;

import com.cib.defender.dao.entity.Project;

import java.util.List;

public interface ProjectMapperbak {
    int deleteByPrimaryKey(Long projectid);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Long projectid);

    List<Project> selectProjectByName(String projectName);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

    List<Project> getAllProjects();
}