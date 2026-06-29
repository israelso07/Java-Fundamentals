package javaexercises.practice.operators;

public class Exercise35 {
    public static void main(String[] args) {

        double distance = 180;
        double time = 2.5;

        double averageSpeed = distance / time;
        boolean speedBigger = averageSpeed > 80;

        System.out.println("Media Speed: "+ averageSpeed);
        System.out.println("Speed Bigger: "+ speedBigger);
    }
}
