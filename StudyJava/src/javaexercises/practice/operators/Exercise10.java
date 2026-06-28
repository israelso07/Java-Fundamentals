package javaexercises.practice.operators;

public class Exercise10 {
    public static void main(String[] args) {

        int number1 = 84;
        int isMultiNumber1 = number1 * 2;
        int isHalfNumber1 = number1 / 2;
        int isRestNumber1 = number1 % 5;
        boolean isBiggerNumber1 = number1 > 100;
        boolean isDifferentNumber1 = number1 != 50;
        boolean isLessOrEqualsNUmber1 = number1 <= 84;

        System.out.println("Multiplication: " + isMultiNumber1);
        System.out.println("Half: " + isHalfNumber1);
        System.out.println("Rest: " + isRestNumber1);
        System.out.println("Bigger: " + isBiggerNumber1);
        System.out.println("Different: " + isDifferentNumber1);
        System.out.println("Less or Equals: " + isLessOrEqualsNUmber1);
    }
}
