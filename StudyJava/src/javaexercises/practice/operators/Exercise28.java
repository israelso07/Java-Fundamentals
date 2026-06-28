package javaexercises.practice.operators;

public class Exercise28 {
    public static void main(String[] args) {

        double productPrice = 2499.90;
        int installments = 10;

        double isValueInstallments = productPrice / installments;

        boolean isInstallmentsBigger = isValueInstallments > 300;
        boolean isLessOrEqual = isValueInstallments <= 250;

        System.out.println("Value of Installments" + isValueInstallments);
        System.out.println("Installments bigger? " + isInstallmentsBigger);
        System.out.println("Installments Less or Equal? "+ isLessOrEqual);
    }
}
