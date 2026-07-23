package javaexercises.practice.poo.zCodeTest;

import javaexercises.practice.poo.domain.Person;

public class Person01 {
    public static void main(String[] args) {

        Person person = new Person();


        person.name = "Nick";
        person.age = 17;
        person.height = 1.68;

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.height);

    }
}
