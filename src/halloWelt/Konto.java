public class Konto {

    private String blz;
    private String kontonummer;
    private String name;
    private String bank;

    public Konto(String blz, String kontonummer, String name, String bank){
        this.blz = blz;
        this.kontonummer = kontonummer;
        this.name = name;
        this.bank = bank;
    }


    public void setBlz(String blz) {
        this.blz = blz;
    }

    public String getBlz(){
        return this.blz;
    }


    public void setKontonummer(String kontonummer) {
        this.kontonummer = kontonummer;
    }

    public String getKontonummer(){
        return this.kontonummer;
    }


    public void seNname(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBank(){
        return this.bank;
    }
}