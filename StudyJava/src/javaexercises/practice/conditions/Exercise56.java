package javaexercises.practice.conditions;

public class Exercise56 {
    public static void main(String[] args) {

        String color = "Yellow";

        switch (color){
            case "Red":
                System.out.println("Stop"); break;
            case "Yellow":
                System.out.println("Attention"); break;
            case "Green":
                System.out.println("Go"); break;
            default:
                System.out.println("Invalid color");
        }
    }
}
