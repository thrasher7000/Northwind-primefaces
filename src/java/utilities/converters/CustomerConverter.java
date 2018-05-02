package utilities.converters;

import entidades.Customers;
import javax.faces.convert.FacesConverter;
import utilities.AbsctractConverter;

/**
 *
 * @author mrivera
 */
@FacesConverter(forClass = Customers.class)
public class CustomerConverter extends AbsctractConverter{
    public CustomerConverter(){
        this.nameManagedBean = "customerManagedBean";
    }
}
