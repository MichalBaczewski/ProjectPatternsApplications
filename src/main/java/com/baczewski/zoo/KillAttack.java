package com.baczewski.zoo;

public class KillAttack implements AttackStrategy {

    @Override
    public void attack(Animal attacker, Animal defender) {
        System.out.println(attacker.getClass().getSimpleName() + " - zabilem " + defender.getClass().getSimpleName());
    }
}
