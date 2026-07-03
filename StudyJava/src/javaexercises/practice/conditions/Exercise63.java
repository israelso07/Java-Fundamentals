package javaexercises.practice.conditions;

public class Exercise63 {
    public static void main(String[] args) {

        int purchase = 200;

        if (purchase >= 500){
            System.out.println("Coupon GOLD");
        } else if (purchase >= 250) {
            System.out.println("Coupon SILVER");
        }else {
            System.out.println("Coupon BRONZE");
        }

    }
}
