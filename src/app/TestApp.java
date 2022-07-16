
package app;

import model.Client;
import model.Organization;
import persistence.ClientDAOImp;

public class TestApp {
    public static void main(String[] args) {
        var clientDAOImp=new ClientDAOImp();
        var org = new Organization();
        org.setId("1234");
        org.setComercialName("Com1");
        org.setLegalName("Leg1");
        String msg;
        var c1=new Client();
        //c1.setId(3L);
        c1.setFullName("AA");
        c1.setAddress("Address");
        c1.setEmail("email@email.co");
        try{
            for (int i = 80; i <= 85; i++) {
                c1.setId(Long.valueOf(i));
                c1.setFullName("0"+i+"Name");
                c1.setAddress(i+"Address Kra");
                c1.setEmail(i+"email@email.co");
                c1.setOrg(org);
                c1.setType("Normal");
                c1.setState(true);
                msg = clientDAOImp.addClient(c1);
                System.out.println(msg);
            }
          
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        try{
            var clients = clientDAOImp.listClients();
            for(Client c : clients){
                System.out.println(c.toString());
        }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
}
