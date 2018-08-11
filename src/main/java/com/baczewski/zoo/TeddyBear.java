package com.baczewski.zoo;

public class TeddyBear extends Animal {

    @Override
    public void eat() throws IDontEatException{
        throw new IDontEatException("Jestem miesiem. Nie jadam!");
    }
}
