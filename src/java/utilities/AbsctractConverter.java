/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import controladores.IManagedBean;
import entidades.IDTO;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author mrivera
 */
public abstract class AbsctractConverter implements Converter {

    protected String nameManagedBean;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Integer k = Integer.valueOf(value);
        IManagedBean omb = (IManagedBean) context.getApplication().getELResolver().getValue(
                context.getELContext(), null, nameManagedBean);
        return omb.getObjetoByKey(k);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof IDTO) {
            IDTO dto = (IDTO) value;
            return dto.getPrimaryKey();
        }
        context.addMessage(null, new FacesMessage("Error al convertir el objeto TipoOrden a String"));
        return null;
    }

}
