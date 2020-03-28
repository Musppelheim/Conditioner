package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class conditionerTest {
    @Test
    public void shouldCreate() {
        Conditioner conditioner = new Conditioner();
    }

    @Test
    public void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldSetterLogic() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());
    }
}