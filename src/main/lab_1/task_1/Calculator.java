package main.lab_1.task_1;

import java.io.*;
import java.util.ArrayList;

public class Calculator {

    private int a;
    private int b;
    private int c;
    private BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));

    private ArrayList<Integer> array = new ArrayList<Integer>();

    public void setA(int a) { this.a = a; }
    public int getA() {
        return a;
    }

    public void setB(int b) { this.b = b; }
    public int getB() { return b; }

    public void setC(int c) { this.c = c; }
    public int getC() {
        return c;
    }

    public void setArray(ArrayList<Integer> array) { this.array = array; }
    public ArrayList<Integer> getArray() {
        return array;
    }

    public void setInput(BufferedReader input) { this.input = input; }
    public BufferedReader getInput() {
        return input;
    }

    //set методы с вводом значений пользователем
    public void inputSetC() {
        try {
            c = Integer.parseInt(input.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputSetB() {
        try {
            b = Integer.parseInt(input.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputSetA() {
        try {
            a = Integer.parseInt(input.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void inputSetArray() {
        try {
            String number = input.readLine();
            array.add(Integer.parseInt(number));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getReminder(int a, int b) {
        return a % b;
    }

    public String checkOperation(int n, int a, int b){
        if(n == a + b) {
            return "added";
        }
        else if (n == a - b) {
            return "subtracted";
        }
        else if (n == a * b) {
            return "multiply";
        }
        else if (n == a / b) {
            return "divided";
        }
        else {
            return "none";
        }
    }

    public double addUpTo(int a) {
        return (1 + a) * a / 2.0;
    }

    public double sumOfCubes(ArrayList<Integer> array){
        double cubes = 0;
        for (Integer integer : array) {
            cubes += Math.pow(Double.valueOf(integer), 3);
        }
        return cubes;
    }

    public boolean abcmath(int a, int b, int c){
        boolean divide = false;
        for(int i=0; i<b; i++) {
            a+=a;
        }
        if(a % c == 0)
            divide = true;
        return divide;
    }


}
