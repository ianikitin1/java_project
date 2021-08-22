package main.lab_1.task_6;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
/*
ctoa('A') ➞ 65
ctoa('m') ➞ 109
ctoa('[') ➞ 91
ctoa('\') ➞ 92
*/


public class DeterminantTest {
    Determinant determinant = new Determinant();

    @Test
    public void testCtoa_1() {
        Assert.assertEquals(65, determinant.ctoa('A'));
    }
    @Test
    public void testCtoa_2() {
        Assert.assertEquals(109, determinant.ctoa('m'));
    }
    @Test
    public void testCtoa_3() {
        Assert.assertEquals(91, determinant.ctoa('['));
    }
    @Test
    public void testCtoa_4() {
        Assert.assertEquals(92, determinant.ctoa('\\'));
    }


}