package javaexercises.practice.operators;

public class Exercise20 {
    public static void main(String[] args) {

        double balance = 1500;
        balance += 500;
        balance -= 200;
        balance *= 1.05;

        double fisrtAccountbalance = balance / 2;
        double secondAccountbalance = balance / 2;

        System.out.println("Balance 1: " + fisrtAccountbalance);
        System.out.println("Balance 2: " + secondAccountbalance);

    }
}
