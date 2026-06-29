package javaexercises.practice.operators;

public class Exercise33 {
    public static void main(String[] args) {

        double width = 8.5;
        double height = 5.2;

        double totalArea = width * height;
        double totalPerimeter = 2 * (width + height);

        boolean areaBigger = totalArea > 40;
        boolean perimeterBigger = totalPerimeter >= 25;

        System.out.println("Area " + areaBigger);
        System.out.println("Perimeter " + perimeterBigger);

    }
}
