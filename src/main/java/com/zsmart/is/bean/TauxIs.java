package com.zsmart.is.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class TauxIs implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(precision = 16, scale = 4)
    private BigDecimal profitMin;
    @Column(precision = 16, scale = 4)
    private BigDecimal profitMax;
    @Column(precision = 16, scale = 4)
    private BigDecimal percentage;
    @Column(precision = 16, scale = 4)
    private BigDecimal majoration;
    @Column(precision = 16, scale = 4)
    private BigDecimal penalite;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateApplicationDebut;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateApplicationFin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getProfitMin() {
        return profitMin;
    }

    public void setProfitMin(BigDecimal profitMin) {
        this.profitMin = profitMin;
    }

    public BigDecimal getProfitMax() {
        return profitMax;
    }

    public void setProfitMax(BigDecimal profitMax) {
        this.profitMax = profitMax;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public BigDecimal getMajoration() {
        return majoration;
    }

    public void setMajoration(BigDecimal majoration) {
        this.majoration = majoration;
    }

    public BigDecimal getPenalite() {
        return penalite;
    }

    public void setPenalite(BigDecimal penalite) {
        this.penalite = penalite;
    }

    public Date getDateApplicationDebut() {
        return dateApplicationDebut;
    }

    public void setDateApplicationDebut(Date dateApplicationDebut) {
        this.dateApplicationDebut = dateApplicationDebut;
    }

    public Date getDateApplicationFin() {
        return dateApplicationFin;
    }

    public void setDateApplicationFin(Date dateApplicationFin) {
        this.dateApplicationFin = dateApplicationFin;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TauxIs other = (TauxIs) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

}
