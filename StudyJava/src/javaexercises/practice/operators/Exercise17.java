package javaexercises.practice.operators;

public class Exercise17 {
    public static void main(String[] args) {

        int salary = 2500;

        int salaryMore = salary += 1000;
        int salaryLess = salary -= 500;
        int salaryMulti = salary *= 2;
        int salaryDivision = salary /= 2;
        int salaryRest = salary %= 2;

        System.out.println(salaryMore);
        System.out.println(salaryLess);
        System.out.println(salaryMulti);
        System.out.println(salaryDivision);
        System.out.println(salaryRest);
    }
}
