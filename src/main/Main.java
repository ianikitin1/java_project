package main;

import main.lab_1.task_1.*;
import main.lab_1.task_2.Triangle;
import main.lab_1.task_3.Farmer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
/*
l1.t1
        Calculator calc = new Calculator();
        System.out.println("Введите первое число: ");
        calc.inputSetA();
        System.out.println("Введите второе число: ");
        calc.inputSetB();
        System.out.println("Остаток деления первого на второе: " + calc.getReminder(calc.getA(), calc.getB()));
        calc.setA(1);

l1.t2
        Triangle tria = new Triangle();
        System.out.println("Введите основание и высоту треугольника: ");
        tria.inputSetA();
        tria.inputSetH();
        System.out.println("Площадь треугольника = " + tria.getArea(tria.getA(), tria.getH()));

 */

        Farmer farmer = new Farmer();
        //farmer.countAnimals();
        System.out.println(farmer.countAnimalsLegs());

    }


}
