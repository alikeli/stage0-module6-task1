package com.epam.mjc.stage0;

public class Bird extends Animal{
//    private String color;
//    private int numberOfPaws;
//    private boolean hasFur;


    public Bird() {
        super("blue",
                2 ,
               false);
    }

    @Override
    public String getDescription() {
        return "This animal is mostly " + color + ". It has " + numberOfPaws + (numberOfPaws > 1 ? " paws" : " paw") + " and " + (hasFur ? "a" : "no") + " fur. Moreover, it has 2 wings and can fly.";
    }


}
