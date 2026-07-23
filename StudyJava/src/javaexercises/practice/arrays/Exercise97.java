package javaexercises.practice.arrays;

public class Exercise97 {
    public static void main(String[] args) {

        String[] names = new String[5];

        names[0] = "Ana";
        names[1] = "Carlos";
        names[2] = "João";
        names[3] = "Maria";
        names[4] = "Pedro";

        for (String nameFound : names ) {
            if (nameFound == "Maria") {
                System.out.println("Maria Found!");
            }
        }


    }
}
