package ru.netology.domain;

public class conditioner {
    private String name;
    private int maxTemperature = 35;
    private int minTemperature = 17;
    private int currentTemperature = 20;
    boolean on;

    public void increaseCurrentTemperature() {
            currentTemperature += 1;
    }

    public void decreaseCurrentTemperature() {
            currentTemperature -= 1;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

}
