package javaexercises.practice.conditions;

public class Exercise71 {
    public static void main(String[] args) {

        byte age = 16;
        boolean authorizationConfirmed = true;

        if (age >= 16 || authorizationConfirmed) {
            System.out.println("Enrollment approved!");
        }else {
            System.out.println("Enrollment disapproved!");
        }
    }
}
