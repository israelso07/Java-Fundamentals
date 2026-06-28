package javaexercises.practice.operators;

public class Exercise19 {
    public static void main(String[] args) {

        int x = 15;
        int y = 20;
        int z = 15;

        boolean isXBiggerY = x >= y;
        boolean isXLessZ = x <= z;
        boolean isXEqualsZ = x == z;
        boolean isXDifferentY = x != y;
        boolean isXBiggerY01 = x > y;
        boolean isXLessZ01 = x < z;

        boolean isYBiggerX = y >= x;
        boolean isYLessZ = y <= z;
        boolean isYEqualsZ = y == z;
        boolean isYDifferentX = y != z;
        boolean isYBiggerX01 = y > x;
        boolean isYLessX01 = y < x;

        boolean isZBiggerX = z >= x;
        boolean isZLessY = z <= y;
        boolean isZEqualsX = z == x;
        boolean isZDifferentY = z != y;
        boolean isZBiggerY01 = z > y;
        boolean isZLessY01 = z < y;
    }
}
