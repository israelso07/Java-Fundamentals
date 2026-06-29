package javaexercises.practice.operators;

public class Exercise47 {
    public static void main(String[] args) {

        int level = 18;
        boolean premium = true;
        boolean eventActive = false;

        boolean canAcessPremium = premium;
        boolean canParticipates = level >= 18 && premium;
        boolean canPremiumOrEvent = premium || eventActive;

        System.out.println(canAcessPremium);
        System.out.println(canParticipates);
        System.out.println(canPremiumOrEvent);
    }
}
