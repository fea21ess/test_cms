package com.publiccms.entities.visit;
// Generated 2021-8-6 14:20:45 by Hibernate Tools 5.4.32.Final

import java.util.Date;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * VisitItem generated by hbm2java
 */
@Entity
@Table(name = "visit_item")
@DynamicUpdate
public class VisitItem implements java.io.Serializable {

    /**
    * 
    */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private VisitItemId id;
    @GeneratorColumn(title = "PV")
    private long pv;
    @GeneratorColumn(title = "UV")
    private Long uv;
    @GeneratorColumn(title = "IP Views")
    private Long ipviews;

    public VisitItem() {
    }

    public VisitItem(VisitItemId id, long pv) {
        this.id = id;
        this.pv = pv;
    }

    public VisitItem(short siteId, Date visitDate, String itemType, String itemId, long pv, Long uv, Long ipviews) {
        this.id = new VisitItemId(siteId, visitDate, itemType, itemId);
        this.pv = pv;
        this.uv = uv;
        this.ipviews = ipviews;
    }

    public VisitItem(VisitItemId id, long pv, Long uv, Long ipviews) {
        this.id = id;
        this.pv = pv;
        this.uv = uv;
        this.ipviews = ipviews;
    }

    @EmbeddedId
    @AttributeOverrides({ @AttributeOverride(name = "siteId", column = @Column(name = "site_id", nullable = false)),
            @AttributeOverride(name = "visitDate", column = @Column(name = "visit_date", nullable = false, length = 10)),
            @AttributeOverride(name = "itemType", column = @Column(name = "item_type", nullable = false, length = 50)),
            @AttributeOverride(name = "itemId", column = @Column(name = "item_id", nullable = false, length = 50)) })
    public VisitItemId getId() {
        return this.id;
    }

    public void setId(VisitItemId id) {
        this.id = id;
    }

    @Column(name = "pv", nullable = false)
    public long getPv() {
        return this.pv;
    }

    public void setPv(long pv) {
        this.pv = pv;
    }

    @Column(name = "uv")
    public Long getUv() {
        return this.uv;
    }

    public void setUv(Long uv) {
        this.uv = uv;
    }

    @Column(name = "ipviews")
    public Long getIpviews() {
        return this.ipviews;
    }

    public void setIpviews(Long ipviews) {
        this.ipviews = ipviews;
    }

}
