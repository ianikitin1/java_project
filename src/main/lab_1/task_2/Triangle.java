package main.lab_1.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {

    private int a;
    private int b;
    private int c;
    private int h;
    BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));

    public void setA(int a) { this.a = a; }
    public int getA() {
        return a;
    }

    public void setB(int b) { this.b = b; }
    public int getB() { return b; }

    public void setC(int c) { this.c = c; }
    public int getC() { return c; }

    public void setH(int h) { this.h = h; }
    public int getH() { return h; }

    public double getArea(int a, int h) {
        return (((double) a) * ((double) h) / 2);
    }

    //set методы с вводом значений пользователем
    public void inputSetA() {
        try {
            a = Integer.parseInt(input.readLine());
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

    public void inputSetC() {
        try {
            c = Integer.parseInt(input.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputSetH() {
        try {
            h = Integer.parseInt(input.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int nextEdge(int a, int b){
        return a + b - 1;
    }
}
