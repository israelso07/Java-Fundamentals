package javaexercises.practice.operators;

public class Exercise07 {
    public static void main(String[] args) {

        int x = 40;
        int y = 25;

        boolean isXBiggerY = x > y;
        boolean isXLessY = x < y;
        boolean isXEqualsY = x == y;
        boolean isXDifferentFromY = x != y;
        boolean isXBiggerOrEqualsY = x >= y;
        boolean isXLessOrEqualsY = x <= y;

        System.out.println("X is Bigger? " + isXBiggerY);
        System.out.println("X is Less? " + isXLessY);
        System.out.println("X is Equals? " + isXEqualsY);
        System.out.println("X is Different from Y? " + isXDifferentFromY);
        System.out.println("X is Bigger or Equals Y? " + isXBiggerOrEqualsY);
        System.out.println("X is Less or Equals Y? " + isXLessOrEqualsY);
    }
}
