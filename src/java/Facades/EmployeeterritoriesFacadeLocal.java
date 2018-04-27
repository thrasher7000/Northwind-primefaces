/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import entidades.Employeeterritories;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mrivera
 */
@Local
public interface EmployeeterritoriesFacadeLocal {

    void create(Employeeterritories employeeterritories);

    void edit(Employeeterritories employeeterritories);

    void remove(Employeeterritories employeeterritories);

    Employeeterritories find(Object id);

    List<Employeeterritories> findAll();

    List<Employeeterritories> findRange(int[] range);

    int count();
    
}
