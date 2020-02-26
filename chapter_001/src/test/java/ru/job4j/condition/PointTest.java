package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public  void distance() {
        double x1 = 0, y1 = 0, x2 = 2, y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

}
