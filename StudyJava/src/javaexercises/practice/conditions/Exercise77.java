package javaexercises.practice.conditions;

public class Exercise77 {
    public static void main(String[] args) {

        byte discount = 2;

        switch (discount) {
            case 1:
                System.out.println("Monday, 5% discount!"); break;
            case 2:
                System.out.println("Tuesday, 10% discount!"); break;
            case 3:
                System.out.println("Wednesday, 15% discount!"); break;
            case 4:
                System.out.println("Thursday, 20% discount!"); break;
            case 5:
                System.out.println("Friday, 25% discount!"); break;
            default:
                System.out.println("Invalid number.");
        }

    }
}
