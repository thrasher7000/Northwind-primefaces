package controladores;

import Facades.CustomersFacadeLocal;
import entidades.Customers;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author mrivera
 */
@Named(value = "customerManagedBean")
@ViewScoped
public class CustomerManagedBean implements Serializable {
    @EJB
    private CustomersFacadeLocal customersFL;
    private Customers customers;
    
    @PostConstruct
    
    public void init(){
        customers = new Customers();
    }

    public CustomersFacadeLocal getCustomersFL() {
        return customersFL;
    }

    public void setCustomersFL(CustomersFacadeLocal customersFL) {
        this.customersFL = customersFL;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.customersFL);
        hash = 41 * hash + Objects.hashCode(this.customers);
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
        final CustomerManagedBean other = (CustomerManagedBean) obj;
        if (!Objects.equals(this.customersFL, other.customersFL)) {
            return false;
        }
        if (!Objects.equals(this.customers, other.customers)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CustomerManagedBean{" + "customersFL=" + customersFL + ", customers=" + customers + '}';
    }

    
    public void registrarUsuario(){
        try {
            customersFL.create(customers);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Aviso","Registro exitoso"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Aviso","No se registro"));
        }   
    }
    
    public List<Customers> listar(){
        return customersFL.findAll();
    }
}
