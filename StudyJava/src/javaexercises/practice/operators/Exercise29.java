package javaexercises.practice.operators;

public class Exercise29 {
    public static void main(String[] args) {

        int age = 22;

        boolean hasCNH = true;
        boolean ownsCar = false;

        boolean isAdultAge = age >= 18;
        boolean isToDrive = age >= 18 && hasCNH;
        boolean isHaveCar = ownsCar;
        boolean isDriveAndCar = hasCNH && ownsCar;
        boolean isDriveOrCar = hasCNH || ownsCar;

        System.out.println("Adult? " + isAdultAge);
        System.out.println("Can drive? " + isToDrive);
        System.out.println("Have car? " + isHaveCar);
        System.out.println("Have car and CNH? " + isDriveAndCar);
        System.out.println("Have car or CNH? " + isDriveOrCar);

    }
}
