package com.baczewski.zoo;

public class PolarBear extends Bear{

    public PolarBear(String name) {
        super(new KillAttack(), name);
        this.weight = 200;
    }

    public void display() {
        System.out.println("Jestem niedzwiedziem polarnym i waze " + this.weight);
    }

}
