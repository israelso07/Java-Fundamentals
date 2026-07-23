package javastudies.introduction;

public class Class08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        int[][] days = new int[3][3];

        days [0][0] = 31;
        days [0][1] = 28;
        days [0][2] = 31;

        days [1][0] = 14;
        days [1][1] = 31;
        days [1][2] = 12;

        days [2][0] = 23;
        days [2][1] = 12;
        days [2][2] = 24;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {

                System.out.println(days[i][j]);
            }

        }

        System.out.println(days[0][0]);


    }
}
