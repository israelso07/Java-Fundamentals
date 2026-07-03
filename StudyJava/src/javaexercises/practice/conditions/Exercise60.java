package javaexercises.practice.conditions;

public class Exercise60 {
    public static void main(String[] args) {

        String employee = "Israel";
        double salary = 3800;
        boolean active = true;

        if (active && salary >= 3000){
            System.out.println("\nEmployee Aproved!"+"\nName: " + employee + "\nSalary: " + salary+ "\nActive: "+ active);

        }else {
            System.out.println("Employee not approved");
        }
    }
}
