package javaexercises.practice.conditions;

public class Exercise73 {
    public static void main(String[] args) {

        byte yearsInCompany = 3;
        boolean employeeActive = true;

        if (employeeActive && yearsInCompany >= 2) {
            System.out.println("Win a Bonus");
        }else {
            System.out.println("No bonus");
        }

    }
}
