package javaexercises.practice.operators;

public class Exercise15 {
    public static void main(String[] args) {

        double grade1 = 7.5;
        double grade2 = 8.0;
        double grade3 = 9.0;

        double averageGrades = (grade1 + grade2 + grade3) / 3;

        boolean average1 = averageGrades >= 7;
        boolean average2 = averageGrades >= 9;

        System.out.println("Average Ages: " + averageGrades);
        System.out.println("The average is bigger of 7? " + average1);
        System.out.println("The average is bigger of 9? " + average2);
    }
}
