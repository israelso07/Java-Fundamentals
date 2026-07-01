package javaexercises.practice.checkpoints;

/*
 * ==========================================================
 * CHECKPOINT 01 - OPERATORS
 * ==========================================================
 *
 * Module:
 * - Operators
 *
 * Concepts practiced:
 * - Arithmetic operators (+, -, *, /, %)
 * - Relational operators (>, <, >=, <=, ==, !=)
 * - Logical operators (&&, ||, !)
 * - Assignment operators (=, +=, -=, *=, /=, %=)
 *
 * Objective:
 * Simulate a simple bank account by:
 * - Receiving a salary
 * - Saving part of the salary
 * - Paying monthly expenses
 * - Applying account earnings
 * - Displaying a final report
 *
 * Status:
 * ✔ Completed
 *
 * Date:
 * 01/07/2026
 * ==========================================================
 */

public class Checkpoint01Operators {
    public static void main(String[] args) {

        String clientName = "Israel";

        double initialBalance = 3500;

        double balance = 3500;

        double salary = 4200;

        double monthlyExpenses = 1850;

        double savingsPercentage = 15;

        double performancePercentage = 5;

        double savedAmount = 0;

        boolean accountActive = true;

        boolean premiumClient = false;

        balance += salary;
        savedAmount += salary * (savingsPercentage / 100);
        balance -= monthlyExpenses;
        balance += balance * (performancePercentage / 100);

        boolean isRich = balance >= 5000;

        boolean canRequestLoan = accountActive && balance > 3000;

        boolean hasPremiumBenefits = premiumClient || balance >= 10000;


        System.out.println("==============================");
        System.out.println("          BANK REPORT         ");
        System.out.println("==============================");

        System.out.println("Client: " + clientName);
        System.out.println("Initial Balance: " + initialBalance);
        System.out.println("Salary: " + salary);
        System.out.println("Saved Amount: " + savedAmount);
        System.out.println("Monthly Expenses: " + monthlyExpenses);
        System.out.println("Final Balance: " + balance);
        System.out.println("Is Rich? " + isRich);
        System.out.println("Can request loan? " + canRequestLoan);
        System.out.println("Has Premium? " + hasPremiumBenefits);

    }
}
