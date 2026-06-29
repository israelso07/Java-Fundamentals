package javaexercises.practice.operators;

public class Exercise43 {
    public static void main(String[] args) {

        double salary = 3200;

        salary = (salary * 0.15) + salary;
        System.out.println(salary);
        salary = salary / 0.09;
        System.out.println(salary);
    }
}
