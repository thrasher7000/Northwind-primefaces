/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import Facades.OrdersFacadeLocal;
import entidades.Orders;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author mrivera
 */
@Named(value = "orderManagedBean")
@ViewScoped
public class OrderManagedBean implements Serializable{
    @EJB
    private OrdersFacadeLocal orderFL;
    private Orders order;
    
    @PostConstruct
    public void init (){
        order =  new Orders();
    }

    public OrdersFacadeLocal getOrderFL() {
        return orderFL;
    }

    public void setOrderFL(OrdersFacadeLocal orderFL) {
        this.orderFL = orderFL;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.orderFL);
        hash = 23 * hash + Objects.hashCode(this.order);
        return hash;
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
        final OrderManagedBean other = (OrderManagedBean) obj;
        if (!Objects.equals(this.orderFL, other.orderFL)) {
            return false;
        }
        if (!Objects.equals(this.order, other.order)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OrderManagedBean{" + "orderFL=" + orderFL + ", order=" + order + '}';
    }
    
    
    
    public void registrarOrden(){
        try {
            orderFL.create(order);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Aviso","Registro exitoso de la orden"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Aviso","No se registro la orden"));
        }
    }
    
    public List <Orders> listarOrdenes(){
        return orderFL.findAll();
    }
    
    public void actualizarOrden(){
        try {
            orderFL.edit(order);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Aviso","Actualización de la orden exitosa."));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Aviso","Actualización fallida."));
        }
    }
    
    public void eliminarOrden(Orders o){
        try {
            orderFL.remove(order);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Aviso","Se eliminó correctamente la orden"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Aviso","No se eliminó la orden."));
        }
    }
}