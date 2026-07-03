package javaexercises.practice.conditions;

public class Exercise55 {
    public static void main(String[] args) {

        double purchase = 99;

        if (purchase < 100){
            System.out.println("No discount.");
        } else if (purchase >= 100 && purchase <= 301) {
            System.out.println("10% discount.");
        }else {
            System.out.println("20% discount.");
        }
    }
}
