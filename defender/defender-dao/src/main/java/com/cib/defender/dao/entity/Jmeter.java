package com.cib.defender.dao.entity;

public class Jmeter {
    private Long jmeterid;

    private String jmetername;

    private Integer jmetercpu;

    private Integer jmetermem;

    public Long getJmeterid() {
        return jmeterid;
    }

    public void setJmeterid(Long jmeterid) {
        this.jmeterid = jmeterid;
    }

    public String getJmetername() {
        return jmetername;
    }

    public void setJmetername(String jmetername) {
        this.jmetername = jmetername == null ? null : jmetername.trim();
    }

    public Integer getJmetercpu() {
        return jmetercpu;
    }

    public void setJmetercpu(Integer jmetercpu) {
        this.jmetercpu = jmetercpu;
    }

    public Integer getJmetermem() {
        return jmetermem;
    }

    public void setJmetermem(Integer jmetermem) {
        this.jmetermem = jmetermem;
    }
}