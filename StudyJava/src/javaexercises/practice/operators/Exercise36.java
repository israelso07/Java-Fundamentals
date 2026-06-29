package javaexercises.practice.operators;

public class Exercise36 {
    public static void main(String[] args) {

        double weight = 82;
        double height = 1.78;

        double imc = weight / (height * height);

        boolean imcBigger = imc >= 25;
        boolean imcLess = imc < 18.5;

        System.out.println(imcBigger);
        System.out.println(imcLess);

    }
}
