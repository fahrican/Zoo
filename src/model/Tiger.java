package model;

import java.util.Date;

public class Tiger extends Tier {

    private String herkunft;

    public Tiger(Date geburtsdatum, char geschlecht, String name, Umweltzone umweltzone, String herkunft) {
        super(geburtsdatum, geschlecht, name, umweltzone);
        this.herkunft = herkunft;
    }

    public String getHerkunft() {
        return herkunft;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\nGeschlecht: " + this.getGeschlecht()
                + "\nHerkunft: " + this.getHerkunft()
                + "\nUmweltzone: " + this.getUmweltzone().getBezeichnung();
    }
}
