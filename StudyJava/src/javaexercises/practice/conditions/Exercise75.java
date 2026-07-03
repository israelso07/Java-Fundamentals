package javaexercises.practice.conditions;

public class Exercise75 {
    public static void main(String[] args) {

        byte examResultEnglish = 9;
        byte examResultPortuguese = 9;

        double examResult = (examResultEnglish + examResultPortuguese) / 2;

        if (examResult >= 7){
            System.out.println("Approved");
        } else if (examResult > 5 && examResult <= 6.9) {
            System.out.println("Recovery");
        }else {
            System.out.println("Failed");
        }


    }
}
