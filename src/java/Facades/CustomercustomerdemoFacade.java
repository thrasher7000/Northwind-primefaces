/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import entidades.Customercustomerdemo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mrivera
 */
@Stateless
public class CustomercustomerdemoFacade extends AbstractFacade<Customercustomerdemo> implements CustomercustomerdemoFacadeLocal {

    @PersistenceContext(unitName = "RepasoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomercustomerdemoFacade() {
        super(Customercustomerdemo.class);
    }
    
}
