package Parkeersimulator;

import java.util.Random;
import java.awt.*;

/* In de simulator wordt nog geen rekening gehouden met het feit dat een deel van de plekken specifiek gereserveerd is voor
        de abonnementhouders. Zorg er voor dat dit wel gebeurt.
        Verder is de instroom van abonnement houders niet afhankelijk van het aantal abonnementen dat is uitgegeven.
        Zorg ervoor dat dit ook in de simulator verwerkt wordt.
*/

/**
 * Created by emirs on 22/01/2017.
 */
public class AbonCar extends Car {
    private static final Color COLOR=Color.green;

    public AbonCar() {
        Random random = new Random();
        int stayMinutes = (int) (15 + random.nextFloat() * 3 * 60);
        this.setMinutesLeft(stayMinutes);
        this.setHasToPay(false);
    }

    public Color getColor(){
        return COLOR;
    }
}
