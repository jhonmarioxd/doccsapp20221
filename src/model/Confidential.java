package model;


//SANTIAGO JOSÉ BARBOSA RIVAS        CODIGO : 20212200802
//JONATHAN FELIPE SANCHÉZ MATHEUS    CÓDIGO : 20212200869

public class Confidential extends Person {
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
    private String country;
    private String city;
    private String source;
    private boolean state;
    private String type;
    private String notes;
    private Organization org;
    
    public Confidential (boolean state, String type, String notes,Long id, String fullName, String employeessalary, String phone, String email ,String taxreturns,String date,String insurancerecords, String bankcards,String financialinstitutions, String password,String country, String city , String source) {
     super(id, fullName,employeessalary , phone, email);
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
        this.country=country;
        this.city=city;
        this.source=source;
        this.state = state;
        this.type = type;
        this.notes = notes;

 }
    public Confidential (boolean state, String type, String notes) {
        this.state = state;
        this.type = type;
        this.notes = notes;
    }
    public Confidential() {
        
    }
        public Confidential (Long id, String fullName, String employeessalary, String phone, String email ,String taxreturns,String date,String insurancerecords, String bankcards,String financialinstitutions, String password,String country, String city , String source) {
        super (id, fullName,employeessalary , phone, email );
                }
         public Confidential (boolean state, String type, String notes,Long id, Organization org ,String fullName, String employeessalary, String phone, String email ,String taxreturns,String date,String insurancerecords, String bankcards,String financialinstitutions, String password,String country, String city , String source) {
         super (id , fullName,employeessalary , phone, email);
        this.state = state;
        this.type = type;
        this.notes = notes;
        this.org = org;
            }
        public Confidential(boolean state, String type, String notes, Organization org) {
        this.state = state;
        this.type = type;
        this.notes = notes;
        this.org = org;
    }

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
    
    
    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
      public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }
    
   @Override
    public String toString() {
         return "Confidential{" + "state=" + state + ", type=" + type + ", notes=" + notes + '}'+' ' + super.toString() + '-' + org.toString();
}

}



    
