public class Spende {

    private double betrag;
    private boolean quittung;
    private String spendername;
    private Status status = Status.IN_BEARBEITUNG;

    public Spende(double betrag, boolean quittung, String spendername) {
        this.betrag = betrag;
        this.quittung = quittung;
        this.spendername = spendername;
    }

    public Spende() {
        this.betrag = 0.0;
        this.quittung = false;
        this.spendername = "";
    }



    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public double getBetrag(){
        return this.betrag;
    }


    public void setQuittung(boolean quittung) {
        this.quittung = quittung;
    }

    public boolean getQuittung(){
        return this.quittung;
    }


    public void setSpendername(String spendername){
        this.spendername = spendername;
    }

    public String getSpendername(){
        return this.spendername;
    }


    public void setStatus(Status status){
        this.status = status;
    }

    public Status getStatus(){
        return this.status;
    }
}
