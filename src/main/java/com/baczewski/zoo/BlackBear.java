package com.baczewski.zoo;

public class BlackBear extends Bear{

    public BlackBear(String name) {
        super(new InjuryAttack(), name);
        this.weight = 50;
    }

    public void display() {
        System.out.println("Jestem niedzwiedziem czarnym i waze " + this.weight);
    }

}
