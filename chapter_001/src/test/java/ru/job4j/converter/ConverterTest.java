package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 300;
        int expected = 5;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void euroToRouble() {
        int in = 3;
        int expected = 210;
        int out = Converter.euroToRouble(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void dollarToRouble() {
        int in = 10;
        int expected = 600;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }
}
