/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import javax.ejb.Local;

/**
 *
 * @author mrivera
 */
@Local
public interface IManagedBean <T> {
    T getObjetoByKey(Integer id);
    
}
