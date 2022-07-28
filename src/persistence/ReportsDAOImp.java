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
import model.Reports;

public class ReportsDAOImp implements ReportsDAOInt{
    
    File file = new File("Reports.dat");
    
    @Override
    public List<Reports> listReports() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Reports> reportss = new ArrayList<Reports>();
        FileInputStream fileInput = new FileInputStream(file);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        try {
            while (fileInput.available()!=0){
                reportss.add((Reports) objectInput.readObject());
            }
        } catch (EOFException e) {
            System.out.println("End of file");
        }
        objectInput.close();
        fileInput.close();
        return reportss;
    }

    @Override
    public String addReports(Reports reports) throws FileNotFoundException, IOException {
        String msg="";
        //Se valida que el objeto que se desea guardar no sea null o que ya
        //exista en el archvo de datos.
        if (reports != null && !validateIdReports(reports)) {
            try {
                FileOutputStream fileOutput = null;
                //Se crea el objeto FileOutputStream con el atributo true para 
                //habilitar que se agreguen datos al archivo
                fileOutput = new FileOutputStream(file, true);
                //Si el archivo no existe, inicializa el archivo
                if (file.length() == 0) {
                    ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
                    objectOutput.writeObject(reports);
                    objectOutput.close();
                } 
                //Si el archivo ya existe, agrega el objeto client usando un objeto
                //de una clase que extiende ObjectOutputStrema para evitar un error
                //en la inicialización del objeto para gestionar el almacenamiento de
                //objeto al archivo de salida
                else {
                    MyObjectOutputStream myobjectOutput = null;
                    myobjectOutput = new MyObjectOutputStream(fileOutput);
                    myobjectOutput.writeObject(reports);
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
    public void deleteReports(Reports reports) {
        //Si el objeto esta en el archivo lo va a borrar
        if (validateIdReports(reports)) {
            //Se usa dos archivos, el de datos y uno tempoaral
            File fileIn = new File("reports.dat");
            File fileTmp = new File("reportstmp.dat");
            try ( FileInputStream flowIn = new FileInputStream(fileIn);  FileOutputStream flowOut = new FileOutputStream(fileTmp)) {
                ObjectInputStream reader= new ObjectInputStream (flowIn);
                ObjectOutputStream writer = new ObjectOutputStream(flowOut);
                Reports c;
                while (flowIn.available()!=0) {
                    c = (Reports) reader.readObject();
                    //Compara el id de cada registros con el que se desea borrar
                    //Si son diferentes, escribe el registro en el archivo temporal
                    if (c.getId().equals(reports.getId())==false) {
                        writer.writeObject(c);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ReportsDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {    
                Logger.getLogger(ReportsDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e){
            }
            //Elimina el archivo de datos y despues renombra el archivo temporal como el nuevo archivo de datos
            fileIn.delete();
            fileTmp.renameTo(fileIn);
        }        
    }

    @Override
    public void updateReports(Reports reports) {
            if (validateIdReports(reports)) {
            //Se usa dos archivos, el de datos y uno tempoaral
            File fileIn = new File("reports.dat");
            File fileTmp = new File("reportsttmp.dat");
            try ( FileInputStream flowIn = new FileInputStream(fileIn);  FileOutputStream flowOut = new FileOutputStream(fileTmp)) {
                ObjectInputStream reader= new ObjectInputStream (flowIn);
                ObjectOutputStream writer = new ObjectOutputStream(flowOut);
                Reports c;
                while (flowIn.available()!=0) {
                    c = (Reports) reader.readObject();
                    //Compara el id de cada registros con el que se desea borrar
                    //Si son diferentes, escribe el regitrro en el archivo temporal
                    if (c.getId().equals(reports.getId())==false) {
                        writer.writeObject(c);
                    }
                    else {
                        writer.writeObject(reports);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ReportsDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {    
                Logger.getLogger(ReportsDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e){
            }
            //Elimina el archivo de datos y despues renombra el archivo temporal como el nuevo archivo de datos
            fileIn.delete();
            fileTmp.renameTo(fileIn);
        }    
    }

    private boolean validateIdReports(Reports reports) {
        boolean status = false;
        try {
            var reportss = listReports();
            for (Reports c : reportss) {
                status = c.getId().equals(reports.getId());
                if (status)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
   }
    
