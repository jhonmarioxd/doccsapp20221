package persistence;

import util.MyObjectOutputStream;
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
import model.Employees;
 
   
public class EmployeesDAOImp implements EmployeesDAOInt {
    
    File file = new File("employees.dat");

    @Override
    public List<Employees> listEmployees() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Employees> employees = new ArrayList<>();
        FileInputStream fileInput = new FileInputStream(file);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        try {
            while (fileInput.available()!=0){
                employees.add((Employees) objectInput.readObject());
            }
        } catch (EOFException e) {
            System.out.println("End of file");
        }
        objectInput.close();
        fileInput.close();
        return employees;
    }

    @Override
    public String addEmployees(Employees employees) throws FileNotFoundException, IOException {
        String msg="";
        //Se valida que el objeto que se desea guardar no sea null o que ya
        //exista en el archvo de datos.
        if (employees == null || validateIdEmployees(employees)) {
            msg="Employees exists!";
        }
        else {
            try {
                FileOutputStream fileOutput = null;
                //Se crea el objeto FileOutputStream con el atributo true para 
                //habilitar que se agreguen datos al archivo
                fileOutput = new FileOutputStream(file, true);
                //Si el archivo no existe, inicializa el archivo
                if (file.length() == 0) {
                    try (ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
                        objectOutput.writeObject(employees);
                    }
                } 
                //Si el archivo ya existe, agrega el objeto client usando un objeto
                //de una clase que extiende ObjectOutputStrema para evitar un error
                //en la inicialización del objeto para gestionar el almacenamiento de
                //objeto al archivo de salida
                else {
                    MyObjectOutputStream myobjectOutput = null;
                    myobjectOutput = new MyObjectOutputStream(fileOutput);
                    myobjectOutput.writeObject(employees);
                    myobjectOutput.close();
                }
                msg="Employees added!";
                fileOutput.close();
            } catch (IOException e) {
                System.out.println("Error Occurred" + e);
            }
        }
        return msg;
    }
//El método deleteCliente recibe un objeto client que se desea borrar
    @Override
    public void deleteEmployees(Employees employees) {
        //Si el objeto esta en el archivo lo va a borrar
        if (validateIdEmployees(employees)) {
            //Se usa dos archivos, el de datos y uno tempoaral
            File fileIn = new File("employees.dat");
            File fileTmp = new File("employeestmp.dat");
            try ( FileInputStream flowIn = new FileInputStream(fileIn);  FileOutputStream flowOut = new FileOutputStream(fileTmp)) {
                ObjectInputStream reader= new ObjectInputStream (flowIn);
                ObjectOutputStream writer = new ObjectOutputStream(flowOut);
                Employees e;
                while (flowIn.available()!=0) {
                    e = (Employees) reader.readObject();
                    //Compara el id de cada registros con el que se desea borrar
                    //Si son diferentes, escribe el registro en el archivo temporal
                    if (e.getId().equals(employees.getId())==false) {
                        writer.writeObject(e);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EmployeesDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {    
                Logger.getLogger(EmployeesDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e){
            }
            //Elimina el archivo de datos y despues renombra el archivo temporal como el nuevo archivo de datos
            fileIn.delete();
            fileTmp.renameTo(fileIn);
        }        
    }

    @Override
    public void updateEmployees(Employees employees) {
         //Si el objeto esta en el archivo lo va a actualizar
        if (validateIdEmployees(employees)) {
            //Se usa dos archivos, el de datos y uno tempoaral
            File fileIn = new File("employees.dat");
            File fileTmp = new File("employeestmp.dat");
            try ( FileInputStream flowIn = new FileInputStream(fileIn);  FileOutputStream flowOut = new FileOutputStream(fileTmp)) {
                ObjectInputStream reader= new ObjectInputStream (flowIn);
                ObjectOutputStream writer = new ObjectOutputStream(flowOut);
                Employees e;
                while (flowIn.available()!=0) {
                    e = (Employees) reader.readObject();
                    //Compara el id de cada registros con el que se desea borrar
                    //Si son diferentes, escribe el regitrro en el archivo temporal
                    if (e.getId().equals(employees.getId())==false) {
                        writer.writeObject(e);
                    }
                    else {
                        writer.writeObject(employees);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EmployeesDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {    
                Logger.getLogger(EmployeesDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e){
            }
            //Elimina el archivo de datos y despues renombra el archivo temporal como el nuevo archivo de datos
            fileIn.delete();
            fileTmp.renameTo(fileIn);
        }        
    }
    
    //Recorre los registros guardados para buscar un cliente que se quiere 
    //guardar. Retorna true si el ciente existe en elarchivo, de lo contrario
    //retorna false
    public boolean validateIdEmployees(Employees employees){
        boolean status = false;
        try {
            var employeesl = listEmployees();
            for (Employees e : employeesl) {
                status = e.getId().equals(employees.getId());
                if (status)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    
}