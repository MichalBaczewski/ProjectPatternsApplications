package com.baczewski.zoo;

public class ZooApplication {

    public static void main(String[] args) {
        Bear polarBear = new PolarBear("WscieklyKiel");
        Bear brownBear = new BrownBear("StalowyMarek");
//        polarBear.attack(brownBear);
        PlayGround playGround = new PlayGround();
        playGround.register(polarBear);
        playGround.register(brownBear);
        polarBear.attackByName("StalowyMare");
    }

}
