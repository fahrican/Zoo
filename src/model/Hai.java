package model;

import java.util.Date;

public class Hai extends Tier {

    private String ozean;

    public Hai(Date geburtsdatum, char geschlecht, String name, Umweltzone umweltzone, String ozean) {
        super(geburtsdatum, geschlecht, name, umweltzone);
        this.ozean = ozean;
    }

    public String getOzean() {
        return ozean;
    }

    @Override
    public String toString() {

        return "Name: " + this.getName() + "\nGeschlecht: " + this.getGeschlecht()
                + "\nOzean: " + this.getOzean()
                + "\nUmweltzone: " + this.getUmweltzone().getBezeichnung();
    }
}
