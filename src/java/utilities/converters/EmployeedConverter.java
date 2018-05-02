package utilities.converters;

import entidades.Employees;
import javax.faces.convert.FacesConverter;
import utilities.AbsctractConverter;

/**
 *
 * @author mrivera
 */
@FacesConverter(forClass = Employees.class) 
public class EmployeedConverter extends AbsctractConverter {
    public EmployeedConverter(){
        this.nameManagedBean = "employeedManagedBean";
    }
}
