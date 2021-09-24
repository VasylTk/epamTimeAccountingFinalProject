package com.timeaccounting.DB.Entity;

import java.io.Serializable;

public class UserRole implements Serializable {

    private int id;
    private String roleName;

    public UserRole(int id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
