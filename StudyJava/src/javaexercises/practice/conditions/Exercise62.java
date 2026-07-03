package javaexercises.practice.conditions;

public class Exercise62 {
    public static void main(String[] args) {

        int passwordLength = 11;

        if (passwordLength < 6){
            System.out.println("Weak");
        } else if (passwordLength >= 6 && passwordLength <= 10) {
            System.out.println("Medium");
        }else {
            System.out.println("Strong");
        }

    }
}
