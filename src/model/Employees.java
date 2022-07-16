package model;

    public class Employees extends Person {
       private boolean state;
       private String type;
       private String notes;
       private String hours;
       private String payments;
       private Organization eps;

    public Employees(boolean state, String type, String notes, String hours, String payments, Long id, String fullName, String address, String phone, String email) {
        super(id, fullName, address, phone, email);
        this.state = state;
        this.type = type;
        this.notes = notes;
        this.hours = hours;
        this.payments = payments;
    }

    public Employees(boolean state, String type, String notes, String hours, String payments) {
        this.state = state;
        this.type = type;
        this.notes = notes;
        this.hours = hours;
        this.payments = payments;
    }

    public Employees(){
    }
    
    public Employees(Long id, String fullName, String address, String phone, String email){
      super(id, fullName, address, phone, email);
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

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments;
    }
      @Override
    public String toString() {
        return "employees{" + "state=" + state +", type=" + type + ", hours=" + hours +", payments=" + payments +", notes=" + notes+ '}'+' ' + super.toString();
    } 
       
    }
    
