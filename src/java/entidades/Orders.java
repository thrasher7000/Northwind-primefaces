/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mrivera
 */
@Entity
@Table(name = "orders", catalog = "northwind", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o")
    , @NamedQuery(name = "Orders.findByOrderID", query = "SELECT o FROM Orders o WHERE o.orderID = :orderID")
    , @NamedQuery(name = "Orders.findByCustomerID", query = "SELECT o FROM Orders o WHERE o.customerID = :customerID")
    , @NamedQuery(name = "Orders.findByEmployeeID", query = "SELECT o FROM Orders o WHERE o.employeeID = :employeeID")
    , @NamedQuery(name = "Orders.findByOrderDate", query = "SELECT o FROM Orders o WHERE o.orderDate = :orderDate")
    , @NamedQuery(name = "Orders.findByRequiredDate", query = "SELECT o FROM Orders o WHERE o.requiredDate = :requiredDate")
    , @NamedQuery(name = "Orders.findByShippedDate", query = "SELECT o FROM Orders o WHERE o.shippedDate = :shippedDate")
    , @NamedQuery(name = "Orders.findByShipVia", query = "SELECT o FROM Orders o WHERE o.shipVia = :shipVia")
    , @NamedQuery(name = "Orders.findByFreight", query = "SELECT o FROM Orders o WHERE o.freight = :freight")
    , @NamedQuery(name = "Orders.findByShipName", query = "SELECT o FROM Orders o WHERE o.shipName = :shipName")
    , @NamedQuery(name = "Orders.findByShipAddress", query = "SELECT o FROM Orders o WHERE o.shipAddress = :shipAddress")
    , @NamedQuery(name = "Orders.findByShipCity", query = "SELECT o FROM Orders o WHERE o.shipCity = :shipCity")
    , @NamedQuery(name = "Orders.findByShipRegion", query = "SELECT o FROM Orders o WHERE o.shipRegion = :shipRegion")
    , @NamedQuery(name = "Orders.findByShipPostalCode", query = "SELECT o FROM Orders o WHERE o.shipPostalCode = :shipPostalCode")
    , @NamedQuery(name = "Orders.findByShipCountry", query = "SELECT o FROM Orders o WHERE o.shipCountry = :shipCountry")})
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "OrderID")
    private Integer orderID;
    @Column(name = "CustomerID")
    private String customerID;
    @Column(name = "EmployeeID")
    private Integer employeeID;
    @Column(name = "OrderDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @Column(name = "RequiredDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requiredDate;
    @Column(name = "ShippedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shippedDate;
    @Column(name = "ShipVia")
    private Integer shipVia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Freight")
    private BigDecimal freight;
    @Column(name = "ShipName")
    private String shipName;
    @Column(name = "ShipAddress")
    private String shipAddress;
    @Column(name = "ShipCity")
    private String shipCity;
    @Column(name = "ShipRegion")
    private String shipRegion;
    @Column(name = "ShipPostalCode")
    private String shipPostalCode;
    @Column(name = "ShipCountry")
    private String shipCountry;

    public Orders() {
    }

    public Orders(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Integer getShipVia() {
        return shipVia;
    }

    public void setShipVia(Integer shipVia) {
        this.shipVia = shipVia;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderID != null ? orderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Orders[ orderID=" + orderID + " ]";
    }
    
}
