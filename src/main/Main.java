package main;

import main.lab_1.task_1.*;

public class Main {

    public static void main(String[] args) {
        /*
        lab1.task1
        remainder(1, 3) ➞ 1
        remainder(3, 4) ➞ 3
        remainder(-9, 45) ➞ -9
        remainder(5, 5) ➞ 0
         */
        Calculator calc = new Calculator();
        System.out.println("Введите первое число: ");
        calc.inputSetA();
        System.out.println("Введите второе число: ");
        calc.inputSetB();
        System.out.println("Остаток деления первого на второе: " + calc.getReminder(calc.getA(), calc.getB()));
        calc.setA(1);

    }
}
