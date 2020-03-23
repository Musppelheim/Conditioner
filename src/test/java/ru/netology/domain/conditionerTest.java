package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class conditionerTest {
    @Test
    public void shouldCreate() {
        conditioner conditioner = new conditioner();
    }

    @Test
    public void shouldIncreaseCurrentTemperature() {
        conditioner conditioner = new conditioner();
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        conditioner conditioner = new conditioner();
        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldSetterLogic() {
        conditioner conditioner = new conditioner();
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());
    }
}