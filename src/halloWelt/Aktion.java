public class Aktion {

    private String name;
    private double spenden;
    private double spendenziel;

    public Aktion(String name, double spenden, double spendenziel) {
        this.name = name;
        this.spenden = spenden;
        this.spendenziel = spendenziel;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    public void setSpenden(double spenden) {
        this.spenden = spenden;
    }

    public double getSpenden(){
        return this.spenden;
    }


    public void setSpendenziel(double spendenziel) {
        this.spendenziel = spendenziel;
    }

    public double getSpendenziel(){
        return this.spendenziel;
    }
}
