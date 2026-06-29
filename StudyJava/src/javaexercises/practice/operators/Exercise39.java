package javaexercises.practice.operators;

public class Exercise39 {
    public static void main(String[] args) {

        double fuel = 42;
        double consumption = 13.5;

        double maxDistance = fuel * consumption;
        boolean distance = maxDistance > 500;

        System.out.println(maxDistance);
        System.out.println(distance);
    }
}
