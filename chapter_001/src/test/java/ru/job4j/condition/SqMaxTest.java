package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void ThenFirstMax() {
        double out = SqMax.max(10,2,3,4);
        Assert.assertEquals(10, out, 0.01);
    }
    @Test
    public void ThenSecondMax() {
        double out = SqMax.max(8,12,11,4);
        Assert.assertEquals(12, out, 0.01);
    }
    @Test
    public void ThenThirdMax() {
        double out = SqMax.max(6,4,7,5);
        Assert.assertEquals(7, out, 0.01);
    }
    @Test
    public void ThenFourthMax() {
        double out = SqMax.max(1, 3, 11, 20);
        Assert.assertEquals(20, out, 0.01);
    }
}
