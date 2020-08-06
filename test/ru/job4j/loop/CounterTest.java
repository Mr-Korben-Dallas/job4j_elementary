package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromToOneToTenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumNumbersFromThreeToEight() {
        int rsl = Counter.sum(3, 8);
        int expected = 36;
        assertThat(rsl, is(expected));
    }
}