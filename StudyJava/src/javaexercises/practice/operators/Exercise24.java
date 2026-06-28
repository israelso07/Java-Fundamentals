package javaexercises.practice.operators;

public class Exercise24 {
    public static void main(String[] args) {

        boolean correctPassword = true;
        boolean accountBlocked = false;

        boolean isEnter = correctPassword && !accountBlocked;
        boolean isBlocked = accountBlocked && !correctPassword;
        boolean isIncorrect = accountBlocked || correctPassword;

        System.out.println(isEnter);
        System.out.println(isBlocked);
        System.out.println(isIncorrect);
    }
}
