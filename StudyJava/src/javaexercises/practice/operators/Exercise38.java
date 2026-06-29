package javaexercises.practice.operators;

public class Exercise38 {
    public static void main(String[] args) {

        int previousReading = 15430;
        int currentReading = 15785;

        int consumption = (currentReading - previousReading);

        boolean theConsumption = consumption > 300;

        System.out.println(theConsumption);
    }
}
