package javaexercises.practice.arrays;

public class Exercise99 {
    public static void main(String[] args) {

        int[] number = new int[5];

        number[0] = 5;
        number[1] = 17;
        number[2] = 2;
        number[3] = 30;
        number[4] = 9;

        int menor = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] < menor) {
                menor = number[i]; // Atualiza o menor número
            }
        }

        System.out.println("O menor número é: " + menor);
    }
}
