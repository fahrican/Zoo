package model;

public class Wasser extends Umweltzone {

    private float wasserTemp;
    private int wasserTiefe;
    private WasserTyp wasserTyp;

    public Wasser(String bezeichnung, float groesse, float wasserTemp, int wasserTiefe, WasserTyp wasserTyp) {
        super(bezeichnung, groesse);
        this.wasserTemp = wasserTemp;
        this.wasserTiefe = wasserTiefe;
        this.wasserTyp = wasserTyp;
    }

    public float getWasserTemp() {
        return wasserTemp;
    }

    public WasserTyp getWasserTyp() {
        return wasserTyp;
    }

    public int getWasserTiefe() {
        return wasserTiefe;
    }

    @Override
    public boolean match(Umweltzone a, Umweltzone b) {
        return a.getBezeichnung().matches(b.getBezeichnung());
    }
}
