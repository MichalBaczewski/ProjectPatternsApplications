package com.baczewski.zoo;

import java.util.HashMap;
import java.util.Map;

public class PlayGround {

    private Map<String, Bear> participants = new HashMap<>();
    public void register(Bear bear) {
        bear.setPlayGround(this);
        participants.put(bear.getName(), bear);
    }
    public void attack(Bear attacker, String defender) {
        try {
            Bear bear = participants.get(defender);
            attacker.attack(bear);
        } catch (NullPointerException e) {
            System.out.println("Podaj poprawna nazwe niedzwiedzia");
        }

    }

}
