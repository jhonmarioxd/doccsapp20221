//Versión creada por:
//20212200100	ESTEFANIA RODRIGUEZ CARDOSO
//20212201520	ESTEFANIA OLAYA LOZADA
package model;

import java.io.Serializable;
import java.util.Date;

public class Organization implements Serializable, Comparable{
    private String id;
    private String legalName;
    private String comercialName;
    private Date dateRegister;
    private String type;
    private boolean state;
    private String notes;
    private String phone;
    private String email;
    private String address;
    private String city;
    private String coutry;
    private String postalCode;

    public Organization() {
    }

    public Organization(String id, String legalName, String comercialName, Date dateRegister, String type, boolean state, String notes, String phone, String email, String address, String city, String coutry, String postalCode) {
        this.id = id;
        this.legalName = legalName;
        this.comercialName = comercialName;
        this.dateRegister = dateRegister;
        this.type = type;
        this.state = state;
        this.notes = notes;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.city = city;
        this.coutry = coutry;
        this.postalCode = postalCode;
    }

    public String getId() {
        return id;
    }

    public String getLegalName() {
        return legalName;
    }

    public String getComercialName() {
        return comercialName;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public String getType() {
        return type;
    }

    public boolean isState() {
        return state;
    }

    public String getNotes() {
        return notes;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCoutry() {
        return coutry;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public void setComercialName(String comercialName) {
        this.comercialName = comercialName;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

   @Override
   public int compareTo(Object o) {
      Organization org = (Organization) o;
      return this.getComercialName().compareTo(org.getComercialName());
   }
   
   public int compareId(Object o) {
      Organization org = (Organization) o;
      return this.getId().compareTo(org.getId());
   }

    @Override
    public String toString() {
        return "Organization{" + "id=" + id + ", legalName=" + legalName + ", comercialName=" + comercialName + ", dateRegister=" + dateRegister + ", type=" + type + ", state=" + state + ", notes=" + notes + ", phone=" + phone + ", email=" + email + ", address=" + address + ", city=" + city + ", coutry=" + coutry + ", postalCode=" + postalCode + '}';
    }
}