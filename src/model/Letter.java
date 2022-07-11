
package model;

//SANTIAGO JOSÉ BARBOSA RIVAS        CODIGO : 20212200802
//JONATHAN FELIPE SANCHÉZ MATHEUS    CÓDIGO : 20212200869

public class Letter extends lettersperson {
    private boolean state;
    private String type;
    private String notes;
    
    public Letter(boolean state, String type, String notes,Long id, String fullNameorbusiness, String address, String phone, String email ,String Recipientsname,String date,String affair,String PostalCode, String place,String firm) {
        super(id, fullNameorbusiness, Recipientsname, date, address,affair,phone,email,PostalCode,place,firm);
        this.state = state;
        this.type = type;
        this.notes = notes;
    }

    public Letter(boolean state, String type, String notes) {
        this.state = state;
        this.type = type;
        this.notes = notes;
   }
    
    public Letter() {
    }

    public Letter(Long id, String fullNameorbusiness, String address, String phone, String email, String Recipientsname, String date, String affair, String PostalCode, String place, String firm) {
        super(id, fullNameorbusiness, Recipientsname, date, address,affair,phone,email,PostalCode,place,firm);
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
