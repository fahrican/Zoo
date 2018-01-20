package model;

import java.util.Date;

public abstract class Tier {

    private Date geburtsdatum;
    private char geschlecht;
    private String name;
    private Umweltzone umweltzone;

    public Tier(Date geburtsdatum, char geschlecht, String name, Umweltzone umweltzone) {
        this.geburtsdatum = geburtsdatum;
        this.geschlecht = geschlecht;
        this.name = name;
        this.umweltzone = umweltzone;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public String getName() {
        return name;
    }

    public Umweltzone getUmweltzone() {
        return umweltzone;
    }

    public abstract String toString();
}
