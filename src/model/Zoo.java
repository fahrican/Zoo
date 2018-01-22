package model;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Käfig> käfige = new ArrayList<Käfig>();

    public void addKäfig(Käfig käfig){
        this.käfige.add(käfig);
    }

    public boolean removeKäfig(Käfig käfig){
        return this.käfige.remove(käfig);
    }

    public Käfig getKäfig(int position){

        if (this.käfige.get(position) != null) {
            return this.käfige.get(position);
        }
        return null;
    }

    public void listAlleTiere(Käfig k){

        k.alleTiere();
    }

    public void listAlleTiere(){

        for (Käfig k : käfige) {

            k.alleTiere();
        }
    }

    public boolean steckeTierInFreienKäfig(Tier t, Umweltzone umweltzone){

        for (Käfig käfig : käfige) {

            if (!käfig.istBesetzt()){

                if (umweltzone.match(t.getUmweltzone(), umweltzone)){
                    käfig.addTierArt(t, umweltzone);
                    return true;
                }
            }
        }
        return false;
    }
}
