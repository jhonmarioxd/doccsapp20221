//u20212200570 Jhon Mairo Vanegas Olaya
//u20212199873 Julian David Ordoñez Martinez
package persistence;

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
import model.Memorandum;

public class MemorandumDAOImp implements MemorandumDAOInt {
    
    File file = new File("Memorandum.dat");
    
    @Override
    public List<Memorandum> listMemorandum() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Memorandum> memorandums = new ArrayList<Memorandum>();
        FileInputStream fileInput = new FileInputStream(file);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        try {
            while (fileInput.available()!=0){
                memorandums.add((Memorandum) objectInput.readObject());
            }
        } catch (EOFException e) {
            System.out.println("End of file");
        }
        objectInput.close();
        fileInput.close();
        return memorandums;
    }

    @Override
    public String addMemoramdum(Memorandum memorandum) throws FileNotFoundException, IOException {
    String msg="";
        //Se valida que el objeto que se desea guardar no sea null o que ya
        //exista en el archvo de datos.
        if (memorandum != null && !validateIdMemorandum(memorandum)) {
            try {
                FileOutputStream fileOutput = null;
                //Se crea el objeto FileOutputStream con el atributo true para 
                //habilitar que se agreguen datos al archivo
                fileOutput = new FileOutputStream(file, true);
                //Si el archivo no existe, inicializa el archivo
                if (file.length() == 0) {
                    ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
                    objectOutput.writeObject(memorandum);
                    objectOutput.close();
                } 
                //Si el archivo ya existe, agrega el objeto client usando un objeto
                //de una clase que extiende ObjectOutputStrema para evitar un error
                //en la inicialización del objeto para gestionar el almacenamiento de
                //objeto al archivo de salida
                else {
                    MyObjectOutputStream myobjectOutput = null;
                    myobjectOutput = new MyObjectOutputStream(fileOutput);
                    myobjectOutput.writeObject(memorandum);
                    myobjectOutput.close();
                }
                msg="Memorandum added!";
                fileOutput.close();
            } catch (IOException e) {
                System.out.println("Error Occurred" + e);
            }
        }
        else {
            msg="Memorandum exists!";
        }
        return msg;
    }

    @Override
    public void deleteMemorandum(Memorandum memorandum) {
        //Si el objeto esta en el archivo lo va a borrar
        if (validateIdMemorandum(memorandum)) {
            //Se usa dos archivos, el de datos y uno tempoaral
            File fileIn = new File("memorandum.dat");
            File fileTmp = new File("memorandumtmp.dat");
            try ( FileInputStream flowIn = new FileInputStream(fileIn);  FileOutputStream flowOut = new FileOutputStream(fileTmp)) {
                ObjectInputStream reader= new ObjectInputStream (flowIn);
                ObjectOutputStream writer = new ObjectOutputStream(flowOut);
                Memorandum c;
                while (flowIn.available()!=0) {
                    c = (Memorandum) reader.readObject();
                    //Compara el id de cada registros con el que se desea borrar
                    //Si son diferentes, escribe el registro en el archivo temporal
                    if (c.getId().equals(memorandum.getId())==false) {
                        writer.writeObject(c);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MemorandumDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {    
                Logger.getLogger(MemorandumDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e){
            }
            //Elimina el archivo de datos y despues renombra el archivo temporal como el nuevo archivo de datos
            fileIn.delete();
            fileTmp.renameTo(fileIn);
        }        
    }

    @Override
    public void updateMemorandum(Memorandum memorandum) {
        if (validateIdMemorandum(memorandum)) {
            //Se usa dos archivos, el de datos y uno tempoaral
            File fileIn = new File("memorandum.dat");
            File fileTmp = new File("memorandumttmp.dat");
            try ( FileInputStream flowIn = new FileInputStream(fileIn);  FileOutputStream flowOut = new FileOutputStream(fileTmp)) {
                ObjectInputStream reader= new ObjectInputStream (flowIn);
                ObjectOutputStream writer = new ObjectOutputStream(flowOut);
                Memorandum c;
                while (flowIn.available()!=0) {
                    c = (Memorandum) reader.readObject();
                    //Compara el id de cada registros con el que se desea borrar
                    //Si son diferentes, escribe el regitrro en el archivo temporal
                    if (c.getId().equals(memorandum.getId())==false) {
                        writer.writeObject(c);
                    }
                    else {
                        writer.writeObject(memorandum);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MemorandumDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {    
                Logger.getLogger(MemorandumDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e){
            }
            //Elimina el archivo de datos y despues renombra el archivo temporal como el nuevo archivo de datos
            fileIn.delete();
            fileTmp.renameTo(fileIn);
        }        
    }

    private boolean validateIdMemorandum(Memorandum memorandum) {
        boolean status = false;
        try {
            var memorandums = listMemorandum();
            for (Memorandum c : memorandums) {
                status = c.getId().equals(memorandum.getId());
                if (status)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }


}
