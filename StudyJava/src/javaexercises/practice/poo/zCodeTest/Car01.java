package javaexercises.practice.poo.zCodeTest;

import javaexercises.practice.poo.domain.Car;

public class Car01 {
    public static void main(String[] args) {

        Car car = new Car();

        car.mark = "Ford";
        car.model = "Turbo";
        car.year = 2007;

        System.out.println(car.mark);
        System.out.println(car.year);
        System.out.println(car.model);

    }
}
