package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        double out = Factorial.calc(5);
        Assert.assertEquals(120, out, 0.01);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        double out = Factorial.calc(0);
        Assert.assertEquals(1, out, 0.01);
    }
}