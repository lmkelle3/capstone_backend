package com.capstone.claims;

import lombok.Data;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="claims")
@Data

public class Claim {
    public Claim() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column
    private int userId;

    @Column
    private String lossCategory;

    @Column
    private String lossType;

    @Column
    private String claimDetails;

    @Column
    private java.util.Date claimDate;

    @Column
    private String policyType;

    @Column
    private boolean scheduled;

    @Column
    private boolean unscheduled;

    @Column
    private boolean other;

    @Column
    private String jurisdiction;

    @Column
    private int caseNumber;

    @Column
    private java.util.Date reportDate;

    @Column
    private boolean noPr;

    @Column
    private double price;


    @Column
    private String payInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLossCategory() {
        return lossCategory;
    }

    public void setLossCategory(String lossCategory) {
        this.lossCategory = lossCategory;
    }

    public String getLossType() {
        return lossType;
    }

    public void setLossType(String lossType) {
        this.lossType = lossType;
    }

    public String getClaimDetails() {
        return claimDetails;
    }

    public void setClaimDetails(String claimDetails) {
        this.claimDetails = claimDetails;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public boolean isScheduled() {
        return scheduled;
    }

    public void setScheduled(boolean scheduled) {
        this.scheduled = scheduled;
    }

    public boolean isUnscheduled() {
        return unscheduled;
    }

    public void setUnscheduled(boolean unscheduled) {
        this.unscheduled = unscheduled;
    }

    public boolean isOther() {
        return other;
    }

    public void setOther(boolean other) {
        this.other = other;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public int getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(int caseNumber) {
        this.caseNumber = caseNumber;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public boolean isNoPr() {
        return noPr;
    }

    public void setNoPr(boolean noPr) {
        this.noPr = noPr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(String payInfo) {
        this.payInfo = payInfo;
    }

}
