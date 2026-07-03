package javaexercises.practice.conditions;

public class Exercise61 {
    public static void main(String[] args) {

        int age = 14;

        if (age < 10){
            System.out.println("Category Kids");
        } else if (age >= 10 && age <= 15) {
            System.out.println("Category Teen");
        }else {
            System.out.println("Category Adult");
        }
    }
}
