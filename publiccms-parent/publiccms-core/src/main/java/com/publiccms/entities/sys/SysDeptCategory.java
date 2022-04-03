package com.publiccms.entities.sys;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * SysDeptCategory generated by hbm2java
 */
@Entity
@Table(name = "sys_dept_category")
@DynamicUpdate
public class SysDeptCategory implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private SysDeptCategoryId id;

    public SysDeptCategory() {
    }

    public SysDeptCategory(SysDeptCategoryId id) {
        this.id = id;
    }

    @EmbeddedId
    @AttributeOverrides({ @AttributeOverride(name = "deptId", column = @Column(name = "dept_id", nullable = false)),
            @AttributeOverride(name = "categoryId", column = @Column(name = "category_id", nullable = false)) })
    public SysDeptCategoryId getId() {
        return this.id;
    }

    public void setId(SysDeptCategoryId id) {
        this.id = id;
    }

}
