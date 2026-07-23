package javaexercises.practice.arrays;

public class Exercise98 {
    public static void main(String[] args) {

        int[] number = new int[5];
        int bigger = number[0];

        number[0] = 5;
        number[1] = 17;
        number[2] = 2;
        number[3] = 30;
        number[4] = 9;

        for (int i = 1; i < number.length; i++) {
            if (number[i] > bigger) {
                bigger = number[i];

            }
        }
        System.out.println(bigger);
    }
}
