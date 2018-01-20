package model;

public class Steppe extends Umweltzone{

    private int anzahlBäume;

    public Steppe(String bezeichnung, float groesse, int anzahlBäume) {
        super(bezeichnung, groesse);
        this.anzahlBäume = anzahlBäume;
    }

    public int getAnzahlBäume() {
        return anzahlBäume;
    }

    @Override
    public boolean match(Umweltzone a, Umweltzone b) {
        return a.getBezeichnung() == b.getBezeichnung();
    }
}
