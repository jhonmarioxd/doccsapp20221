//u20212200570 Jhon Mairo Vanegas Olaya
//u20212199873 Julian David Ordoñez Martinez
package persistence;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import model.Reports;


public interface ReportsDAOInt {
    public List<Reports> listReports() throws FileNotFoundException, IOException, ClassNotFoundException;
    public String addReports(Reports reports) throws FileNotFoundException, IOException;
    public void deleteReports(Reports reports);
    public void updateReports(Reports reports);
    
}
