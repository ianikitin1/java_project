package main.lab_1.task_3;

import org.junit.After;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;

import static org.testng.Assert.*;

public class FarmerTest {
    private final InputStream systemIn = System.in;
//    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;

/*
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }
*/

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }
/*
    private String getOutput() {
        return testOut.toString();
    }
*/

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        //System.setOut(systemOut);
    }

    @Test
    public void test235() throws IOException {
        final String testString = "2\n3\n5\n";
        provideInput(testString);
        Farmer farmer = new Farmer();
        Assert.assertEquals(36, farmer.countAnimalsLegs());
    }

    @Test
    public void test123() throws IOException {
        final String testString = "1\n2\n3\n";
        provideInput(testString);
        Farmer farmer = new Farmer();
        Assert.assertEquals(22, farmer.countAnimalsLegs());
    }

    @Test
    public void test528() throws IOException {
        final String testString = "5\n2\n8\n";
        provideInput(testString);
        Farmer farmer = new Farmer();
        Assert.assertEquals(50, farmer.countAnimalsLegs());
    }

    @Test
    public void testNotEq() throws IOException {
        final String testString = "2\n3\n5\n";
        provideInput(testString);
        Farmer farmer = new Farmer();
        Assert.assertNotEquals(50, farmer.countAnimalsLegs());
    }


}