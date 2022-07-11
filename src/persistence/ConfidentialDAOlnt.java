
package persistence;

//SANTIAGO JOSÉ BARBOSA RIVAS        CODIGO : 20212200802
//JONATHAN FELIPE SANCHÉZ MATHEUS    CÓDIGO : 20212200869

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import model.Confidential;


public interface ConfidentialDAOlnt {
      public List<Confidential> listConfidential() throws FileNotFoundException, IOException, ClassNotFoundException;
    public String addConfidential(Confidential confidential) throws FileNotFoundException, IOException;
    public void deleteConfidential(Confidential confidential);
    public void updateConfidential(Confidential confidential);
}
