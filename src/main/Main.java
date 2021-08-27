package main;



import main.lab_1.task_1.Calculator;
import main.lab_1.task_2.Triangle;
import main.lab_1.task_3.Farmer;
import main.lab_1.task_4.Casino;
import main.lab_1.task_6.Determinant;
import main.lab_2.task_1.Repeater;

import javax.print.DocFlavor;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

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


l1.t6
        Determinant determinant = new Determinant();
        System.out.println(String.valueOf(determinant.ctoa('A')));


l1.t7
        Calculator calculator = new Calculator();
        System.out.println(String.valueOf(calculator.addUpTo(3)));


l1.t8
        Triangle triangle = new Triangle();
        System.out.println(String.valueOf(triangle.nextEdge(8, 10)));


l1.t9
        Calculator calculator = new Calculator();
        do{
            System.out.print("Введите число: ");
            calculator.inputSetArray();
            System.out.print("Чтобы выйти введите \"stop\" или нажмите enter чтобы продолжить: ");
        }
        while(!Objects.equals(calculator.getInput().readLine(), "stop"));
        System.out.println("Вы ввели: " + calculator.getArray().toString());
        System.out.println("Сумма кубов введенных цифр: " + calculator.sumOfCubes(calculator.getArray()));


l1.t10
        Calculator calculator = new Calculator();
        System.out.println(calculator.abcmath(42,5, 10));
        System.out.println(calculator.abcmath(5,2, 1));
        System.out.println(calculator.abcmath(1,2, 3));


l2.t1
*/
        Repeater repeater = new Repeater();
        //System.out.println(repeater.repeat("tra-ta-ta", 4));
        System.out.println("Введите слово: ");
        repeater.setInputString();
        System.out.println("Сколько раз повторить буквы: ");
        repeater.setTimes();
        System.out.println(repeater.repeat(repeater.getInputString(), repeater.getTimes()));

    }

}
