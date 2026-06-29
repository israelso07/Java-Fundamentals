package javaexercises.practice.operators;

public class Exercise40 {
    public static void main(String[] args) {

        double balance = 4200;

        balance += 900;
        balance -= 650;
        balance += balance * 0.04;
        balance -= 1000;

        boolean isBalanceBigger = balance > 5000;
        boolean isBalanceDifferent = balance != 0;

        System.out.println(balance);
        System.out.println(isBalanceBigger);
        System.out.println(isBalanceDifferent);
    }
}
