package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNextStation9() {//тест на следующую станцию с 9 на 0
        Radio radio = new Radio(); //создаем новый объект
        radio.setCurrentStation(9);//состояние объекта - 9 станция
        radio.nextStation();//метод
        int expected = 0;//ожидаемый результат
        int actual = radio.getCurrentStation();//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }

    @Test
    public void testNextStation5() {//тест на следующую станцию с 5 на 6
        Radio radio = new Radio(); //создаем новый объект
        radio.setCurrentStation(5);//состояние объекта - 9 станция
        radio.nextStation();//метод
        int expected = 6;//ожидаемый результат
        int actual = radio.getCurrentStation();//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }

    @Test
    public void testPrevStationZero() {//тест на станцию назад,с 0 на 9.
        Radio radio = new Radio(); //создаем новый объект
        radio.setCurrentStation(0);//состояние объекта - станция 0
        radio.prevStation();//метод
        int expected = 9;//ожидаемый результат
        int actual = radio.getCurrentStation();//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }

    @Test
    public void testPrevStation() {//тест на станцию назад
        Radio radio = new Radio(); //создаем новый объект
        radio.setCurrentStation(9);//состояние объекта - станция 7
        radio.prevStation();//метод
        int expected = 8;//ожидаемый результат
        int actual = radio.getCurrentStation();//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }

    @Test
    public void testIncreaseVolume5() {//тест на увеличение звука с 5 на 6
        Radio radio = new Radio();//создаем новый объект
        radio.setCurrentNumberVolume(5);//состояние объекта - 5-я громкость
        radio.increaseVolume();//метод
        int expected = 6;//ожидаемый результат
        int actual = radio.getCurrentNumberVolume();//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }

    @Test
    public void testIncreaseVolume10() {//тест на увеличение звука с 10 на 10
        Radio radio = new Radio();//создаем новый объект
        radio.setCurrentNumberVolume(10);//состояние объекта - 5-я громкость
        radio.increaseVolume();//метод
        int expected = 10;//ожидаемый результат
        int actual = radio.getCurrentNumberVolume();//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }

    @Test
    public void testDecreaseVolume() {//тест на уменьшение звука с 5 на 4
        Radio radio = new Radio();//создаем новый объект
        radio.setCurrentNumberVolume(5);//состояние объекта - 5-я громкость
        radio.decreaseVolume();//метод
        int expected = 4;//ожидаемый результат
        int actual = radio.getCurrentNumberVolume();//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }

    @Test
    public void testDecreaseVolume0() {//тест на уменьшение звука с 0 на 0
        Radio radio = new Radio();//создаем новый объект
        radio.setCurrentNumberVolume(0);//состояние объекта - 5-я громкость
        radio.decreaseVolume();//метод
        int expected = 0;//ожидаемый результат
        int actual = radio.getCurrentNumberVolume();//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }

    @Test
    public void testSetCurrentStation0() {//тест выбранную станцию,граничные значения (0)
        Radio radio = new Radio();//создаем новый объект
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);//проверяем утверждения

    }

    @Test
    public void testSetCurrentStation9() {//тест выбранную станцию,граничные значения (9)
        Radio radio = new Radio();//создаем новый объект
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }

    @Test
    public void testSetCurrentNumberVolume11() {//тест граничные значения звука(11)
        Radio radio = new Radio();//создаем новый объект
        radio.setCurrentNumberVolume(11);
        int expected = 0;
        int actual = radio.getCurrentNumberVolume();
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }

    @Test
    public void testsetCurrentNumberVolumeMinus1() {//тест граничные значения звука(-1)
        Radio radio = new Radio();//создаем новый объект
        radio.setCurrentNumberVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentNumberVolume();
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }
}
