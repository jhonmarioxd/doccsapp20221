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
import model.Confidential;

public class ConfidentialDAOlmp implements ConfidentialDAOlnt {
    
    File file = new File("Confidential.dat");

    @Override
    public List<Confidential> listConfidential() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Confidential> confidential = new ArrayList<Confidential>();
        FileInputStream fileInput = new FileInputStream(file);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        try {
            while (fileInput.available()!=0){
                confidential.add((Confidential) objectInput.readObject());
            }
        } catch (EOFException e) {
            System.out.println("End of file");
        }
        objectInput.close();
        fileInput.close();
        return confidential;
    }
    @Override
    public String addConfidential(Confidential confidential) throws FileNotFoundException, IOException {
        String msg="";
        
        if (confidential != null && !validateIdConfidential (confidential)) {
            try {
                FileOutputStream fileOutput = null;
                
                fileOutput = new FileOutputStream(file, true);
               
                if (file.length() == 0) {
                    ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
                    objectOutput.writeObject(confidential);
                    objectOutput.close();
                } 
             
                else {
                    MyObjectOutputStream myobjectOutput = null;
                    myobjectOutput = new MyObjectOutputStream(fileOutput);
                    myobjectOutput.writeObject(confidential);
                    myobjectOutput.close();
                }
                msg="Confidential added!";
                fileOutput.close();
            } catch (IOException e) {
                System.out.println("Error Occurred" + e);
            }
        }
        else {
            msg="Confidential exists!";
        }
        return msg;
    }

    @Override
    public void deleteConfidential(Confidential confidential) {
        
        if (validateIdConfidential(confidential)) {
            
            File fileIn = new File("confidential.dat");
            File fileTmp = new File("confidentialtmp.dat");
            try ( FileInputStream flowIn = new FileInputStream(fileIn);  FileOutputStream flowOut = new FileOutputStream(fileTmp)) {
                ObjectInputStream reader= new ObjectInputStream (flowIn);
                ObjectOutputStream writer = new ObjectOutputStream(flowOut);
                Confidential c;
                while (flowIn.available()!=0) {
                    c = (Confidential) reader.readObject();
                   
                    if (c.getId().equals(confidential.getId())==false) {
                        writer.writeObject(c);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ConfidentialDAOlmp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {    
                Logger.getLogger(ConfidentialDAOlmp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e){
            }
           
            fileIn.delete();
            fileTmp.renameTo(fileIn);
        }        
    }

    @Override
    public void updateConfidential(Confidential confidential){
        if (validateIdConfidential(confidential)) {
            File fileIn = new File("confidential.dat");
            File fileTmp = new File("confidential.dat");
            try ( FileInputStream flowIn = new FileInputStream(fileIn);  FileOutputStream flowOut = new FileOutputStream(fileTmp)) {
                ObjectInputStream reader= new ObjectInputStream (flowIn);
                ObjectOutputStream writer = new ObjectOutputStream(flowOut);
                Confidential c;
                while (flowIn.available()!=0) {
                    c = (Confidential) reader.readObject();
                   
                    if (c.getId().equals(confidential.getId())==false) {
                        writer.writeObject(c);
                    }
                    else {
                        writer.writeObject(confidential);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ConfidentialDAOlmp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {    
                Logger.getLogger(ConfidentialDAOlmp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e){
            }
            
            fileIn.delete();
            fileTmp.renameTo(fileIn);
        }        
    }
    
   
    public boolean validateIdConfidential(Confidential confidential){
        boolean status = false;
        try {
            var confidentials = listConfidential();
            for (Confidential c : confidentials) {
                status = c.getId().equals(confidential.getId());
                if (status)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;

    }
}