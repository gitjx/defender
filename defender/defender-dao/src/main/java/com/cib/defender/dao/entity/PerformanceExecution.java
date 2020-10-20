package com.cib.defender.dao.entity;

import java.util.Date;

public class PerformanceExecution {
    private Long executionid;

    private Long projectid;

    private Date executionstarttime;

    private Date executionendtime;

    private Integer executionscene;

    private Integer executionthreads;

    private String executiondetails;

    private String executionmonitordetails;

    public Long getExecutionid() {
        return executionid;
    }

    public void setExecutionid(Long executionid) {
        this.executionid = executionid;
    }

    public Long getProjectid() {
        return projectid;
    }

    public void setProjectid(Long projectid) {
        this.projectid = projectid;
    }

    public Date getExecutionstarttime() {
        return executionstarttime;
    }

    public void setExecutionstarttime(Date executionstarttime) {
        this.executionstarttime = executionstarttime;
    }

    public Date getExecutionendtime() {
        return executionendtime;
    }

    public void setExecutionendtime(Date executionendtime) {
        this.executionendtime = executionendtime;
    }

    public Integer getExecutionscene() {
        return executionscene;
    }

    public void setExecutionscene(Integer executionscene) {
        this.executionscene = executionscene;
    }

    public Integer getExecutionthreads() {
        return executionthreads;
    }

    public void setExecutionthreads(Integer executionthreads) {
        this.executionthreads = executionthreads;
    }

    public String getExecutiondetails() {
        return executiondetails;
    }

    public void setExecutiondetails(String executiondetails) {
        this.executiondetails = executiondetails == null ? null : executiondetails.trim();
    }

    public String getExecutionmonitordetails() {
        return executionmonitordetails;
    }

    public void setExecutionmonitordetails(String executionmonitordetails) {
        this.executionmonitordetails = executionmonitordetails == null ? null : executionmonitordetails.trim();
    }
}