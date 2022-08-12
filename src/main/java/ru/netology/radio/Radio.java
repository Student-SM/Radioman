package ru.netology.radio;

public class Radio {
    public int currentNumberRadioStation;
    public int maxNumberRadioStation = 9;
    public int minNumberRadioStation = 0;

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation < minNumberRadioStation) {
            return;
        }
        if (newCurrentNumberRadioStation > maxNumberRadioStation) {
            return;
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }

    public void nextNumberStation() {
        if (currentNumberRadioStation >= maxNumberRadioStation) {
            setCurrentNumberRadioStation(minNumberRadioStation);
        } else {
            setCurrentNumberRadioStation(currentNumberRadioStation + 1);
        }
    }

    public void prevNumberStation() {
        if (currentNumberRadioStation <= minNumberRadioStation) {
            setCurrentNumberRadioStation(maxNumberRadioStation);
        } else {
            setCurrentNumberRadioStation(currentNumberRadioStation - 1);
        }
    }
}