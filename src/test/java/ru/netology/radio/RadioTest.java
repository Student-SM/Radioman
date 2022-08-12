package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void SetVolumeLevel() {//выставляем уровень громкости
        Radio cond = new Radio();//создаем переменную и кладем туда новосозданный объект

        cond.soundVolume = 5;//тестируемое действие,выставляем уровень громкости на 5

        int expected = 5;//ожидаемый результат
        int actual = cond.soundVolume;// актуальный результат

        Assertions.assertEquals(expected,actual);

    }

    @Test

    public void SetNumberRadioStation() {

        Radio cond = new Radio();//создаем переменную и кладем туда новосозданный объект

        cond.currentWaveNumber = 5;//тестируемое действие,выставляем станцию номер 5

        int expected = 5;//ожидаемый результат
        int actual = cond.currentWaveNumber;// актуальный результат

        Assertions.assertEquals(expected,actual);


    }

}
