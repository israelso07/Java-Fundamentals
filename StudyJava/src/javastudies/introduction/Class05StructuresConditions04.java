package javastudies.introduction;

public class Class05StructuresConditions04 {

    // Up to €38,891: 35.75% rate
    // From €38,892 to €76,818: 37.56% rate
    // Above €76,819: 49.50% rate

    public static void main(String[] args) {

        double salary = 20000;

        double taxOne = 35.75;
        double taxTwo = 37.56;
        double taxThree = 49.50;

        if (salary <= 38891) {
            double taxAmountOne = salary * (taxOne / 100);
            System.out.println("You pay 35.75% of tax, value of tax to pay: " + taxAmountOne);
        } else if (salary >= 38892 && salary <= 76.818) {
            double taxAmountTwo = salary * (taxTwo / 100);
            System.out.println("You pay 37,56% of tax, value of tax to pay: " + taxAmountTwo);
        } else {
            double taxAmountThree = salary * (taxThree / 100);
            System.out.println("You pay 49,50% of tax, value of tax to pay: " + taxAmountThree);
        }
    }
}
