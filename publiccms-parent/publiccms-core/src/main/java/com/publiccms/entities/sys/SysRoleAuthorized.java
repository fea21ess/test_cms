package com.publiccms.entities.sys;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;

// Generated 2016-1-19 11:28:06 by Hibernate Tools 4.3.1

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * SysRoleAuthorized generated by hbm2java
 */
@Entity
@Table(name = "sys_role_authorized")
@DynamicUpdate
public class SysRoleAuthorized implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private SysRoleAuthorizedId id;

    public SysRoleAuthorized() {
    }

    public SysRoleAuthorized(SysRoleAuthorizedId id) {
        this.id = id;
    }

    @EmbeddedId
    @AttributeOverrides({ @AttributeOverride(name = "roleId", column = @Column(name = "role_id", nullable = false)),
            @AttributeOverride(name = "url", column = @Column(name = "url", nullable = false)) })
    public SysRoleAuthorizedId getId() {
        return this.id;
    }

    public void setId(SysRoleAuthorizedId id) {
        this.id = id;
    }

}
