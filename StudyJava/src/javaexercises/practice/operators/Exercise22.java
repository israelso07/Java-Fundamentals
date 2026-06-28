package javaexercises.practice.operators;

public class Exercise22 {
    public static void main(String[] args) {

        int totalSeconds = 3672;

        int hours = totalSeconds / 1000;
        int minutes = (totalSeconds / 100) % 100;
        int seconds = totalSeconds % 1000;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
