package javaexercises.practice.conditions;

public class Exercise54 {
    public static void main(String[] args) {

        boolean correctPassword = false;
        boolean accountBlocked = true;

        if (correctPassword && !accountBlocked){
            System.out.println("Login successful.");
        }else{
            System.out.println("Login failed.");
        }
    }
}
