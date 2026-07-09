package javastudies.introduction;

public class Class06StructuresRepetition01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }
        do {
            System.out.println("do-while");
        } while (count < 10);

        for (int i=0; i < 10; i++) {
            System.out.println("For "+i);

        }
    }
}
