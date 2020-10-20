package com.cib.defender.biz.service.impl;

import com.cib.defender.biz.service.ProjectService;
import com.cib.defender.dao.entity.Project;
import com.cib.defender.dao.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName:ProjectServiceImpl
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/10/14 10:06 PM
 * @Version:1.0
 **/
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectMapper projectMapper;
    @Override
    public int saveOrUpdateProject(Project project) {
        return projectMapper.insert(project);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectMapper.getAllProjects();
    }
    @Override
    public List<Project> getProjectByName(String projectName){
        return projectMapper.selectProjectByName(projectName);
    }
}
