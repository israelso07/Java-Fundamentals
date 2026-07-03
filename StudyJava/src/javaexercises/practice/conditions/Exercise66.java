package javaexercises.practice.conditions;

public class Exercise66 {
    public static void main(String[] args) {

        int plan = 2;

        switch (plan) {
            case 1:
                System.out.println("Basic Plan"); break;
            case 2:
                System.out.println("Standard Plan"); break;
            case 3:
                System.out.println("Premium Plan"); break;
            default:
                System.out.println("Invalid Plan");
        }
    }
}
