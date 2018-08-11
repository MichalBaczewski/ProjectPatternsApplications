package com.baczewski.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class TeddyBearTest {

    @Test
    public void shouldReturnExceptionWhenGetEat() {
        // given
        Animal animal = new TeddyBear();
        // when

        // then
        assertThrows(IDontEatException.class, ()-> animal.eat());
    }

}