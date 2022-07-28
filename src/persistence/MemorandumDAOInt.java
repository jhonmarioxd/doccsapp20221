//u20212200570 Jhon Mairo Vanegas Olaya
//u20212199873 Julian David Ordoñez Martinez
package persistence;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import model.Memorandum;

public interface MemorandumDAOInt {
    public List<Memorandum> listMemorandum() throws FileNotFoundException, IOException, ClassNotFoundException;
    public String addMemoramdum(Memorandum memorandum) throws FileNotFoundException, IOException;
    public void deleteMemorandum(Memorandum memorandum);
    public void updateMemorandum(Memorandum memorandum);
    
}
