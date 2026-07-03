package javaexercises.practice.conditions;

public class Exercise64 {
    public static void main(String[] args) {

        double temperature = 13;

        if (temperature < 15) {
            System.out.println("Cold");
        } else if (temperature >= 15 && temperature <= 29) {
            System.out.println("Pleasant");
        }else {
            System.out.println("Hot");
        }
    }
}
