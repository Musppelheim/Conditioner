package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldTurnUpVolume() {
        Radio radio = new Radio();
        radio.turnUpVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void turnDownVolume() {
        Radio radio = new Radio();
        radio.turnDownVolume();
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    void shouldSwitchNextStation() {
        Radio radio = new Radio();
        radio.pressNextStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    void pressPreviewStation() {
        Radio radio = new Radio();
        radio.pressPreviewStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void switchStationByManually() {
        Radio radio = new Radio();
        assertEquals(7, radio.switchStationByManually(15));
    }
}