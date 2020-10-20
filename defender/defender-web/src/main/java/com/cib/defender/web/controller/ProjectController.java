package com.cib.defender.web.controller;

import com.cib.defender.biz.service.ProjectService;
import com.cib.defender.dao.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @ClassName:ProjectController
 * @Description:TODO
 * @Author:joyking
 * @Date:2020/10/14 9:44 PM
 * @Version:1.0
 **/
@RestController
@RequestMapping("project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @RequestMapping("list")
    public List<Project> getAllProjects(){
        List<Project> projectList = null;
        projectList = projectService.getAllProjects();
        return projectList;
    }
    @RequestMapping("getProjectByName")
    public List<Project> getProjectByName(@RequestBody String projectName){
        return projectService.getProjectByName(projectName);
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Project addProject(@Valid @RequestBody Project project){
        projectService.saveOrUpdateProject(project);
        return project;
    }


}
