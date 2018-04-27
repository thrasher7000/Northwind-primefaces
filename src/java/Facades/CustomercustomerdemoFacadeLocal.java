/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import entidades.Customercustomerdemo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mrivera
 */
@Local
public interface CustomercustomerdemoFacadeLocal {

    void create(Customercustomerdemo customercustomerdemo);

    void edit(Customercustomerdemo customercustomerdemo);

    void remove(Customercustomerdemo customercustomerdemo);

    Customercustomerdemo find(Object id);

    List<Customercustomerdemo> findAll();

    List<Customercustomerdemo> findRange(int[] range);

    int count();
    
}
