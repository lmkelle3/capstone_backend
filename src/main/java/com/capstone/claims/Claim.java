package com.capstone.claims;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="claims")
@Data

public class Claim {
    public Claim(){}

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column
    private int userId;

    @Column
    private String lossCategory;

    @Column
    private String lossDescription;

    @Column
    private String DOL;

    @Column
    private String policyType;

    @Column
    private String itemType;

    @Column
    private String jurisdiction;

    @Column
    private String caseNumber;

    @Column
    private String dateFiled;

    @Column
    private String havePR;

    @Column
    private String claimValue;

    @Column
    private int paymentPreference;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getLossCategory() {
        return lossCategory;
    };

    public String getLossDescription() {
        return lossDescription;
    };

    public String getDOL() {
        return DOL;
    };

    public String getPolicyType() {
        return policyType;
    };

    public String getItemType() {
        return itemType;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public String getDateFiled() {
        return dateFiled;
    }

    public String getHavePR() {
        return havePR;
    }

    public String getClaimValue() {
        return claimValue;
    }

    public int getPaymentPreference() {
        return paymentPreference;
    }
}
