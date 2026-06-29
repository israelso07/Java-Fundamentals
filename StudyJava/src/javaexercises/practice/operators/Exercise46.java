package javaexercises.practice.operators;

public class Exercise46 {
    public static void main(String[] args) {

        double note1 = 8.5;
        double note2 = 6.5;
        double note3 = 9;
        double note4 = 7;

        double mediaNotes = (note1 + note2 + note3 + note4) / 4;
        boolean noteBiggerSeven = mediaNotes >= 7;
        boolean noteBiggerNine = mediaNotes >= 9;

        System.out.println(mediaNotes);
        System.out.println(noteBiggerSeven);
        System.out.println(noteBiggerNine);
    }
}
