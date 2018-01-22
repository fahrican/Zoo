package model;

public abstract class Umweltzone implements Matcher {

    private String bezeichnung;
    private float groesse;

    public Umweltzone(){

    }

    public Umweltzone(String bezeichnung, float groesse) {
        this.bezeichnung = bezeichnung;
        this.groesse = groesse;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public float getGroesse() {
        return groesse;
    }


}
