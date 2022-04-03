package com.publiccms.entities.trade;
// Generated 2019-6-16 9:09:11 by Hibernate Tools 6.0.0-SNAPSHOT

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.publiccms.common.database.CmsUpgrader;
import com.publiccms.common.generator.annotation.GeneratorColumn;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * TradePaymentHistory generated by hbm2java
 */
@Entity
@Table(name = "trade_payment_history")
public class TradePaymentHistory implements java.io.Serializable {
    /**
    *
    */
    private static final long serialVersionUID = 1L;

    @GeneratorColumn(title = "ID")
    private Long id;
    @GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private short siteId;
    @GeneratorColumn(title = "订单", condition = true)
    private long paymentId;
    @GeneratorColumn(title = "创建日期", condition = true, order = true)
    private Date createDate;
    @GeneratorColumn(title = "操作", condition = true)
    private String operate;
    @GeneratorColumn(title = "内容", condition = true, like = true)
    private String content;

    public TradePaymentHistory() {
    }

    public TradePaymentHistory(short siteId, long paymentId, Date createDate, String operate) {
        this.siteId = siteId;
        this.paymentId = paymentId;
        this.createDate = createDate;
        this.operate = operate;
    }

    public TradePaymentHistory(short siteId, long paymentId, Date createDate, String operate, String content) {
        this.siteId = siteId;
        this.paymentId = paymentId;
        this.createDate = createDate;
        this.operate = operate;
        this.content = content;
    }

    @Id
    @GeneratedValue(generator = "cmsGenerator")
    @GenericGenerator(name = "cmsGenerator", strategy = CmsUpgrader.IDENTIFIER_GENERATOR)

    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public short getSiteId() {
        return this.siteId;
    }

    public void setSiteId(short siteId) {
        this.siteId = siteId;
    }

    @Column(name = "payment_id", nullable = false)
    public long getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name="operate", nullable=false, length=100)
    public String getOperate() {
        return this.operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    @Column(name = "content", length = 65535)
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
