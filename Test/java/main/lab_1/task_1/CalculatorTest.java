package main.lab_1.task_1;

import org.junit.After;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

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
        //Тесты к таску 7
        @Test
        public void testAddToUpp_1(){
               Assert.assertEquals(6, calc.addUpTo(3));
        }
        @Test
        public void testAddToUpp_2(){
                Assert.assertEquals(55,  calc.addUpTo(10));
        }
        @Test
        public void testAddToUpp_3(){
                Assert.assertEquals(28, calc.addUpTo(7));
        }
        @Test
        public void testAddToUpp_4(){
                Assert.assertNotEquals(64.1, calc.addUpTo(90));
        }


        //Тесты к таску 9
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

        @Test
        public void testSumOfCube_1() throws IOException {
                final String testString = "1\n\n5\n\n9\nstop\n";
                provideInput(testString);
                Calculator calculator = new Calculator();
                do{
                        calculator.inputSetArray();
                }
                while(!Objects.equals(calculator.getInput().readLine(), "stop"));
                Assert.assertEquals(855, calculator.sumOfCubes(calculator.getArray()));
        }

        @Test
        public void testSumOfCube_2() throws IOException {
                final String testString = "3\n\n4\n\n5\nstop\n";
                provideInput(testString);
                Calculator calculator = new Calculator();
                do{
                        calculator.inputSetArray();
                }
                while(!Objects.equals(calculator.getInput().readLine(), "stop"));
                Assert.assertEquals(216, calculator.sumOfCubes(calculator.getArray()));
        }

        @Test
        public void testSumOfCube_3() throws IOException {
                final String testString = "2\nstop\n";
                provideInput(testString);
                Calculator calculator = new Calculator();
                do{
                        calculator.inputSetArray();
                }
                while(!Objects.equals(calculator.getInput().readLine(), "stop"));
                Assert.assertEquals(8, calculator.sumOfCubes(calculator.getArray()));
        }

        @Test
        public void testSumOfCube_4() throws IOException {
                final String testString = "0\nstop\n";
                provideInput(testString);
                Calculator calculator = new Calculator();
                do{
                        calculator.inputSetArray();
                }
                while(!Objects.equals(calculator.getInput().readLine(), "stop"));
                Assert.assertEquals(0, calculator.sumOfCubes(calculator.getArray()));
        }

        @Test
        public void testSumOfCube_5() throws IOException {
                final String testString = "18\n\n5\n\n199\nstop\n";
                provideInput(testString);
                Calculator calculator = new Calculator();
                do{
                        calculator.inputSetArray();
                }
                while(!Objects.equals(calculator.getInput().readLine(), "stop"));
                Assert.assertNotEquals(7886556.9, calculator.sumOfCubes(calculator.getArray()));
        }


        //Тесты к таску 10
        @Test
        public void testAbcMath_1(){
                Calculator calculator = new Calculator();
                Assert.assertFalse(calculator.abcmath(42,5, 10));
                Assert.assertTrue(calculator.abcmath(5,2, 1));
                Assert.assertFalse(calculator.abcmath(1,2, 3));
        }


}
