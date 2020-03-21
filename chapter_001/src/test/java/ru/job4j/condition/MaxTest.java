package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void max2BiggerThenMax1() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void max1BiggerThenMax2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void max1EqualMax2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
    @Test
    public void maxFirst() {
        Max max= new Max();
        int result = max.max(3,2,1);
        assertThat(result, is(3));
    }
    @Test
    public void maxSecond() {
        Max max= new Max();
        int result = max.max(3,4,1);
        assertThat(result, is(4));
    }
    @Test
    public void maxThird() {
        Max max= new Max();
        int result = max.max(3,4,5);
        assertThat(result, is(5));
    }
    @Test
    public void max4() {
        Max max= new Max();
        int result = max.max(5,4,5,7);
        assertThat(result, is(7));
    }
    @Test
    public void max1() {
        Max max= new Max();
        int result = max.max(5,4,3,2);
        assertThat(result, is(5));
    }
    @Test
    public void max2() {
        Max max= new Max();
        int result = max.max(1,5,4,2);
        assertThat(result, is(5));
    }
    @Test
    public void max3() {
        Max max= new Max();
        int result = max.max(1,2,3,2);
        assertThat(result, is(3));
    }

    @Test
    public void max3EqualMax4() {
        Max max= new Max();
        int result = max.max(1,2,3,3);
        assertThat(result, is(3));
    }
}
