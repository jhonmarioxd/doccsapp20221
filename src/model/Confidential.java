
package model;

//SANTIAGO JOSÉ BARBOSA RIVAS        CODIGO : 20212200802
//JONATHAN FELIPE SANCHÉZ MATHEUS    CÓDIGO : 20212200869

public class Confidential extends ConfidentialPerson  {
    
    private boolean state;
    private String type;
    private String notes;
    
    public Confidential (boolean state, String type, String notes,Long id, String fullName, String employeessalary, String phone, String email ,String taxreturns,String date,String insurancerecords, String bankcards,String financialinstitutions, String password) {
        super(id, fullName,password, phone, email,date ,employeessalary, taxreturns,insurancerecords,bankcards,financialinstitutions);
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
   @Override
    public String toString() {
        return "Letter{" + "state=" + state + ", type=" + type + ", notes=" + notes + '}'+' ' + super.toString();     
}
}
