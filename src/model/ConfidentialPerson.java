
package model;
//SANTIAGO JOSÉ BARBOSA RIVAS        CODIGO : 20212200802
//JONATHAN FELIPE SANCHÉZ MATHEUS    CÓDIGO : 20212200869

import java.io.Serializable;


public class ConfidentialPerson implements Serializable{
    private Long id;
    private String fullName;
    private String password;
    private String phone;
    private String email;
    private String date;
    private String employeessalary;
    private String taxreturns;
    private String insurancerecords;
    private String bankcards;
    private String financialinstitutions;
 
 
    
     public ConfidentialPerson(Long id, String fullName, String phone, String email, String date ,String employeessalary,String taxreturns,String insurancerecords,String bankcards,  String financialinstitutions, String password) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.date = date;
        this.employeessalary = employeessalary;
        this.taxreturns=taxreturns;
        this.insurancerecords = insurancerecords;
        this.bankcards = bankcards;
        this.financialinstitutions = financialinstitutions;
        this.password=password;
     }
    public ConfidentialPerson() {
   
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmployeessalary() {
        return employeessalary;
    }

    public void setEmployeessalary(String employeessalary) {
        this.employeessalary = employeessalary;
    }

    public String getTaxreturns() {
        return taxreturns;
    }

    public void setTaxreturns(String taxreturns) {
        this.taxreturns = taxreturns;
    }

    public String getInsurancerecords() {
        return insurancerecords;
    }

    public void setInsurancerecords(String insurancerecords) {
        this.insurancerecords = insurancerecords;
    }

    public String getBankcards() {
        return bankcards;
    }

    public void setBankcards(String bankcards) {
        this.bankcards = bankcards;
    }

    public String getFinancialinstitutions() {
        return financialinstitutions;
    }

    public void setFinancialinstitutions(String financialinstitutions) {
        this.financialinstitutions = financialinstitutions;
    }
    
      @Override
    public String toString() {
        return "Person{" + "id=" + id + ", fullName=" + fullName + ", phone=" + phone + ", email=" + email + ", date=" + date + ", employeessalary=" + employeessalary + ", taxreturns=" + taxreturns + ", insurancerecords=" + insurancerecords + "bankcards=" + bankcards +  ", financialinstitutions=" + financialinstitutions + ", passwrod=" + password +'}';
}
}