package ru.netology.radio;

public class Radio {
    public int currentNumberRadioStation;// поле номер станции
    public int maxNumberRadioStation = 9;// поле максимального номера станции
    public int minNumberRadioStation = 0;//поле минимального номера станции

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
    public int currentNumberVolume;// поле номера громкости
    public int maxNumberVolume = 10;// поле максимального номера громкости
    public int minNumberVolume = 0;//поле минимального номера громкости

    public void setCurrentNumberVolume(int newCurrentNumberVolume ) {
        if (newCurrentNumberVolume < minNumberVolume) {
            return;
        }
        if (newCurrentNumberVolume > maxNumberVolume) {
            return;
        }
        currentNumberVolume = newCurrentNumberVolume;
    }
}