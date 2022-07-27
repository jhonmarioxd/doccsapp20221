package model;

//SANTIAGO JOSÉ BARBOSA RIVAS        CODIGO : 20212200802
//JONATHAN FELIPE SANCHÉZ MATHEUS    CÓDIGO : 20212200869

public class Letter extends Person {
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
    private String source;
    private String country;
    private boolean state;
    private String type;
    private String notes;
    private Organization org;
    
    
    public Letter(boolean state, String type, String notes,Long id, String fullNameorbusiness, String address, String phone, String email ,String Recipientsname,String date,String affair,String PostalCode,  String place,String firm,String source, String country) {
         super(id, fullNameorbusiness,address , phone, email);
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
        this.source = source;
        this.country = country;
        this.state = state;
        this.type = type;
        this.notes = notes;

    }
    public Letter (boolean state, String type, String notes) {
        this.state = state;
        this.type = type;
        this.notes = notes;
    }
public Letter() {
    }
 public Letter (Long id, String fullNameorbusiness, String address, String phone, String email ,String Recipientsname,String date,String affair,String PostalCode,  String place,String firm,String source, String country) {
        super (id, fullNameorbusiness,address , phone, email );
              }
  public Letter (boolean state, String type, String notes,Long id,Organization org, String fullNameorbusiness, String address, String phone, String email ,String Recipientsname,String date,String affair,String PostalCode,  String place,String firm,String source, String country) {
         super (id, fullNameorbusiness,address , phone, email);
        this.state = state;
        this.type = type;
        this.notes = notes;
        this.org = org;
            }
        public Letter(boolean state, String type, String notes, Organization org) {
        this.state = state;
        this.type = type;
        this.notes = notes;
        this.org = org;
        }
        
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getAffair() {
        return affair;
    }

    public void setAffair(String affair) {
        this.affair = affair;
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
      public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", fullNameorbusiness=" + fullNameorbusiness + ", address=" + address + ", phone=" + phone + ", email=" + email + ", Recipientsname=" + Recipientsname + ", date=" + date + ", affair=" + affair + ", PostalCode=" + PostalCode + ", place=" + place +  ", firm=" + firm +", type= "+ type + " , state=" + state + " , source=" + source +", country=" + country +" , notes=" + notes+'}';
    
    }    
}