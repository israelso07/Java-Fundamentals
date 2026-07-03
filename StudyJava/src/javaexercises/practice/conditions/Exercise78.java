package javaexercises.practice.conditions;

public class Exercise78 {
    public static void main(String[] args) {

        double battery = 12;
        String chargeBattery = "Charge now";
        String goodBattery = "Battery OK";

        String batteryStatus = battery < 15 ? chargeBattery : goodBattery;

        System.out.println(batteryStatus);


    }
}
