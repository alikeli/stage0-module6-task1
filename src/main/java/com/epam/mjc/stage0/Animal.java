package com.epam.mjc.stage0;

public class Animal {
    protected String color;
    protected int numberOfPaws;
    protected boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {

            return "This animal is mostly " + color + ". It has " + numberOfPaws + (numberOfPaws > 1 ? " paws" : " paw") + " and " + (hasFur ? "a" : "no") + " fur.";

    }

//   Add a methods getDescription(), witch would use class fields and return a string with such pattern
//   "This animal is mostly (color). It has (numberOfPaws) paws and ('a'/'no' -> depends on value of hasFur) fur."
}
