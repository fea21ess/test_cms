package com.publiccms.entities.cms;

// Generated 2016-1-19 11:28:06 by Hibernate Tools 4.3.1

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * CmsCategoryAttribute generated by hbm2java
 */
@Entity
@Table(name = "cms_category_attribute")
@DynamicUpdate
public class CmsCategoryAttribute implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "分类")
    private int categoryId;
    @GeneratorColumn(title = "标题")
    private String title;
    @GeneratorColumn(title = "关键词")
    private String keywords;
    @GeneratorColumn(title = "描述")
    private String description;
    @GeneratorColumn(title = "扩展数据")
    private String data;

    public CmsCategoryAttribute() {
    }

    public CmsCategoryAttribute(int categoryId) {
        this.categoryId = categoryId;
    }

    public CmsCategoryAttribute(int categoryId, String title, String keywords, String description, String data) {
        this.categoryId = categoryId;
        this.title = title;
        this.keywords = keywords;
        this.description = description;
        this.data = data;
    }

    @Id

    @Column(name = "category_id", unique = true, nullable = false)
    public int getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "title", length = 80)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "keywords", length = 100)
    public String getKeywords() {
        return this.keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Column(name = "description", length = 300)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "data")
    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
