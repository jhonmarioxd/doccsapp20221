//u20212200570 Jhon Mairo Vanegas Olaya
//u20212199873 Julian David Ordoñez Martinez
package model;

import java.io.Serializable;


/**
 *
 * @author Mario
 */
public class Reports implements Serializable{
    private String TitlePage;
    //portada
    private String rating;
    //indice
    private String Introduction;
    //intriduccion
    private String ReportBody;
    //cuerpo del informe
    private String Conclusions;
    //conclusiones
    private String Bibliography;
    //bibliografia
    private String Emails;
    
    public Reports(String TitlePage,String Emails, String rating, String Introduction, String ReportBodye, String conclusions, String Bibliography) {
        this.TitlePage = TitlePage;
        this.rating = rating;
        this.Introduction = Introduction;
        this.ReportBody = ReportBodye;
        this.Conclusions = conclusions;
        this.Bibliography = Bibliography;
        this.Emails = Emails;
    }
    
    public Reports() {
    }
    
    public String getTitlePage() {
        return TitlePage;
    }

    public String getEmails() {
        return Emails;
    }

    public void setEmails(String Emails) {
        this.Emails = Emails;
    }

    public void setTitlePage(String TitlePage) {
        this.TitlePage = TitlePage;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getIntroduction() {
        return Introduction;
    }

    public void setIntroduction(String Introduction) {
        this.Introduction = Introduction;
    }

    public String getReportBody() {
        return ReportBody;
    }

    public void setReportBody(String ReportBody) {
        this.ReportBody = ReportBody;
    }

    public String getConclusions() {
        return Conclusions;
    }

    public void setConclusions(String Conclusions) {
        this.Conclusions = Conclusions;
    }

    public String getBibliography() {
        return Bibliography;
    }

    public void setBibliography(String Bibliography) {
        this.Bibliography = Bibliography;
    }

    
    @Override
    public String toString() {
        return "Memorandum{" + "TitlePage=" + TitlePage + ", rating=" + rating + ", Introduction=" + Introduction + ", Report Body=" + ReportBody + ", Conclusions=" + Conclusions + ", Bibliography=" + Bibliography + '}';
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
