//CRUD Objects
package persistence;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import model.Employees;


public interface EmployeesDAOInt {
    public List<Employees> listEmployees() throws FileNotFoundException, IOException, ClassNotFoundException;
    public String addEmployees(Employees employees) throws FileNotFoundException, IOException;
    public void deleteEmployees(Employees employees);
    public void updateEmployees(Employees employees);
    
}