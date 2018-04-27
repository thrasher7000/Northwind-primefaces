/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mrivera
 */
@Entity
@Table(name = "customerdemographics", catalog = "northwind", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customerdemographics.findAll", query = "SELECT c FROM Customerdemographics c")
    , @NamedQuery(name = "Customerdemographics.findByCustomerTypeID", query = "SELECT c FROM Customerdemographics c WHERE c.customerTypeID = :customerTypeID")})
public class Customerdemographics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CustomerTypeID")
    private String customerTypeID;
    @Lob
    @Column(name = "CustomerDesc")
    private String customerDesc;

    public Customerdemographics() {
    }

    public Customerdemographics(String customerTypeID) {
        this.customerTypeID = customerTypeID;
    }

    public String getCustomerTypeID() {
        return customerTypeID;
    }

    public void setCustomerTypeID(String customerTypeID) {
        this.customerTypeID = customerTypeID;
    }

    public String getCustomerDesc() {
        return customerDesc;
    }

    public void setCustomerDesc(String customerDesc) {
        this.customerDesc = customerDesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerTypeID != null ? customerTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customerdemographics)) {
            return false;
        }
        Customerdemographics other = (Customerdemographics) object;
        if ((this.customerTypeID == null && other.customerTypeID != null) || (this.customerTypeID != null && !this.customerTypeID.equals(other.customerTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Customerdemographics[ customerTypeID=" + customerTypeID + " ]";
    }
    
}
