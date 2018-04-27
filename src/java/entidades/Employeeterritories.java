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
@Table(name = "employeeterritories", catalog = "northwind", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employeeterritories.findAll", query = "SELECT e FROM Employeeterritories e")
    , @NamedQuery(name = "Employeeterritories.findByEmployeeID", query = "SELECT e FROM Employeeterritories e WHERE e.employeeterritoriesPK.employeeID = :employeeID")
    , @NamedQuery(name = "Employeeterritories.findByTerritoryID", query = "SELECT e FROM Employeeterritories e WHERE e.employeeterritoriesPK.territoryID = :territoryID")})
public class Employeeterritories implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmployeeterritoriesPK employeeterritoriesPK;

    public Employeeterritories() {
    }

    public Employeeterritories(EmployeeterritoriesPK employeeterritoriesPK) {
        this.employeeterritoriesPK = employeeterritoriesPK;
    }

    public Employeeterritories(int employeeID, String territoryID) {
        this.employeeterritoriesPK = new EmployeeterritoriesPK(employeeID, territoryID);
    }

    public EmployeeterritoriesPK getEmployeeterritoriesPK() {
        return employeeterritoriesPK;
    }

    public void setEmployeeterritoriesPK(EmployeeterritoriesPK employeeterritoriesPK) {
        this.employeeterritoriesPK = employeeterritoriesPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeterritoriesPK != null ? employeeterritoriesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employeeterritories)) {
            return false;
        }
        Employeeterritories other = (Employeeterritories) object;
        if ((this.employeeterritoriesPK == null && other.employeeterritoriesPK != null) || (this.employeeterritoriesPK != null && !this.employeeterritoriesPK.equals(other.employeeterritoriesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Employeeterritories[ employeeterritoriesPK=" + employeeterritoriesPK + " ]";
    }
    
}
