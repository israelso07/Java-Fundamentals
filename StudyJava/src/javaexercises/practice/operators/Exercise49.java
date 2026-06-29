package javaexercises.practice.operators;

public class Exercise49 {
    public static void main(String[] args) {

        double balance = 5300;

        balance -= 750;
        balance += 1500;
        balance = (balance * 0.03) + balance;

        boolean isBalanceBigger = balance > 6000;
        boolean isBalanceBiggerEquals = balance >= 5000;

        System.out.println(balance);
        System.out.println(isBalanceBigger);
        System.out.println(isBalanceBiggerEquals);
    }
}
