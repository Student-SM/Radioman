package ru.netology.radio;

public class Radio {


    protected int CurrentNumberVolume;
    protected int CurrentStation;


    public int getCurrentNumberVolume() {
        return CurrentNumberVolume;
    }

    public int getCurrentStation() {
        return CurrentStation;
    }

    public void setCurrentNumberVolume(int CurrentNumberVolume) {
        if (CurrentNumberVolume > 10) {
            return;
        }
        if (CurrentNumberVolume < 0) {
            return;
        }
        this.CurrentNumberVolume = CurrentNumberVolume;

    }

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation > 9) {
            return;
        }
        if (CurrentStation < 0) {
            return;
        }
        this.CurrentStation = CurrentStation;
    }

    public void nextStation() {
        if (CurrentStation < 9) {
            CurrentStation = CurrentStation + 1;
        } else CurrentStation = 0;
    }

    public void prevStation() {
        if (CurrentStation < 1) {
            CurrentStation = 9;
        } else {
            CurrentStation = CurrentStation - 1;

        }

    }

    public void increaseVolume() {
        if (CurrentNumberVolume < 10) {
            CurrentNumberVolume = CurrentNumberVolume + 1;
        } else {
            CurrentNumberVolume = 10;
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
