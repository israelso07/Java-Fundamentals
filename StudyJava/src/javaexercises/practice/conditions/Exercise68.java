package javaexercises.practice.conditions;

public class Exercise68 {
    public static void main(String[] args) {

        double battery = 20;
        String batteryStatusGood = "Good";
        String batteryStatusLow = "Low";

        String batteryStatus = battery >= 18 ? batteryStatusGood : batteryStatusLow;

        System.out.println(batteryStatus);
    }
}
