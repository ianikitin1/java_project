package main.lab_1.task_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
        Calculator calc = new Calculator();
        //Тесты к таску 1
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


        //Тесты к таску 5
        @Test
        public void testCheckOperation_1() {
                Assert.assertEquals("added", calc.checkOperation(24, 15, 9));
        }

        @Test
        public void testCheckOperation_2() {
                Assert.assertEquals("subtracted", calc.checkOperation(24, 26, 2));
        }

        @Test
        public void testCheckOperation_3() {
                Assert.assertEquals("multiply", calc.checkOperation(24, 6, 4));
        }

        @Test
        public void testCheckOperation_4() {
                Assert.assertEquals("divided", calc.checkOperation(24, 48, 2));
        }

        @Test
        public void testCheckOperation_5() {
                Assert.assertEquals("none", calc.checkOperation(15, 11, 11));
        }

        /*AssertionError
        @Test
        public void testCheckOperation_6() {
                Assert.assertEquals("divided", calc.checkOperation(24, 48, 15));
        }
        */



}
