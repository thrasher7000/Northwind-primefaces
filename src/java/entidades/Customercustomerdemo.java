/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mrivera
 */
@Entity
@Table(name = "customercustomerdemo", catalog = "northwind", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customercustomerdemo.findAll", query = "SELECT c FROM Customercustomerdemo c")
    , @NamedQuery(name = "Customercustomerdemo.findByCustomerID", query = "SELECT c FROM Customercustomerdemo c WHERE c.customercustomerdemoPK.customerID = :customerID")
    , @NamedQuery(name = "Customercustomerdemo.findByCustomerTypeID", query = "SELECT c FROM Customercustomerdemo c WHERE c.customercustomerdemoPK.customerTypeID = :customerTypeID")})
public class Customercustomerdemo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustomercustomerdemoPK customercustomerdemoPK;

    public Customercustomerdemo() {
    }

    public Customercustomerdemo(CustomercustomerdemoPK customercustomerdemoPK) {
        this.customercustomerdemoPK = customercustomerdemoPK;
    }

    public Customercustomerdemo(String customerID, String customerTypeID) {
        this.customercustomerdemoPK = new CustomercustomerdemoPK(customerID, customerTypeID);
    }

    public CustomercustomerdemoPK getCustomercustomerdemoPK() {
        return customercustomerdemoPK;
    }

    public void setCustomercustomerdemoPK(CustomercustomerdemoPK customercustomerdemoPK) {
        this.customercustomerdemoPK = customercustomerdemoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customercustomerdemoPK != null ? customercustomerdemoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customercustomerdemo)) {
            return false;
        }
        Customercustomerdemo other = (Customercustomerdemo) object;
        if ((this.customercustomerdemoPK == null && other.customercustomerdemoPK != null) || (this.customercustomerdemoPK != null && !this.customercustomerdemoPK.equals(other.customercustomerdemoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Customercustomerdemo[ customercustomerdemoPK=" + customercustomerdemoPK + " ]";
    }
    
}
