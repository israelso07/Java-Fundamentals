package javaexercises.practice.conditions;

public class Exercise79 {
    public static void main(String[] args) {

        byte ageClient = 19;
        boolean accompaniedAdult = false;

        if (ageClient >= 18 || accompaniedAdult) {
            System.out.println("Access permitted.");
        }else {
            System.out.println("Access denied.");
        }

    }
}
