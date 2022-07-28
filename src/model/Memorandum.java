//u20212200570 Jhon Mairo Vanegas Olaya
//u20212199873 Julian David Ordoñez Martinez
package model;

public class Memorandum extends Document{

    public static void add(Memorandum memorandum) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int Date;
    //fecha
    private String addressee;
    //destinario
    private String Theme;
    //tema
    private String message;
    //mensaje
    private String signing;
    //firma
    private String Emails;

    public Memorandum(int Date, String addressee, String Theme, String message, String signing, String Emails) {
        this.Date = Date;
        this.addressee = addressee;
        this.Theme = Theme;
        this.message = message;
        this.signing = signing;
        this.Emails = Emails;
    }

    public Memorandum() {
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int Date) {
        this.Date = Date;
    }

    public String getaddressee() {
        return addressee;
    }

    public void setaddressee (String addressee) {
        this.addressee = addressee;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSigning() {
        return signing;
    }

    public void setSigning(String signing) {
        this.signing = signing;
    }

    public String getEmails() {
        return Emails;
    }

    public void setEmails(String Emails) {
        this.Emails = Emails;
    }

    public String getTheme() {
        return Theme;
    }

    public void setTheme(String Theme) {
        this.Theme = Theme;
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public String getsigning() {
        return signing;
    }

    public void setsigning(String signing) {
        this.signing = signing;
    }

    @Override
    public String toString() {
        return "Memorandum{" + "Date=" + Date + ", addressee=" + addressee + ", Theme=" + Theme + ", message=" + message + ", Signing=" + signing + '}';
    }

    
    
    
}
