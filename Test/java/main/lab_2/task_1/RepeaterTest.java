package main.lab_2.task_1;

import org.junit.After;
import org.junit.Test;
import org.testng.Assert;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.testng.Assert.*;

public class RepeaterTest {
    //имитация ввода с клавы
    private final InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;
    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
    }
/*
repeat("mice", 5) ➞ "mmmmmiiiiiccccceeeee"

repeat("hello", 3) ➞ "hhheeellllllooo"

repeat("stop", 1) ➞ "stop"
*/

    @Test
    public void repeatTest_1() throws IOException {
        final String testString = "mice\n5\n";
        provideInput(testString);
        Repeater repeater = new Repeater();
        repeater.setInputString();
        repeater.setTimes();
        Assert.assertEquals("mmmmmiiiiiccccceeeee", repeater.repeat(repeater.getInputString(),repeater.getTimes()));

    }

    @Test
    public void repeatTest_2() throws IOException {
        final String testString = "hello\n3\n";
        provideInput(testString);
        Repeater repeater = new Repeater();
        repeater.setInputString();
        repeater.setTimes();
        Assert.assertEquals("hhheeellllllooo", repeater.repeat(repeater.getInputString(),repeater.getTimes()));
    }

    @Test
    public void repeatTest_3() throws IOException {
        final String testString = "stop\n1\n";
        provideInput(testString);
        Repeater repeater = new Repeater();
        repeater.setInputString();
        repeater.setTimes();
        Assert.assertEquals("stop", repeater.repeat(repeater.getInputString(),repeater.getTimes()));
    }

    @Test
    public void repeatTest_4() throws IOException {
        final String testString = "stop\n1000\n";
        provideInput(testString);
        Repeater repeater = new Repeater();
        repeater.setInputString();
        repeater.setTimes();
        Assert.assertNotEquals("stop", repeater.repeat(repeater.getInputString(),repeater.getTimes()));
    }



}