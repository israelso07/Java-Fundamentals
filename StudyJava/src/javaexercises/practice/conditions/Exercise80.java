package javaexercises.practice.conditions;

public class Exercise80 {
    public static void main(String[] args) {

        String employeeName = "Israel";
        byte employeeAge = 18;
        double employeeSalary = 2000;
        byte yearsInCompany = 4;
        boolean employeeStatus = true;
        boolean employeeBonus = false;

        boolean canPromoted = yearsInCompany > 2 && employeeStatus;
        boolean isAdult = employeeAge >= 18;

        System.out.println("========================");
        System.out.println("     EMPLOYEE REPORT    ");
        System.out.println("========================");

        System.out.println("            ");

        System.out.println("Name: " + employeeName);
        System.out.println("Age: " + employeeAge);
        System.out.println("Salary: " + employeeSalary);
        System.out.println("Years in Company: " + yearsInCompany);
        System.out.println("Active: " + employeeStatus);

        System.out.println("            ");

        if (canPromoted) {
            System.out.println("Can promoted: " + canPromoted);
        } else {
            System.out.println("Can't promoted: " + canPromoted);
        }
        if (isAdult) {
            System.out.println("Is adult: " + isAdult);
        } else {
            System.out.println("No adult:" + isAdult);
        }
        if (employeeStatus) {
            System.out.println("Employee Active: " + employeeStatus);
        } else {
            System.out.println("Employee no Active: " + employeeStatus);
        }
        if (employeeBonus) {
            System.out.println("Bonus Active: " + employeeBonus);
        } else {
            System.out.println("No active bonus: " + employeeBonus);
        }

    }
}
