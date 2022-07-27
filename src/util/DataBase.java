
package util;

import model.Client;
import model.Organization;
import persistence.ClientDAOImp;
import persistence.OrganizationDAOImp;

public class DataBase {
    public static void main(String[] args) {
        System.out.println("Add dta base...");
        addOrganization();
        listOrganization();
    }
    public static void addOrganization(){
        var organizationDAOImp=new OrganizationDAOImp();
        var org = new Organization();
        org.setId("00-");
        org.setComercialName("ComercialName-");
        org.setLegalName("LegalName-");
        org.setAddress("Addres-");
        org.setCity("City-");
        org.setCoutry("Country-");
        org.setEmail("email@email.co-");
        org.setPhone("00112345-");
        try{
            for (int i = 1; i <= 6; i++) {
                org.setId("00-00"+i);
                org.setComercialName("ComercialName-0"+i);
                org.setLegalName("LegalName-"+i);
                org.setAddress("Addres-"+i);
                org.setCity("City-"+i);
                org.setCoutry("Country-"+i);
                org.setEmail("email@email.co-"+i);
                org.setPhone("00112345-"+i);
                var msg = organizationDAOImp.addOrganization(org);
                System.out.println(msg);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
    public static void listOrganization() {
        var organizationDAOImp = new OrganizationDAOImp();
        //var org = new Organization();
        try {
            var orgs = organizationDAOImp.listOrganization();
            for (Organization o : orgs) {
                System.out.println(o.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
