package com.nicico.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/* com.nicico.models
@Author:Peyman
Date: 3/8/2018
Time: 9:50 AM
Year: 2018
*/
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    int id;

    String name;
    String type;

    private BigDecimal authorizedHours;

    private BigDecimal authorizedFunds;

    private boolean special;

    @Temporal(value = TemporalType.DATE)
    private Date startDate;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public BigDecimal getAuthorizedHours() {
        return authorizedHours;
    }

    public void setAuthorizedHours(BigDecimal authorizedHours) {
        this.authorizedHours = authorizedHours;
    }

    public BigDecimal getAuthorizedFunds() {
        return authorizedFunds;
    }

    public void setAuthorizedFunds(BigDecimal authorizedFunds) {
        this.authorizedFunds = authorizedFunds;
    }



    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }




    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "sponsor_id")
    Sponsor sponsor;

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Project(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Project() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

            return "Project [projectId=" + id + ", name=" + name
                    + ", description=" + description + ", sponsor=" + sponsor
                    + ", authorizedHours=" + authorizedHours + ", authorizedFunds="
                    + authorizedFunds + ", special=" + special
                    + ", type=" + type
                    + ", startDate=" + startDate + "]";

    }
}
