package javaexercises.practice.arrays;

public class Exercise96 {
    public static void main(String[] args) {

        int[] notes = new int[5];

        notes[0] = 8;
        notes[1] = 7;
        notes[2] = 10;
        notes[3] = 9;
        notes[4] = 6;

        int sum = notes[0] + notes[1] + notes[2] + notes[3] + notes[4] ;
        int media = sum / 5;

        System.out.println(sum);
        System.out.println(media);


    }
}
