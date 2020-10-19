package com.company;

public class Cat extends Animal{
    private int kittens;

    public Cat(String name, int kittens) {
        super.setName(name);
        this.kittens = kittens;
    }

    public int getKittens() {
        return kittens;
    }

    @Override
    public void print() {
        System.out.println("Cat : " +
                "\nName = " +getName()+
                "\nKittens = "+kittens + " kittens");
    }
}
