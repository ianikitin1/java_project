package main.lab_1.task_4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
/*
profitableGamble(0.2, 50, 9) ➞ true

profitableGamble(0.9, 1, 2) ➞ false

profitableGamble(0.9, 3, 2) ➞ true

 */

public class CasinoTest {
    Casino casino = new Casino();
    @Test
    public void test1() {
        Assert.assertTrue(casino.profitableGamble(0.2, 50, 9));
    }
    @Test
    public void test2() {
        Assert.assertFalse(casino.profitableGamble(0.9, 1, 2));
    }
    @Test
    public void test3() {
        Assert.assertTrue(casino.profitableGamble(0.9, 3, 2));
    }
    /* - AssertionError:
    @Test
    public void test4() {
        Assert.assertTrue(casino.profitableGamble(0.9, 1, 2));
    }
    */
}