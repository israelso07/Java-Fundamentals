package javaexercises.practice.operators;

public class Exercise37 {
    public static void main(String[] args) {

        double productPrice = 480;
        double discount = 12;

        double valueDiscount = (productPrice / 100) % discount;
        double finalPrice = productPrice - valueDiscount;
        boolean finalPriceBigger = finalPrice > 400;

        System.out.println(finalPriceBigger);
    }
}
