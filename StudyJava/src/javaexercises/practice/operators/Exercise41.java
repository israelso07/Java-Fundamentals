package javaexercises.practice.operators;

public class Exercise41 {
    public static void main(String[] args) {

        int score = 380;

        score += 120;
        score -= 75;
        score += 60;

        boolean isScoreBigger = score > 400;
        boolean isScoreBiggerEquals = score >= 500;

        System.out.println(isScoreBigger);
        System.out.println(isScoreBiggerEquals);
    }
}
