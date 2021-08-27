package main.lab_2.task_1;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.testng.Assert.*;

public class RepeaterTest {
    private Logger logger;
    private static final Logger log = Logger.getLogger(RepeaterTest.class);

    //имитация ввода с клавы
    private final InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;
    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @BeforeTest
    public void setUp() {
        logger = Logger.getLogger("new logger");
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
    }


    @Rule
    public TestWatcher testWatcher = new TestWatcher() {
        protected void failed(Throwable e, Description description) {
            //System.out.println("" + description.getDisplayName() + " failed " + e.getMessage());
            log.error("" + description.getDisplayName() + " failed " + e.getMessage());
            super.failed(e, description);
        }
    };


    @Test
    public void repeatTest_1() throws IOException {
        final String testString = "mice\n15\n";
        provideInput(testString);
        Repeater repeater = new Repeater();
        repeater.setInputString();
        repeater.setTimes();
        //log.info(repeater.repeat(repeater.getInputString(),repeater.getTimes()));
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