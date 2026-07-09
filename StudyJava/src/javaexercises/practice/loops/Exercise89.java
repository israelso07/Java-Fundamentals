package javaexercises.practice.loops;

public class Exercise89 {
    public static void main(String[] args) {

        int numberMult = 0;

        for (int i = 0; i <= 100 ; i += 5) {
            numberMult += i;

        }
        System.out.println(numberMult);
    }
}
