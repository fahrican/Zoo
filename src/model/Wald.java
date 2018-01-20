package model;

public class Wald extends Umweltzone {

    private float fläche;

    public Wald(String bezeichnung, float groesse, float fläche) {
        super(bezeichnung, groesse);
        this.fläche = fläche;
    }

    public float getFläche() {
        return fläche;
    }

    @Override
    public boolean match(Umweltzone a, Umweltzone b) {
        return a.getGroesse() == b.getGroesse();
    }
}
