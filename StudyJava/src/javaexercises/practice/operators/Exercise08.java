package javaexercises.practice.operators;

public class Exercise08 {
    public static void main(String[] args) {

        double price = 250;
        double discount = 20;
        double priceWithDiscount = price * (discount / 100);
        double finalPrice = price - priceWithDiscount;

        System.out.println("The price with discount is: " + finalPrice);
    }
}
