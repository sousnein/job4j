package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public  void distance() {
        Point pt1 = new Point(5,3);
        Point pt2 = new Point(2,7);
        double expected = 5;
        double out = pt1.distance(pt2);
        Assert.assertEquals(expected,out,0.01);
    }

}
