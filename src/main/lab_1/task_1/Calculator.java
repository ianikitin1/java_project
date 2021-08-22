package main.lab_1.task_1;

import java.io.*;

public class Calculator {

    private int a;
    private int b;
    private int c;
    BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));

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


}
