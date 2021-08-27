package main.lab_2.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repeater {

    private BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));

    private int times;
    public void setTimes(){
        try{
            times = Integer.parseInt(input.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getTimes() {
        return times;
    }


    private String inputString;
    public void setInputString() {
            try {
                 inputString = input.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    public String getInputString() {
        return inputString;
    }


    public String repeat(String inputString, int times){
        /* решение "в лоб":
        String outputString = "";
        for (char symbol : inputString.toCharArray()){
            for (int i=0; i<times; i++) {
                outputString += symbol;
            }
        }
        return outputString.toString();
        */
        StringBuilder outputString = new StringBuilder();
        for (char symbol : inputString.toCharArray()){
            outputString.append(String.valueOf(symbol).repeat(Math.max(0, times)));
        }
        return outputString.toString();
    }



}
