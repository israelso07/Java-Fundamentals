package javaexercises.practice.conditions;

public class Exercise69 {
    public static void main(String[] args) {

        int age = 20;
        boolean hasInvitation = true;

        if (age >= 18 && hasInvitation) {
            System.out.println("Entry allowed.");
        }else {
            System.out.println("Entry denied.");
        }

    }
}
