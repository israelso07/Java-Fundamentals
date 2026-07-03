package javaexercises.practice.checkpoints;

public class Checkpoint02Conditions {
    public static void main(String[] args) {

        String employeeName = "Rael";
        byte employeeAge = 18;
        double employeeSalary = 5000;
        byte yearsInCompany = 2;
        boolean activeEmployee = true;
        byte performanceScore = 10;
        double netSalary = 10;


        System.out.println("========================");
        System.out.println("    EMPLOYEE PROMOTION  ");
        System.out.println("========================");

        System.out.println("            ");

        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Age: "+employeeAge);
        System.out.println("Employee Salary: "+employeeSalary);
        System.out.println("Years in Company: "+yearsInCompany);
        System.out.println("Active Employee: "+activeEmployee);
        System.out.println("Performance Score: "+performanceScore);

        System.out.println("            ");

        if (employeeAge >= 18) {
            System.out.println("He is an adult!");
        } else {
            System.out.println("He is a not adult.");
        }

        if (activeEmployee && yearsInCompany >= 2) {
            System.out.println("Have Bonus! More " + employeeSalary * (netSalary / 100)+ " all months!");
        } else {
            System.out.println("No have bonus.");
        }

        if (employeeSalary < 6000 && performanceScore >= 8 && activeEmployee) {
            System.out.println("Can promoted!");
        } else {
            System.out.println("Can't promoted.");
        }

        if (employeeSalary < 3000) {
            System.out.println("Role: Junior!");
        } else if (employeeSalary <= 6000) {
            System.out.println("Role: Pleno!");
        } else {
            System.out.println("Role: Senior!");
        }

        byte shift = 1;

        switch (shift) {
            case 1:
                System.out.println("Shift: Morning!");
                break;
            case 2:
                System.out.println("Shift: Afternoon!");
                break;
            case 3:
                System.out.println("Shift: Night!");
                break;
            default:
                System.out.println("Invalid Shift.");
        }


        // boolean activeEmployee = true;
        String employeeActive = "Employee active!";
        String employeeInactive = "Employee inactive.";

        String employeeStatus = activeEmployee ? employeeActive : employeeInactive;
        System.out.println(employeeStatus);


    }
}
