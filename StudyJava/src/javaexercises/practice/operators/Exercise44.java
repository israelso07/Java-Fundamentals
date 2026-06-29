package javaexercises.practice.operators;

public class Exercise44 {
    public static void main(String[] args) {

        double battery = 78;
        boolean chargerConnected = false;

        boolean batteryBigger = battery > 20;
        boolean theChargerConnected = chargerConnected;
        boolean continueUsing = battery >= 20 || chargerConnected == true;

        System.out.println(batteryBigger);
        System.out.println(theChargerConnected);
        System.out.println(continueUsing);
    }
}
