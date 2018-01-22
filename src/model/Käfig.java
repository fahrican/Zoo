package model;

import java.util.ArrayList;
import java.util.List;

public class Käfig {

    private int id;
    private String bezeichnung;
    private float länge;
    private float breite;
    private float höhe;
    private List<Tier> tierArt = new ArrayList<Tier>();


    public Käfig(int id, String bezeichnung, float länge, float breite, float höhe) {
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.länge = länge;
        this.breite = breite;
        this.höhe = höhe;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getId() {
        return id;
    }

    public float getLänge() {
        return länge;
    }

    public float getBreite() {
        return breite;
    }

    public float getHöhe() {
        return höhe;
    }

    public List<Tier> getBelegung(){
        return this.tierArt;
    }

    public boolean istBesetzt(){

        if (tierArt.size() == 0) {
            return false;
        }
        return true;
    }

    public void addTierArt(Tier tier, Umweltzone umweltzone){

        if (umweltzone.match(tier.getUmweltzone(), umweltzone)) {
            this.tierArt.add(tier);
        }
    }

    public boolean removeTierArt(Tier tier){
        return this.tierArt.remove(tier);
    }

    public Tier getTier(int position){

        return this.tierArt.get(position);
    }

    public void alleTiere(){

        for (Tier tier : tierArt) {
            System.out.println(tier);
        }
    }
}
