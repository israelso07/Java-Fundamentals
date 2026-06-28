package javaexercises.practice.operators;

public class Exercise16 {
    public static void main(String[] args) {

        int number = 123;

        int centena = number / 100;
        int dezena = (number / 10) % 10;
        int unidade = number % 10;

        System.out.println(centena);
        System.out.println(dezena);
        System.out.println(unidade);

    }
}
