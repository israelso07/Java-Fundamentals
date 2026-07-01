package javastudies.introduction;

public class Class05StructuresConditions {
    public static void main(String[] args) {

        int age = 19;
        boolean isAuthorizedBuyBeer = age >= 21;

        if (isAuthorizedBuyBeer) {
            System.out.println("Can buy beer alcholic");
        }else{
            System.out.println("Can't buy beer alcholic");
        }
    }
}
