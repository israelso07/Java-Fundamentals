package javaexercises.practice.operators;

public class Exercise31Bonus {
    public static void main(String[] args) {

        int number = 583;

        int isHundred = number / 10;
        int isDicker = (number / 10) % 10;
        int isUnit = number % 10;

        int isTotalSum = isHundred + isDicker + isUnit;

        System.out.println(isTotalSum);
    }
}
