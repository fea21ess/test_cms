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
 * VisitUrl generated by hbm2java
 */
@Entity
@Table(name = "visit_url")
@DynamicUpdate
public class VisitUrl implements java.io.Serializable {

    /**
    * 
    */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private VisitUrlId id;
    @GeneratorColumn(title = "URL")
    private String url;
    @GeneratorColumn(title = "PV")
    private long pv;
    @GeneratorColumn(title = "UV")
    private Long uv;
    @GeneratorColumn(title = "IP Views")
    private Long ipviews;

    public VisitUrl() {
    }

    public VisitUrl(VisitUrlId id, String url, long pv) {
        this.id = id;
        this.url = url;
        this.pv = pv;
    }

    public VisitUrl(short siteId, Date visitDate, String url, long pv, Long uv, Long ipviews) {
        this.id = new VisitUrlId(siteId, visitDate, null, null);
        this.url = url;
        this.pv = pv;
        this.uv = uv;
        this.ipviews = ipviews;
    }

    public VisitUrl(VisitUrlId id, String url, long pv, Long uv, Long ipviews) {
        this.id = id;
        this.url = url;
        this.pv = pv;
        this.uv = uv;
        this.ipviews = ipviews;
    }

    @EmbeddedId

    @AttributeOverrides({ @AttributeOverride(name = "siteId", column = @Column(name = "site_id", nullable = false)),
            @AttributeOverride(name = "visitDate", column = @Column(name = "visit_date", nullable = false, length = 10)),
            @AttributeOverride(name = "urlMd5", column = @Column(name = "url_md5", nullable = false, length = 50)),
            @AttributeOverride(name = "urlSha256", column = @Column(name = "url_sha256", nullable = false, length = 100)) })
    public VisitUrlId getId() {
        return this.id;
    }

    public void setId(VisitUrlId id) {
        this.id = id;
    }

    @Column(name = "url", nullable = false, length = 2048)
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
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
