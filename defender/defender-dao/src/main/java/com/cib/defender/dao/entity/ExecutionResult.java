package com.cib.defender.dao.entity;

public class ExecutionResult {
    private Long resultid;

    private Long executionid;

    private Float resulttps;

    private Float resultmaxresponse;

    private Float resultaveresponse;

    private Float resultminresponse;

    private Float resultnetwork;

    private Long resultsuccess;

    private Long resultfailure;

    public Long getResultid() {
        return resultid;
    }

    public void setResultid(Long resultid) {
        this.resultid = resultid;
    }

    public Long getExecutionid() {
        return executionid;
    }

    public void setExecutionid(Long executionid) {
        this.executionid = executionid;
    }

    public Float getResulttps() {
        return resulttps;
    }

    public void setResulttps(Float resulttps) {
        this.resulttps = resulttps;
    }

    public Float getResultmaxresponse() {
        return resultmaxresponse;
    }

    public void setResultmaxresponse(Float resultmaxresponse) {
        this.resultmaxresponse = resultmaxresponse;
    }

    public Float getResultaveresponse() {
        return resultaveresponse;
    }

    public void setResultaveresponse(Float resultaveresponse) {
        this.resultaveresponse = resultaveresponse;
    }

    public Float getResultminresponse() {
        return resultminresponse;
    }

    public void setResultminresponse(Float resultminresponse) {
        this.resultminresponse = resultminresponse;
    }

    public Float getResultnetwork() {
        return resultnetwork;
    }

    public void setResultnetwork(Float resultnetwork) {
        this.resultnetwork = resultnetwork;
    }

    public Long getResultsuccess() {
        return resultsuccess;
    }

    public void setResultsuccess(Long resultsuccess) {
        this.resultsuccess = resultsuccess;
    }

    public Long getResultfailure() {
        return resultfailure;
    }

    public void setResultfailure(Long resultfailure) {
        this.resultfailure = resultfailure;
    }
}