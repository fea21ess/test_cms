package com.publiccms.entities.sys;
// Generated 2018-6-5 18:18:57 by Hibernate Tools 5.1.6.Final

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * SysModuleLang generated by hbm2java
 */
@Entity
@Table(name = "sys_module_lang")
public class SysModuleLang implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private SysModuleLangId id;
    @GeneratorColumn(title = "值")
    private String value;

    public SysModuleLang() {
    }

    public SysModuleLang(SysModuleLangId id) {
        this.id = id;
    }

    public SysModuleLang(SysModuleLangId id, String value) {
        this.id = id;
        this.value = value;
    }

    @EmbeddedId

    @AttributeOverrides({
            @AttributeOverride(name = "moduleId", column = @Column(name = "module_id", nullable = false, length = 30)),
            @AttributeOverride(name = "lang", column = @Column(name = "lang", nullable = false, length = 20)) })
    public SysModuleLangId getId() {
        return this.id;
    }

    public void setId(SysModuleLangId id) {
        this.id = id;
    }

    @Column(name = "value", length = 100)
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
