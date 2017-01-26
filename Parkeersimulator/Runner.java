package Parkeersimulator;

/**
 * Created by AntonKok on 20-1-2017.
 */
public class Runner {
    public static void main(String[] args) {
        rennen();
    }
    public static void rennen() {
        int i = 2;
        if(i == 1) {
            Simulator sim = new Simulator();
            sim.run();
        } else {
            new GraficalUserInterface();
        }
    }
}
