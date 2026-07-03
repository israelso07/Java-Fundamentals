package javaexercises.practice.conditions;

public class Exercise59 {
    public static void main(String[] args) {

        double salary = 4200;
        String categoryHigh = "High Salary";
        String categoryNormal = "Normal Salary";

        String result = salary >= 5000 ? categoryHigh : categoryNormal;

        System.out.println(result);


    }
}
