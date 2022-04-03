package com.publiccms.entities.cms;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * CmsDictionary generated by hbm2java
 */
@Entity
@Table(name = "cms_dictionary")
@DynamicUpdate
public class CmsDictionary implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private CmsDictionaryId id;
    @GeneratorColumn(title = "名称")
    private String name;
    @GeneratorColumn(title = "子级深度")
    private int childDepth;

    public CmsDictionary() {
    }

    public CmsDictionary(CmsDictionaryId id, String name, int childDepth) {
        this.id = id;
        this.name = name;
        this.childDepth = childDepth;
    }

    @EmbeddedId
    @AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false, length = 20)),
            @AttributeOverride(name = "siteId", column = @Column(name = "site_id", nullable = false)) })
    public CmsDictionaryId getId() {
        return this.id;
    }

    public void setId(CmsDictionaryId id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "child_depth", nullable = false)
    public int getChildDepth() {
        return this.childDepth;
    }

    public void setChildDepth(int childDepth) {
        this.childDepth = childDepth;
    }

}
