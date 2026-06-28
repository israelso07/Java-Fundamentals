package javaexercises.practice.operators;

public class Exercise13 {
    public static void main(String[] args) {

        int age = 19;
        boolean hasDocument = true;

        boolean ageAdult = age >= 18;
        boolean ageAdult1 = age >= 18 && hasDocument;
        boolean ageMinor = age < 18 || hasDocument;
        boolean ageDifferent = !(age >= 18);


        System.out.println(hasDocument);
        System.out.println("Age Adult? " + ageAdult);
        System.out.println("Age Adult and Document? " + ageAdult1);
        System.out.println("Age Minor ou Document True? " + ageMinor);
        System.out.println("Age Different? " + ageDifferent);
    }
}
