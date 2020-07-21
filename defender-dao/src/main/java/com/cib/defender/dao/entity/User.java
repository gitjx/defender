package com.cib.defender.dao.entity;

public class User {
    private Boolean id;

    private String username;

    private String password;

    public Boolean getId() {
        return id;
    }

    public void setId(Boolean id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}