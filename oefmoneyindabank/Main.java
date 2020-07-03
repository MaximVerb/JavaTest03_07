package oefmoneyindabank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Overzichtsrekening eenOverzichtsrekening = new Overzichtsrekening(005,1000);
        Spaarrekening eenSpaarrekening = new Spaarrekening(001,1000,eenOverzichtsrekening);
        Rekening[] rekening = {eenSpaarrekening};
        Persoon aPerson = new Persoon(rekening,"Maxim");
        eenSpaarrekening.storten(eenOverzichtsrekening, 500 );
        eenSpaarrekening.addInterest();
    }
}
