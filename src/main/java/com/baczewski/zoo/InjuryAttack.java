package com.baczewski.zoo;

public class InjuryAttack implements AttackStrategy {

    @Override
    public void attack(Animal attacker, Animal defender) {
        System.out.println(attacker.getClass().getSimpleName() + " - raniłem " + defender.getClass().getSimpleName());

    }

}
