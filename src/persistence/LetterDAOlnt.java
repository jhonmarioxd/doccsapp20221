package persistence;

//SANTIAGO JOSÉ BARBOSA RIVAS        CODIGO : 20212200802
//JONATHAN FELIPE SANCHÉZ MATHEUS    CÓDIGO : 20212200869

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import model.Letter;

public interface LetterDAOlnt {
    public List<Letter> listLetter() throws FileNotFoundException, IOException, ClassNotFoundException;
    public String addLetter(Letter letter) throws FileNotFoundException, IOException;
    public void deleteLetter(Letter letter);
    public void updateLetter(Letter letter);
    
}