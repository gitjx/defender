package com.cib.defender.biz.service;

import com.cib.defender.dao.entity.Project;

import java.util.List;

/**
 * @ClassName:ProjectService
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/10/14 10:01 PM
 * @Version:1.0
 **/
public interface ProjectService {
    /**
     * 新增或者更新一个项目
     * @param:project
     * @return
     */
    int saveOrUpdateProject(Project project);
    /**
     * 获取所有项目信息
     *
     */
    List<Project> getAllProjects();
    /**
     * 根据项目名称查询项目信息
     * @param:projectName
     * @return:List<project>
     */
    List<Project> getProjectByName(String projectName);
}
