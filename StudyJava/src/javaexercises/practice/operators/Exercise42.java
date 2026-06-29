package javaexercises.practice.operators;

public class Exercise42 {
    public static void main(String[] args) {

        int age = 20;

        boolean hasTicket = true;
        boolean accompanied = false;

        boolean ageAdult = age > 18;
        boolean canEnter = age > 18 || accompanied;
        boolean canEnterWithTicket = hasTicket && age > 18 || accompanied;

        System.out.println(ageAdult);
        System.out.println(canEnter);
        System.out.println(canEnterWithTicket);
    }
}
