package com.cib.defender.dao.entity;

public class ExecutionDevice {
    private Long execdeviceid;

    private Long executionid;

    private Float execdevicecpu;

    private Float execdevicemem;

    private Float execdevicenetworkinput;

    private Float execdevicenetworkoutput;

    private Float execdevicediscwrite;

    private Float execdevicediscread;

    private Long deviceid;

    public Long getExecdeviceid() {
        return execdeviceid;
    }

    public void setExecdeviceid(Long execdeviceid) {
        this.execdeviceid = execdeviceid;
    }

    public Long getExecutionid() {
        return executionid;
    }

    public void setExecutionid(Long executionid) {
        this.executionid = executionid;
    }

    public Float getExecdevicecpu() {
        return execdevicecpu;
    }

    public void setExecdevicecpu(Float execdevicecpu) {
        this.execdevicecpu = execdevicecpu;
    }

    public Float getExecdevicemem() {
        return execdevicemem;
    }

    public void setExecdevicemem(Float execdevicemem) {
        this.execdevicemem = execdevicemem;
    }

    public Float getExecdevicenetworkinput() {
        return execdevicenetworkinput;
    }

    public void setExecdevicenetworkinput(Float execdevicenetworkinput) {
        this.execdevicenetworkinput = execdevicenetworkinput;
    }

    public Float getExecdevicenetworkoutput() {
        return execdevicenetworkoutput;
    }

    public void setExecdevicenetworkoutput(Float execdevicenetworkoutput) {
        this.execdevicenetworkoutput = execdevicenetworkoutput;
    }

    public Float getExecdevicediscwrite() {
        return execdevicediscwrite;
    }

    public void setExecdevicediscwrite(Float execdevicediscwrite) {
        this.execdevicediscwrite = execdevicediscwrite;
    }

    public Float getExecdevicediscread() {
        return execdevicediscread;
    }

    public void setExecdevicediscread(Float execdevicediscread) {
        this.execdevicediscread = execdevicediscread;
    }

    public Long getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(Long deviceid) {
        this.deviceid = deviceid;
    }
}