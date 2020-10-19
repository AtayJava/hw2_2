package com.company;

public class Horse extends Animal {
    private int heightHorse;

    public Horse(String name, int heightHorse) {
        super.setName(name);
        this.heightHorse = heightHorse;
    }

    public int getHeightHorse() {
        return heightHorse;
    }

    @Override
    public void print() {
        System.out.println("Horse : "+
                "\nName = "+getName()+
                "\nHeight horse = "+heightHorse + " m");
    }
}
