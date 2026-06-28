package javaexercises.practice.operators;

public class Exercise03 {
    public static void main(String[] args) {

        int age = 16;

        boolean isAgeBigger18 = age > 18;
        boolean isAgeLess18 = age < 18;
        boolean isAgeEquals18 = age == 18;
        boolean isAgeDifferentFrom18 = age != 18;
        boolean isAgeBiggerOrEquals18 = age >= 18;
        boolean isAgeLessOrEquals18 = age <= 18;

        System.out.println("The number " + age + " is bigger of 18? " + isAgeBigger18);
        System.out.println("The number " + age + " is less of 18? " + isAgeLess18);
        System.out.println("The number " + age + " is Equals of 18? " + isAgeEquals18);
        System.out.println("The number " + age + " is Different of from 18? " + isAgeDifferentFrom18);
        System.out.println("The number " + age + " is BiggerOrEquals of 18? " + isAgeBiggerOrEquals18);
        System.out.println("The number " + age + " is LessOrEquals of 18? " + isAgeLessOrEquals18);
    }
}
