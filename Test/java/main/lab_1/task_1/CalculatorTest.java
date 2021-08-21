package main.lab_1.task_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
        Calculator calc = new Calculator();
        @Test
        public void checkReminder1(){
                Assert.assertEquals(1, calc.getReminder(1, 3));
        }

        @Test
        public void checkReminder2(){
                Assert.assertEquals(3, calc.getReminder(3, 4));
        }

        @Test
        public void checkReminder3(){
                Assert.assertEquals(-9, calc.getReminder(-9, 45));
        }

        @Test
        public void checkReminder4(){
                Assert.assertEquals(0, calc.getReminder(5, 5));
        }

        @Test
        public void checkRem5() {
                Assert.assertNotEquals(5, calc.getReminder(5, 3));
        }

}
