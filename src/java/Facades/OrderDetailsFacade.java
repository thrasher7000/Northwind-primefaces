/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import entidades.OrderDetails;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mrivera
 */
@Stateless
public class OrderDetailsFacade extends AbstractFacade<OrderDetails> implements OrderDetailsFacadeLocal {

    @PersistenceContext(unitName = "RepasoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrderDetailsFacade() {
        super(OrderDetails.class);
    }
    
}
