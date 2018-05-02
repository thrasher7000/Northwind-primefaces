package controladores;

import Facades.EmployeesFacadeLocal;
import entidades.Employees;
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
@Named(value = "employeedManagedBean")
@ViewScoped
public class EmployeedManagedBean implements Serializable, IManagedBean<Employees>{
    @EJB 
    private EmployeesFacadeLocal employeesFL;
    private Employees employees;
    
    @PostConstruct
    
    public void init(){
        employees =  new Employees();
    }

    public EmployeesFacadeLocal getEmployeesFL() {
        return employeesFL;
    }

    public void setEmployeesFL(EmployeesFacadeLocal employeesFL) {
        this.employeesFL = employeesFL;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.employeesFL);
        hash = 23 * hash + Objects.hashCode(this.employees);
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
        final EmployeedManagedBean other = (EmployeedManagedBean) obj;
        if (!Objects.equals(this.employeesFL, other.employeesFL)) {
            return false;
        }
        if (!Objects.equals(this.employees, other.employees)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmployeedManagedBean{" + "employeesFL=" + employeesFL + ", employees=" + employees + '}';
    }
    
    public void registrarEmpleado(){
        try {
            employeesFL.create(employees);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Aviso","Registro exitoso"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Aviso","No se registro"));
        }
    }
    
    public List<Employees> listarEmpleados(){
        return employeesFL.findAll();
    }

    @Override
    public Employees getObjetoByKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
