package javaexercises.practice.operators;

public class Exercise48 {
    public static void main(String[] args) {

        double total = 1850;
        int installments = 8;

        double valueInstallments = total / installments;
        boolean theInstallments = valueInstallments > 250;

        System.out.println(valueInstallments);
        System.out.println(theInstallments);
    }
}
