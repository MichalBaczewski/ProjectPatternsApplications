package com.baczewski.zoo;

public class BrownBear extends Bear{


    public BrownBear(String name) {
        super(new InjuryAttack(), name);
        this.weight = 100;
    }

    public void display() {
        System.out.println("Jestem niedzwiedziem brazowym i waze " + this.weight);
    }

}
