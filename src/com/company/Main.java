package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Dog");
        System.out.println("_______");
        createObject("Cat");
        System.out.println("_______");
        createObject("Horse");
    }

    public static void createObject(String className) {
        switch (className) {
            case "Dog":
                Dog dog = new Dog("Rex", "Pitbull");
                dog.print();
                break;
            case "Cat":
                Cat cat = new Cat("Murka", 5);
                cat.print();
                break;
            case "Horse":
                Horse horse = new Horse("Igor", 2);
                horse.print();
                break;
            default:
                System.out.println("Not found");
        }
    }

}
