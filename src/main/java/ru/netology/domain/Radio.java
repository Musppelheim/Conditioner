package ru.netology.domain;

public class Radio {
    private int currentVolume = 8;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentRadioStation = 7;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;

    public void turnUpVolume() {
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume += 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume -= 1;
        }
    }

    public void pressNextStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = 0;
        } else {
            currentRadioStation +=1;
        }
    }

    public void pressPreviewStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = 9;
        } else {
            currentRadioStation -=1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int switchStationByManually(int inputStation) {
        if (inputStation <=9) if (inputStation >= 0) {
            currentRadioStation = inputStation;
        }
        return currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
}
