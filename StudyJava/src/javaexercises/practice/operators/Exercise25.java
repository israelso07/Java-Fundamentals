package javaexercises.practice.operators;

public class Exercise25 {
    public static void main(String[] args) {

        int a = 45;
        int b = 72;
        int c = 45;

        boolean isEqual = a == c;
        boolean isDifferent = a != b;
        boolean isBigger = b > c;
        boolean isLessOrEqual = a <= c;
        boolean isEqualAndBigger = (a == c) && (b > a);
        boolean isDifferentOrLess = (a != c) || (b < a);

        System.out.println(isEqual);
        System.out.println(isDifferent);
        System.out.println(isBigger);
        System.out.println(isLessOrEqual);
        System.out.println(isEqualAndBigger);
        System.out.println(isDifferentOrLess);
    }
}
