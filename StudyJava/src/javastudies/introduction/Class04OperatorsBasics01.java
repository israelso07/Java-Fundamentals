package javastudies.introduction;

public class Class04OperatorsBasics01 {
    public static void main(String[] args) {

        // Operators Basics 01: + - / * %

        int number01 = 10;
        int number02 = 20;
        int resultSumNumber01andNumber02 = number01 + number02;

        int number03 = 2;
        int number04 = 10;
        int resultDivisionNumber03andNumber04 = number04 / number03;

        int number05 = 20;
        int number06 = 5;
        int resultMultiplicationNumber05andNumber06 = number05 / number06;

        double number08 = 37 % 5;
        double resultRestNumber08 = number08;

        System.out.println(number02 + number01);
        System.out.println(number02 - number01);
        System.out.println("The result of sum number01 and number02 is: " + resultSumNumber01andNumber02);

        System.out.println("The result of division number04 and number03 is: " + resultDivisionNumber03andNumber04);

        System.out.println("The result of multiplication number05 and number06 is: " + resultMultiplicationNumber05andNumber06);

        System.out.println("The result of rest number08 is: " + resultRestNumber08);


    }
}
