package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void SetRadioStationNumber() {//клиент сам выставляет номер станции
        Radio cond = new Radio();//состояние радио = новому состоянию
        cond.setCurrentNumberRadioStation(7);//тестируем состояние при станции №7
        int expected = 7;//ожидаемый результат
        int actual = cond.currentNumberRadioStation;//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем предположение
    }

    @Test
    public void NumberStationPlus() {//номер станции увеличиваем на один
        Radio cond = new Radio();//состояние радио = новому состоянию
        cond.setCurrentNumberRadioStation(2);//тестируем состояние при станции №2
        cond.nextNumberStation();//используем метод nextNumberStation (Radio.java)
        int expected = 3;//ожидаемый результат
        int actual = cond.currentNumberRadioStation;//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем предположение
    }

    @Test
    public void NumberStationMinus() {//номер станции уменьшаем на один
        Radio cond = new Radio();//состояние радио = новому состоянию
        cond.setCurrentNumberRadioStation(3);//тестируем состояние при станции №3
        cond.prevNumberStation();//используем метод prevNumberStation (Radio.java)
        int expected = 2;//ожидаемый результат
        int actual = cond.currentNumberRadioStation;//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем предположение
    }

    @Test
    public void NumberStationAboveParameter() {// номер станции выше параметра
        Radio cond = new Radio();//состояние радио = новому состоянию
        cond.setCurrentNumberRadioStation(15);//тестируем состояние при станции №15
        int expected = 0;//ожидаемый результат
        int actual = cond.currentNumberRadioStation;//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем предположение
    }

    @Test
    public void NumberStationBelowParameter() {// номер станции ниже параметра
        Radio cond = new Radio();//состояние радио = новому состоянию
        cond.setCurrentNumberRadioStation(-3);//тестируем состояние при станции №-3
        int expected = 0;//ожидаемый результат
        int actual = cond.currentNumberRadioStation;//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем предположение
    }
}