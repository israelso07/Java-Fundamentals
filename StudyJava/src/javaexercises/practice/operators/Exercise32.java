package javaexercises.practice.operators;

public class Exercise32 {
    public static void main(String[] args) {

        double celsius = 28;
        double fahrenheit = (celsius * 9 / 5) + 32;
        boolean isFahrenheitBigger = fahrenheit >= 80;

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Fahrenheit is bigger? " + isFahrenheitBigger);
    }
}
