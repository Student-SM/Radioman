package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void SetRadioStationNumber() {//клиент сам выставляет номер станции
        Radio cond = new Radio();//состояние радио = новому состоянию
        cond.setCurrentNumberRadioStation(8);//тестируем состояние при станции №7
        int expected = 8;//ожидаемый результат
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
    public void NumberStationPlusOver() {//номер станции 9 увеличиваем на один(граничные значения)
        Radio cond = new Radio();//состояние радио = новому состоянию
        cond.setCurrentNumberRadioStation(9);//тестируем состояние при станции №9
        cond.nextNumberStation();//используем метод nextNumberStation (Radio.java)
        int expected = 0;//ожидаемый результат
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
    public void NumberStationMinusDown() {//номер станции уменьшаем на один(крайнее значение)
        Radio cond = new Radio();//состояние радио = новому состоянию
        cond.setCurrentNumberRadioStation(0);//тестируем состояние при станции №0
        cond.prevNumberStation();//используем метод prevNumberStation (Radio.java)
        int expected = 9;//ожидаемый результат
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

    @Test
    public void SetNumberVolume() {//клиент сам выставляет уровень громкости
        Radio cond = new Radio();//состояние радио = новому состоянию
        cond.setCurrentNumberVolume(7);//тестируем состояние уровня звука №7
        int expected = 7;//ожидаемый результат
        int actual = cond.currentNumberVolume;//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем предположение
    }
    @Test
    public void SetVolumeOver10() {//громкость больше 10
        Radio cond = new Radio();//состояние радио = новому состоянию
        cond.setCurrentNumberVolume(11);//тестируем состояние уровня звука №11
        int expected = 0;//ожидаемый результат
        int actual = cond.currentNumberVolume;//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем предположение
    }
    @Test
    public void VolumeDown0 () { //громкость меньше 0
        Radio cond = new Radio();//состояние радио = новому состоянию
        cond.setCurrentNumberVolume(-3);//тестируем состояние уровня звука №-3
        int expected = 0;//ожидаемый результат
        int actual = cond.currentNumberVolume;//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем предположение

    }

    @Test
    public void SetNumberVolumePlus() {//увеличение громкости на один
        Radio cond = new Radio();//состояние радио = новому состоянию
        cond.setCurrentNumberVolume(2);//тестируем состояние уровня звука №2
        cond.increaseVolume();//используем метод increaseVolume (Radio.java)
        int expected = 3;//ожидаемый результат
        int actual = cond.currentNumberVolume;//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем предположение
    }

    @Test
    public void SetNumberVolumeMinus() {//уменьшение громкости на один
        Radio cond = new Radio();//состояние радио = новому состоянию
        cond.setCurrentNumberVolume(10);//тестируем состояние уровня звука №10
        cond.decreaseVolume();//используем метод decreaseVolume (Radio.java)
        int expected = 9;//ожидаемый результат
        int actual = cond.currentNumberVolume;//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем предположение
    }
}