package javastudies.introduction;

public class Class04OperatorsBasics02 {
    public static void main(String[] args) {

        // Operators Basics 02: < > == <= >= !=

        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualsTwenty = 10 == 20;
        boolean isTenIsEqualsOrLessTwenty = 10 <= 20;
        boolean isTenIsEqualsOrGreaterTwenty = 10 >= 20;
        boolean isTenIsDifferentOrEqualsTwenty = 10 != 20;

        System.out.println("isTenGreaterThanTwenty? " + isTenGreaterThanTwenty);
        System.out.println("isTenLessThanTwenty? " + isTenLessThanTwenty);
        System.out.println("isTenEqualsTwenty? " + isTenEqualsTwenty);
        System.out.println("isTenIsEqualsOrLessTwenty? " + isTenIsEqualsOrLessTwenty);
        System.out.println("isTenIsEqualsOrGreaterTwenty? " + isTenIsEqualsOrGreaterTwenty);
        System.out.println("isTenIsDifferentOrEqualsTwenty? " + isTenIsDifferentOrEqualsTwenty);
    }
}
