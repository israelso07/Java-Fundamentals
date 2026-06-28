package javaexercises.practice.operators;

public class Exercise30 {
    public static void main(String[] args) {

        double balance = 2500;
        double balance1;
        balance += 800;
        balance -= 350;
        balance1 = balance + (6 * 100);
        balance1 += 1200;
        balance1 -= 500;

        double acc1 = balance1 / 2;
        double acc2 = balance1 / 2;

        boolean isBalanceBigger = balance1 > 3000;
        boolean isDifferent = balance1 != 0;


        System.out.println(balance1);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(isBalanceBigger);
        System.out.println(isDifferent);
    }
}
