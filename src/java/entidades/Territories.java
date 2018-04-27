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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mrivera
 */
@Entity
@Table(name = "territories", catalog = "northwind", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Territories.findAll", query = "SELECT t FROM Territories t")
    , @NamedQuery(name = "Territories.findByTerritoryID", query = "SELECT t FROM Territories t WHERE t.territoryID = :territoryID")
    , @NamedQuery(name = "Territories.findByTerritoryDescription", query = "SELECT t FROM Territories t WHERE t.territoryDescription = :territoryDescription")
    , @NamedQuery(name = "Territories.findByRegionID", query = "SELECT t FROM Territories t WHERE t.regionID = :regionID")})
public class Territories implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TerritoryID")
    private String territoryID;
    @Basic(optional = false)
    @Column(name = "TerritoryDescription")
    private String territoryDescription;
    @Basic(optional = false)
    @Column(name = "RegionID")
    private int regionID;

    public Territories() {
    }

    public Territories(String territoryID) {
        this.territoryID = territoryID;
    }

    public Territories(String territoryID, String territoryDescription, int regionID) {
        this.territoryID = territoryID;
        this.territoryDescription = territoryDescription;
        this.regionID = regionID;
    }

    public String getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(String territoryID) {
        this.territoryID = territoryID;
    }

    public String getTerritoryDescription() {
        return territoryDescription;
    }

    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;
    }

    public int getRegionID() {
        return regionID;
    }

    public void setRegionID(int regionID) {
        this.regionID = regionID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (territoryID != null ? territoryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Territories)) {
            return false;
        }
        Territories other = (Territories) object;
        if ((this.territoryID == null && other.territoryID != null) || (this.territoryID != null && !this.territoryID.equals(other.territoryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Territories[ territoryID=" + territoryID + " ]";
    }
    
}
