public class Organisator {

    private String eMail;
    private String nachname;
    private String vorname;
    private String passwort;

    public Organisator(String eMail, String nachname, String vorname, String passwort){
        this.eMail = eMail;
        this.nachname = nachname;
        this.vorname = vorname;
        this.passwort = passwort;
    }


    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getEMail(){
        return this.eMail;
    }


    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getNachname(){
        return this.nachname;
    }


    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getVorname(){
        return this.vorname;
    }


    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public String getPasswort(){
        return this.passwort;
    }
}
