package javaexercises.practice.conditions;

public class Exercise70 {
    public static void main(String[] args) {

        String employeeName = "Israel";
        double salary = 7000;
        byte yearsInCompany = 4;
        boolean active = true;

        if (salary >= 5000 && yearsInCompany > 3 && active) {
            System.out.println("Promotion approved.");
        }else {
            System.out.println("Promotion denied.");
        }
        System.out.println("Name: "+employeeName+"\nSalary: "+ salary+ "\nTime in Company: "+ yearsInCompany+ "\nActive "+ active);
    }
}


