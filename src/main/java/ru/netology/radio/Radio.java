package ru.netology.radio;


public class Radio {


    protected int CurrentNumberVolume;
    protected int CurrentStation;
    protected int maxStation;
    protected int maxVolume;

    public Radio() {
        maxStation = 9;
        maxVolume = 100;
    }

    public Radio(int stationCont) {
        maxStation = stationCont - 1;
    }


    public int getCurrentNumberVolume() {
        return CurrentNumberVolume;
    }

    public int getCurrentStation() {
        return CurrentStation;
    }

    public void setCurrentNumberVolume(int CurrentNumberVolume) {
        if (CurrentNumberVolume > 100) {
            return;
        }
        if (CurrentNumberVolume < 0) {
            return;
        }
        this.CurrentNumberVolume = CurrentNumberVolume;

    }

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation > maxStation) {
            return;
        }
        if (CurrentStation < 0) {
            return;
        }
        this.CurrentStation = CurrentStation;
    }

    public void nextStation() {
        if (CurrentStation < maxStation) {
            CurrentStation = CurrentStation + 1;

        } else CurrentStation = 0;
    }


    public void prevStation() {
        if (CurrentStation < 1) {
            CurrentStation = maxStation;
        } else {
            CurrentStation = CurrentStation - 1;

        }

    }

    public void increaseVolume() {
        if (CurrentNumberVolume < 100) {
            CurrentNumberVolume = CurrentNumberVolume + 1;
        } else {
            CurrentNumberVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (CurrentNumberVolume > 0) {
            CurrentNumberVolume = CurrentNumberVolume - 1;
        } else {
            CurrentNumberVolume = 0;
        }
    }
}

