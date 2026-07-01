package javastudies.introduction;

public class Class05StructuresConditions05 {
    public static void main(String[] args) {
        // impress the day of week, consider 1 for Sunday

        byte day = 7;
        // char, int, byte, short, enum, String
        switch (day){
            case 1:
                System.out.println("Sunday"); break;
            case 2:
                System.out.println("Monday"); break;
            case 3:
                System.out.println("Tuesday"); break;
            case 4:
                System.out.println("Wednesday"); break;
            case 5:
                System.out.println("Thursday"); break;
            case 6:
                System.out.println("Friday"); break;
            case 7:
                System.out.println("Saturday"); break;
            default:
                System.out.println("Option Invalid");

        }
    }
}
