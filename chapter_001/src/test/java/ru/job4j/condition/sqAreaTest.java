package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class sqAreaTest {
    @Test
    public void square(){
        double expected=1;
        double out=sqArea.square(4,1);
        Assert.assertEquals(expected,out,0.01);

    }
}
