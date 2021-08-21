import java.io.*;
import lab_1.task_1.*;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Введите первое число: ");
        calc.setA();
        System.out.println("Введите второе число: ");
        calc.setB();
        System.out.println("Остаток деления первого на второе: " + calc.getReminder(calc.getA(), calc.getB()));
        
    }
}
