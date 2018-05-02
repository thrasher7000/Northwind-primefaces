/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities.converters;

import entidades.Orders;
import javax.faces.convert.FacesConverter;
import utilities.AbsctractConverter;

/**
 *
 * @author mrivera
 */
@FacesConverter(forClass = Orders.class)
public class OrderConverter extends AbsctractConverter{
    public OrderConverter(){
        this.nameManagedBean = "orderManagedBean";
    }
    
}
