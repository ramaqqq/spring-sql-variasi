package com.sample.models.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tbl_payments")
public class PaymentCrud implements Serializable  {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_date", length = 100)
    private String create_date;

    @Column(name = "msisdn", length = 100)
    private String msisdn;

    @Column(name = "payload", length = 100)
    private String payload;

    @Column(name = "source", length = 100)
    private String source;

    public PaymentCrud() {
    }

    public PaymentCrud(Long id, String create_date, String msisdn, String payload, String source) {
        this.id= id;
        this.create_date= create_date;
        this.msisdn= msisdn;
        this.payload= payload;
        this.source= source;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}

