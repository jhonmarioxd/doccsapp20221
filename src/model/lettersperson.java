package model;

import java.io.Serializable;

//SANTIAGO JOSÉ BARBOSA RIVAS        CODIGO : 20212200802
//JONATHAN FELIPE SANCHÉZ MATHEUS    CÓDIGO : 20212200869

public class lettersperson implements Serializable{
    private Long id;
    private String fullNameorbusiness;
    private String Recipientsname;
    private String date;
    private String address;
    private String affair;
    private String phone;
    private String email;
    private String PostalCode;
    private String place;
    private String firm;
    
    
    public lettersperson(Long id, String fullNameorbusiness, String address, String phone, String email ,String Recipientsname,String date,String affair,String PostalCode,  String place,String firm) {
        this.id = id;
        this.fullNameorbusiness = fullNameorbusiness;
        this.Recipientsname=Recipientsname;
         this.date = date;
        this.address = address;
        this.affair = affair;
        this.phone = phone;
        this.email = email;
        this.PostalCode = PostalCode;
        this.place = place;
        this.firm = firm;
    }
public lettersperson() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullNameorbusiness() {
        return fullNameorbusiness;
    }

    public void setFullNameorbusiness(String fullNameorbusiness) {
        this.fullNameorbusiness = fullNameorbusiness;
    }

    public String getRecipientsname() {
        return Recipientsname;
    }

    public void setRecipientsname(String Recipientsname) {
        this.Recipientsname = Recipientsname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAffair() {
        return affair;
    }

    public void setAffair(String affair) {
        this.affair = affair;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", fullNameorbusiness=" + fullNameorbusiness + ", address=" + address + ", phone=" + phone + ", email=" + email + ", Recipientsname=" + Recipientsname + ", date=" + date + ", affair=" + affair + ", PostalCode=" + PostalCode + ", place=" + place +  ", firm=" + firm +'}';
    }
    
}