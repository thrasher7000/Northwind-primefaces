/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author mrivera
 */
@Embeddable
public class CustomercustomerdemoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CustomerID")
    private String customerID;
    @Basic(optional = false)
    @Column(name = "CustomerTypeID")
    private String customerTypeID;

    public CustomercustomerdemoPK() {
    }

    public CustomercustomerdemoPK(String customerID, String customerTypeID) {
        this.customerID = customerID;
        this.customerTypeID = customerTypeID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerTypeID() {
        return customerTypeID;
    }

    public void setCustomerTypeID(String customerTypeID) {
        this.customerTypeID = customerTypeID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerID != null ? customerID.hashCode() : 0);
        hash += (customerTypeID != null ? customerTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomercustomerdemoPK)) {
            return false;
        }
        CustomercustomerdemoPK other = (CustomercustomerdemoPK) object;
        if ((this.customerID == null && other.customerID != null) || (this.customerID != null && !this.customerID.equals(other.customerID))) {
            return false;
        }
        if ((this.customerTypeID == null && other.customerTypeID != null) || (this.customerTypeID != null && !this.customerTypeID.equals(other.customerTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.CustomercustomerdemoPK[ customerID=" + customerID + ", customerTypeID=" + customerTypeID + " ]";
    }
    
}
