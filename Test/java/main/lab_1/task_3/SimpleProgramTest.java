package main.lab_1.task_3;

import static org.testng.Assert.*;

import java.io.*;

import org.junit.After;
import org.junit.Before;
import org.testng.*;
import org.testng.annotations.Test;
public class SimpleProgramTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }
    Farmer farmer = new Farmer();
    @Test
    public void test235() throws IOException {
        final String testString = "2\n3\n5\n";
        provideInput(testString);

        Assert.assertEquals(36, farmer.countAnimalsLegs());
    }
}