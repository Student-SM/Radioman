package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNextStation25() {//тест на следующую станцию с 25 на 26
        Radio radio = new Radio(50); //создаем новый объект
        radio.setCurrentStation(25);//состояние объекта - 25 станция
        radio.nextStation();//метод
        int expected = 26;//ожидаемый результат
        int actual = radio.getCurrentStation();//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }

    @Test
    public void testNextStation0() {//тест c минимальной на следующую(всего 49,ставим 0 на 1)
        Radio radio = new Radio(50); //создаем новый объект
        radio.setCurrentStation(0);//состояние объекта - 0 станция
        radio.nextStation();//метод
        int expected  = 1;//ожидаемый результат
        int actual = radio.getCurrentStation();//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }
    @Test
    public void testNextStationAfterMax() {//тест на станцию после максимальной(с 49-ой на 0-ю)
        Radio radio = new Radio(50); //создаем новый объект
        radio.setCurrentStation(49);//состояние объекта - 49 станция
        radio.nextStation();//метод
        int expected  = 0;//ожидаемый результат
        int actual = radio.getCurrentStation();//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }

    @Test
    public void testPrevStationZero() {//тест на станцию назад,с 0 на максимальную.
        Radio radio = new Radio(50); //создаем новый объект
        radio.setCurrentStation(0);//состояние объекта - станция 0
        radio.prevStation();//метод
        int expected = 49;//ожидаемый результат
        int actual = radio.getCurrentStation();//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }

    @Test
    public void testPrevStation() {//тест на станцию назад(с 9 на 8)
        Radio radio = new Radio(50); //создаем новый объект
        radio.setCurrentStation(9);//состояние объекта - станция 9
        radio.prevStation();//метод
        int expected = 8;//ожидаемый результат
        int actual = radio.getCurrentStation();//фактический результат
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }
    @Test
    public void testPrevStation0() {//тест с нуля на максимальную станция(0 на 49)
        Radio radio = new Radio(50); //создаем новый объект
        radio.setCurrentStation(0);//состояние объекта - станция 0
        radio.prevStation();//метод
        int expected = 49;//ожидаемый результат
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
    public void testSetCurrentStation50() {//тест выбранную станцию больше максимальной 50
        Radio radio = new Radio(50);//создаем новый объект
        radio.setCurrentStation(50);
        int expected =0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);//проверяем утверждения

    }
    @Test
    public void testSetCurrentStationMinusMin() {//тест выбранную станцию меньше минимальной
        Radio radio = new Radio(50);//создаем новый объект
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);//проверяем утверждения
    }

    @Test
    public void testSetCurrentStation9() {//тест выбранную любую станци.например 17-ю из 49-и
        Radio radio = new Radio(50);//создаем новый объект
        radio.setCurrentStation(17);
        int expected = 17;
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