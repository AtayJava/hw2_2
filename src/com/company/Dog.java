package com.company;

public class Dog extends Animal{
    private String breedDog;

    public Dog(String name,String breedDog) {
        super.setName(name);
        this.breedDog = breedDog;
    }

    public String getBreedDog() {
        return breedDog;
    }

    @Override
    public void print() {
        System.out.println("DOg : " +
                "\nName = " + getName()+
                "\nBreed = " + breedDog);

    }
}
