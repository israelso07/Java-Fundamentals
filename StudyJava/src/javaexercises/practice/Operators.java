package javaexercises.practice;

public class Operators {
    public static void main(String[] args) {

        System.out.println("----------------");
        System.out.println("Exercise01.java");
        System.out.println("----------------");

        int number01 = 25;
        int number02 = 17;
        int resultSum = number01 + number02;

        System.out.println("The result of sum is: "+ resultSum);

        System.out.println("----------------");
        System.out.println("Exercise02.java");
        System.out.println("----------------");
        int a = 30;
        int b = 7;

        int resultSum02 = a + b;
        int resultSubtraction = a - b;
        int resultMultiplication = a * b;
        int resultDivision = a / b;
        int resultRest = a % b;

        System.out.println("The result of sum is: "+ resultSum02);
        System.out.println("The result of subtraction is: "+ resultSubtraction);
        System.out.println("The result of multiplication is: "+ resultMultiplication);
        System.out.println("The result of division is: "+ resultDivision);
        System.out.println("The result of rest is: "+ resultRest);

        System.out.println("----------------");
        System.out.println("Exercise03.java");
        System.out.println("----------------");

        int age = 16;

        boolean isAgeBigger18 = age > 18;
        boolean isAgeLess18 = age < 18;
        boolean isAgeEquals18 = age == 18;
        boolean isAgeDifferentFrom18 = age != 18;
        boolean isAgeBiggerOrEquals18 = age >= 18;
        boolean isAgeLessOrEquals18 = age <= 18;

        System.out.println("The number "+age+" is bigger of 18? "+ isAgeBigger18);
        System.out.println("The number "+age+" is less of 18? "+ isAgeLess18);
        System.out.println("The number "+age+" is Equals of 18? "+ isAgeEquals18);
        System.out.println("The number "+age+" is Different of from 18? "+ isAgeDifferentFrom18);
        System.out.println("The number "+age+" is BiggerOrEquals of 18? "+ isAgeBiggerOrEquals18);
        System.out.println("The number "+age+" is LessOrEquals of 18? "+ isAgeLessOrEquals18);

        System.out.println("----------------");
        System.out.println("Exercise04.java");
        System.out.println("----------------");

        int width = 12;
        int height = 8;

        System.out.println("Area: " + width * height);
        System.out.println("Perimeter: " + 2 * (width + height));

        System.out.println("----------------");
        System.out.println("Exercise05.java");
        System.out.println("----------------");

        double note01 = 8.5;
        double note02 = 7.0;
        double note03 = 9.5;
        double resultAverageOfNotes = (note01 + note02 + note03) / 3;

        System.out.println("The average of Notes is: "+resultAverageOfNotes);

        System.out.println("----------------");
        System.out.println("Exercise06.java");
        System.out.println("----------------");

        int number = 57;
        int isResultNumberDivision = number / 10;
        int isResultNumberRest = number % 10;

        System.out.println("The result of NumberDivision is: "+isResultNumberDivision);
        System.out.println("The result of NumberRest is: "+isResultNumberRest);

        System.out.println("----------------");
        System.out.println("Exercise07.java");
        System.out.println("----------------");

        int x = 40;
        int y = 25;

        boolean isXBiggerY = x > y;
        boolean isXLessY = x < y;
        boolean isXEqualsY = x == y;
        boolean isXDifferentFromY = x != y;
        boolean isXBiggerOrEqualsY = x >= y;
        boolean isXLessOrEsqualsY = x <= y;

        System.out.println("X is Bigger? "+ isXBiggerY);
        System.out.println("X is Less? "+ isXLessY);
        System.out.println("X is Equals? "+ isXEqualsY);
        System.out.println("X is Different from Y? "+ isXDifferentFromY);
        System.out.println("X is Bigger or Equals Y? "+ isXBiggerOrEqualsY);
        System.out.println("X is Less or Equals Y? "+ isXLessOrEsqualsY);

        System.out.println("----------------");
        System.out.println("Exercise08.java");
        System.out.println("----------------");

        double price = 250;
        double discount = 20;
        double priceWithDiscount = price * (discount / 100) ;
        double finalPrice = price - priceWithDiscount;

        System.out.println("The price with discount is: "+finalPrice);

        System.out.println("----------------");
        System.out.println("Exercise09.java");
        System.out.println("----------------");

        String name = "Israel";
        int age1 = 20;
        double height1 = 1.75;
        boolean legalAge = age1 > 18;

        System.out.println("Name: "+name);
        System.out.println("Age: "+age1);
        System.out.println("Height: "+height1);
        System.out.println("Legal age? "+legalAge);

        System.out.println("----------------");
        System.out.println("Exercise10.java");
        System.out.println("----------------");

        int number1 = 84;
        int isMultiNumber1 = number1 * 2;
        int isHalfNumber1 = number1 / 2;
        int isRestNumber1 = number1 % 5;
        boolean isBiggerNumber1 = number1 > 100;
        boolean isDifferentNumber1 = number1 != 50;
        boolean isLessOrEqualsNUmber1 = number1 <= 84;

        System.out.println("Multiplication: "+isMultiNumber1);
        System.out.println("Half: "+isHalfNumber1);
        System.out.println("Rest: "+isRestNumber1);
        System.out.println("Bigger: "+isBiggerNumber1);
        System.out.println("Different: "+isDifferentNumber1);
        System.out.println("Less or Equals: "+isLessOrEqualsNUmber1);

    }
}
