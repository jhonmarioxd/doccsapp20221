
package persistence;

//SANTIAGO JOSÉ BARBOSA RIVAS        CODIGO : 20212200802
//JONATHAN FELIPE SANCHÉZ MATHEUS    CÓDIGO : 20212200869

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Letter;

public class LetterDAOlmp implements LetterDAOlnt {
    
    File file = new File("letter.dat");

    @Override
    public List<Letter> listLetter() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Letter> letter = new ArrayList<Letter>();
        FileInputStream fileInput = new FileInputStream(file);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        try {
            while (fileInput.available()!=0){
                letter.add((Letter) objectInput.readObject());
            }
        } catch (EOFException e) {
            System.out.println("End of file");
        }
        objectInput.close();
        fileInput.close();
        return letter;
    }
    @Override
    public String addLetter(Letter letter) throws FileNotFoundException, IOException {
        String msg="";
        
        if (letter != null && !validateIdLetter (letter)) {
            try {
                FileOutputStream fileOutput = null;
                
                fileOutput = new FileOutputStream(file, true);
               
                if (file.length() == 0) {
                    ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
                    objectOutput.writeObject(letter);
                    objectOutput.close();
                } 
             
                else {
                    MyObjectOutputStream myobjectOutput = null;
                    myobjectOutput = new MyObjectOutputStream(fileOutput);
                    myobjectOutput.writeObject(letter);
                    myobjectOutput.close();
                }
                msg="Letter added!";
                fileOutput.close();
            } catch (IOException e) {
                System.out.println("Error Occurred" + e);
            }
        }
        else {
            msg="Letter exists!";
        }
        return msg;
    }

    @Override
    public void deleteLetter(Letter letter) {
        
        if (validateIdLetter(letter)) {
            
            File fileIn = new File("letter.dat");
            File fileTmp = new File("lettertmp.dat");
            try ( FileInputStream flowIn = new FileInputStream(fileIn);  FileOutputStream flowOut = new FileOutputStream(fileTmp)) {
                ObjectInputStream reader= new ObjectInputStream (flowIn);
                ObjectOutputStream writer = new ObjectOutputStream(flowOut);
                Letter c;
                while (flowIn.available()!=0) {
                    c = (Letter) reader.readObject();
                   
                    if (c.getId().equals(letter.getId())==false) {
                        writer.writeObject(c);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LetterDAOlmp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {    
                Logger.getLogger(LetterDAOlmp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e){
            }
           
            fileIn.delete();
            fileTmp.renameTo(fileIn);
        }        
    }

    @Override
    public void updateLetter(Letter letter){
        if (validateIdLetter(letter)) {
            File fileIn = new File("letter.dat");
            File fileTmp = new File("lettertmp.dat");
            try ( FileInputStream flowIn = new FileInputStream(fileIn);  FileOutputStream flowOut = new FileOutputStream(fileTmp)) {
                ObjectInputStream reader= new ObjectInputStream (flowIn);
                ObjectOutputStream writer = new ObjectOutputStream(flowOut);
                Letter c;
                while (flowIn.available()!=0) {
                    c = (Letter) reader.readObject();
                   
                    if (c.getId().equals(letter.getId())==false) {
                        writer.writeObject(c);
                    }
                    else {
                        writer.writeObject(letter);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LetterDAOlmp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {    
                Logger.getLogger(LetterDAOlmp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e){
            }
            
            fileIn.delete();
            fileTmp.renameTo(fileIn);
        }        
    }
    
   
    public boolean validateIdLetter(Letter letter){
        boolean status = false;
        try {
            var letters = listLetter();
            for (Letter c : letters) {
                status = c.getId().equals(letter.getId());
                if (status)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;

    }
}

