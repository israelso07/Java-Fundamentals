package javaexercises.practice.conditions;

public class Exercise72 {
    public static void main(String[] args) {

        int purchaseAmount = 180;
        String freeDelivery = "Delivery Free";
        String paidDelivery = "Paid Delivery";

        if (purchaseAmount >= 200){
            System.out.println(freeDelivery);
        }else {
            System.out.println(paidDelivery);
        }

    }
}
