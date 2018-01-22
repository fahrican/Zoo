package program;

import model.*;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Date birthday = new Date(2018, 1, 20);
        Wald wald = new Wald("Auwald", (float)50.5, (float)100.5);
        Tiger tiger = new Tiger(birthday, 'W', "Maya", wald, "Thailand");
        Tiger tigerNancy = new Tiger(birthday, 'W', "Nancy", wald, "Bangladesch");
        Käfig käfig = new Käfig(1, "Tiger Käfig", (float) 66, (float) 66, (float) 66);
        WasserTyp salzwasser = WasserTyp.Salzwasser;
        Wasser wasser = new Wasser("Meer", (float) 50, (float) 50, 100, salzwasser);

        //start of the program
        zoo.addKäfig(käfig);
        System.out.println(zoo.steckeTierInFreienKäfig(tiger, wald));
        System.out.println(zoo.steckeTierInFreienKäfig(tigerNancy, wasser));
        System.out.println();
        zoo.listAlleTiere();

    }
}
