public class SpendenErzeuger implements Erzeuger {
    @Override
    public Spende fabrikmethode() {
        return new Spende();
    }
}
