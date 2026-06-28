package javaexercises.practice.operators;

public class Exercise14 {
    public static void main(String[] args) {

        double price = 349.90;
        double discount = 15;

        double discountValue = price * (discount / 100.0);
        double finalPrice = price - discountValue;

        System.out.println("Discount Value: " + discountValue);
        System.out.println("The Final Price is: " + finalPrice);
    }
}
