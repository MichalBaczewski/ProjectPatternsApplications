package com.baczewski.zoo;

public abstract class Bear extends Animal implements Attackable{

    AttackStrategy attackStrategy;
    private String name;
    private PlayGround playGround;
    private Boolean isAlive;

    public Bear(AttackStrategy attackStrategy, String name) {
        this.attackStrategy = attackStrategy;
        this.name = name;
        this.isAlive = true;
    }

    @Override
    public void attack(Animal animal) {
        attackStrategy.attack(this, animal);
    }

    @Override
    public boolean isAlive() {

        if (isAlive && super.isAlive()) {
            return true;
        }
        return false;

    }

    public void attackByName(String name) {
        playGround.attack(this, name);
    }

    public String getName() {
        return name;
    }

    public void setPlayGround(PlayGround playGround) {
        this.playGround = playGround;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }
}
