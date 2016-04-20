package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by TheGiver on 19.04.2016.
 */
public class CalculatorTest {
    @Test
    /*
    * Проверка суммирования
    * */
    public void addTest() throws Exception {
        Calculator calc = new Calculator();
        calc.add(1,1);
        Assert.assertEquals(2, calc.getResult());

    }

    /*
    * Тест на вычитание
    * */
    @Test
    public void subTest() throws Exception {
        Calculator calc = new Calculator();
        calc.sub(-5,-5);
        Assert.assertEquals(0, calc.getResult());

    }
    /*
    * Тест на вычитание
    * */
    @Test
    public void multTest() throws Exception {
        Calculator calc = new Calculator();
        calc.mult(-5,-5);
        Assert.assertEquals(25, calc.getResult());

    }

}