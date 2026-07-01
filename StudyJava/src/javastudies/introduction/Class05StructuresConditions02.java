package javastudies.introduction;

public class Class05StructuresConditions02 {
    public static void main(String[] args) {
        /*
        age < 15 = category kids
        age >= 15 && age < 18 category juvenile
        age >= 18 category adult
         */

        int age = 20;
        String category;

        boolean categoryKids = age < 15;
        boolean categoryJuvenile = age >= 15 && age < 18;
        boolean categoryAdult = age >= 18;

        if (categoryKids){
            category = "You're in Category Kids!";

        } else if (categoryJuvenile) {
            category= "You're in Category Juvenile!";

        }else {
            category = "You're in Category Adult!";
        }
        System.out.println(category);
    }
}
