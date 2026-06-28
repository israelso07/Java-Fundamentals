package javaexercises.practice.operators;

public class Exercise21 {
    public static void main(String[] args) {

        double distance = 487.5;
        double fuel = 38.2;
        double averageConsumption = distance / fuel;
        boolean isConsumptionBiggerThan = averageConsumption >= 12;

        System.out.println("Consumption: " + averageConsumption);
        System.out.println("The average consumption is bigger than 12km/L? " + isConsumptionBiggerThan);

    }
}
