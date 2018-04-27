/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import entidades.Customerdemographics;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mrivera
 */
@Local
public interface CustomerdemographicsFacadeLocal {

    void create(Customerdemographics customerdemographics);

    void edit(Customerdemographics customerdemographics);

    void remove(Customerdemographics customerdemographics);

    Customerdemographics find(Object id);

    List<Customerdemographics> findAll();

    List<Customerdemographics> findRange(int[] range);

    int count();
    
}
