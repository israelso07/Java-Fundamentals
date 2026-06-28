package javaexercises.practice.operators;

public class Exercise26 {
    public static void main(String[] args) {

        double salary = 4200;
        double isValueIncrease = 8 * 100;
        double isIncreaseSalary = salary + isValueIncrease;
        double isValueTax = 12 * 100;
        double isDiscountSalary = salary - isValueTax;

        System.out.println(salary);
        System.out.println(isValueIncrease);
        System.out.println(isIncreaseSalary);
        System.out.println(isValueTax);
        System.out.println(isDiscountSalary);
    }
}
