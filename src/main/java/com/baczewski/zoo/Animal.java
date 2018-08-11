package com.baczewski.zoo;

import java.time.LocalDateTime;

public abstract class Animal {

    protected int weight;
    protected LocalDateTime lastEatTime;


    public Animal() {
        lastEatTime = LocalDateTime.now();
    }

    public boolean isAlive(){
        LocalDateTime tenDaysBeforeNow = LocalDateTime.now().minusDays(10);
        return getLastEatTime().isAfter(tenDaysBeforeNow);
    }

    public void eat() {
        lastEatTime = LocalDateTime.now();
    }

    public int getWeight() {
        return weight;
    }

    public LocalDateTime getLastEatTime() {
        return lastEatTime;
    }

}
