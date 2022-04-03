package com.publiccms.entities.sys;
// Generated 2016-11-19 15:33:56 by Hibernate Tools 4.3.1

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * SysRoleModuleId generated by hbm2java
 */
@Embeddable
public class SysRoleModuleId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "角色", condition = true)
    private int roleId;
    @GeneratorColumn(title = "模块", condition = true)
    private String moduleId;

    public SysRoleModuleId() {
    }

    public SysRoleModuleId(int roleId, String moduleId) {
        this.roleId = roleId;
        this.moduleId = moduleId;
    }

    @Column(name = "role_id", nullable = false)
    public int getRoleId() {
        return this.roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Column(name = "module_id", nullable = false, length = 30)
    public String getModuleId() {
        return this.moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof SysRoleModuleId))
            return false;
        SysRoleModuleId castOther = (SysRoleModuleId) other;

        return (this.getRoleId() == castOther.getRoleId())
                && ((this.getModuleId() == castOther.getModuleId()) || (this.getModuleId() != null
                        && castOther.getModuleId() != null && this.getModuleId().equals(castOther.getModuleId())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getRoleId();
        result = 37 * result + (getModuleId() == null ? 0 : this.getModuleId().hashCode());
        return result;
    }

}
