package lab_1.task_1;

import java.io.*;

public class Calculator {

    private int a;
    private int b;
    private int c;
    BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));

    public void setA() {
        try {
            a = Integer.parseInt(input.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getA() {
        return a;
    }

    public void setB() {
        try {
            b = Integer.parseInt(input.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getB() {
        return b;
    }

    public void setC() {
        try {
            c = Integer.parseInt(input.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getC() {
        return c;
    }


    public int getReminder(int a, int b) {
        return a % b;
    }


}
