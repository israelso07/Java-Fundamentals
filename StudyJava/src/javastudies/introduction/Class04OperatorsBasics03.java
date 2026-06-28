package javastudies.introduction;

public class Class04OperatorsBasics03 {
    public static void main(String[] args) {

        // Operators Basics 03

        // && (AND)

        int age = 18;
        float salary = 2500F;

        boolean isHabilitation = age >= 18 && salary >= 2000;
        boolean isWithinTheLawBigger = age >= 30 && salary >= 4612;
        boolean isOutlawSmall = age < 30 && salary >= 3381;

        System.out.println("I can take habilitation? " + isHabilitation);
        System.out.println("isWithinTheLawBigger " + isWithinTheLawBigger);
        System.out.println("isOutlawSmall " + isOutlawSmall);

        // || (OR)

        float valuePlaystation = 5000F;
        double valueTotalAccCurrent = 200;
        double valueTotalAccSavings = 10000;

        boolean PlaystationFiveBuy = valueTotalAccCurrent >= valuePlaystation || valueTotalAccSavings >= valuePlaystation;

        System.out.println("I can buy Playstation? " + PlaystationFiveBuy);

        // == += -= *= /= %=

        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3200
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        System.out.println(contador);

    }
}
