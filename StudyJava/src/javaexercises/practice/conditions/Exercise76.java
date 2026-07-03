package javaexercises.practice.conditions;

public class Exercise76 {
    public static void main(String[] args) {

        byte plan = 8;

        switch (plan) {
            case 1:
                System.out.println("Plan Basic"); break;
            case 2:
                System.out.println("Plan Standard"); break;
            case 3:
                System.out.println("Plan Premium"); break;
            case 4:
                System.out.println("Plan Family"); break;
            default:
                System.out.println("Invalid Plan, choose other number.");
        }


    }
}
