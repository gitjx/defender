package com.cib.defender.dao.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class Projectbak {

    @NotNull(message = "项目id不能为空")
    private Long projectid;
    @NotNull(message = "项目名称不能为空")
    private String projectname;

    private String projectmanager;

    private Integer projectscripts;

    private Integer projectworkings;

    @DateTimeFormat
    private Date projectdate;

    public Long getProjectid() {
        return projectid;
    }

    public void setProjectid(Long projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getProjectmanager() {
        return projectmanager;
    }

    public void setProjectmanager(String projectmanager) {
        this.projectmanager = projectmanager == null ? null : projectmanager.trim();
    }

    public Integer getProjectscripts() {
        return projectscripts;
    }

    public void setProjectscripts(Integer projectscripts) {
        this.projectscripts = projectscripts;
    }

    public Integer getProjectworkings() {
        return projectworkings;
    }

    public void setProjectworkings(Integer projectworkings) {
        this.projectworkings = projectworkings;
    }

    public Date getProjectdate() {
        return projectdate;
    }

    public void setProjectdate(Date projectdate) {
        this.projectdate = projectdate;
    }
}