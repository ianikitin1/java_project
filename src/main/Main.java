package main;

import javafx.css.converter.DeriveColorConverter;
import main.lab_1.task_1.*;
import main.lab_1.task_2.Triangle;
import main.lab_1.task_3.Farmer;
import main.lab_1.task_4.Casino;
import main.lab_1.task_6.Determinant;

import java.io.IOException;
import java.io.StringReader;

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


l1.t3
        Farmer farmer = new Farmer();
        //farmer.countAnimals();
        System.out.println(farmer.countAnimalsLegs());

l1.t4
        Casino casino = new Casino();
        System.out.println(String.valueOf(casino.profitableGamble(0.2, 50, 9)));


l1.t5
        Calculator calculator = new Calculator();
        System.out.println(calculator.checkOperation(24, 15, 9));
        System.out.println(calculator.checkOperation(24, 26, 2));
        System.out.println(calculator.checkOperation(15, 11, 11));



        Determinant determinant = new Determinant();
        System.out.println(String.valueOf(determinant.ctoa('A')));



        Calculator calculator = new Calculator();
        System.out.println(String.valueOf(calculator.addUpTo(3)));


*/
        Triangle triangle = new Triangle();
        System.out.println(String.valueOf(triangle.nextEdge(8, 10)));

    }
}
