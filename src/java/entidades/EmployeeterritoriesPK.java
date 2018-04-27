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
public class EmployeeterritoriesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "EmployeeID")
    private int employeeID;
    @Basic(optional = false)
    @Column(name = "TerritoryID")
    private String territoryID;

    public EmployeeterritoriesPK() {
    }

    public EmployeeterritoriesPK(int employeeID, String territoryID) {
        this.employeeID = employeeID;
        this.territoryID = territoryID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(String territoryID) {
        this.territoryID = territoryID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) employeeID;
        hash += (territoryID != null ? territoryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeterritoriesPK)) {
            return false;
        }
        EmployeeterritoriesPK other = (EmployeeterritoriesPK) object;
        if (this.employeeID != other.employeeID) {
            return false;
        }
        if ((this.territoryID == null && other.territoryID != null) || (this.territoryID != null && !this.territoryID.equals(other.territoryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.EmployeeterritoriesPK[ employeeID=" + employeeID + ", territoryID=" + territoryID + " ]";
    }
    
}
