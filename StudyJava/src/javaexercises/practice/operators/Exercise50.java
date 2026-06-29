package javaexercises.practice.operators;

public class Exercise50 {
    public static void main(String[] args) {

        double monthlySalary = 4500;
        double bonus = 12;
        double tax = 9;
        double expenses = 1850;

        double valueBonus = monthlySalary * (bonus / 100);
        double theSalaryWithBonus = monthlySalary + valueBonus;
        double valueTax = monthlySalary * (tax / 100);
        double theSalaryWithDiscount = theSalaryWithBonus - valueTax;
        double finalSalary = theSalaryWithDiscount - expenses;
        boolean finalSalaryBigger = finalSalary > 3000;
        boolean finalSalaryDifferent = finalSalary != 0;

        System.out.println("Salary: " + monthlySalary);
        System.out.println("Bonus Value: " + valueBonus);
        System.out.println("Salary With Bonus: " + theSalaryWithBonus);
        System.out.println("Value Tax: " + valueTax);
        System.out.println("Salary with Discount: " + theSalaryWithDiscount);
        System.out.println("Salary Final: " + finalSalary);
        System.out.println("Final Salary Bigger " + finalSalaryBigger);
        System.out.println("Final Salary Different " + finalSalaryDifferent);


    }
}
