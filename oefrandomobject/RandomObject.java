package oefrandomobject;

import java.util.Random;

public class RandomObject {

    public RandomObject() {
    }

    void randomDigits() {
        Random generator = new Random();
        for (int i = 0; i < 25; i++) {
            int x = generator.nextInt(1000) + 1;
            if (x < 250)
            {
                System.out.println(x +"\nPIEF");
            }
            else if (x <= 500 && x >= 250)
            {
                System.out.println(x+"\nPOEF");
            }
            else if (x > 500)
            {
                System.out.println(x+"\nPAF");
            }
        }
    }
}
// Geen C-stijl en Java-stijl curly braces door elkaar gebruiken. Maakt niet uit welke ge gebruikt op zich, zolang ge consistent blijft.
