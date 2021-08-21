package main.lab_1.task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Farmer {

    BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
    Animal chicken = new Chicken();
    Animal cow = new Cow();
    Animal pig = new Pig();

    ArrayList<Animal> listOfAnimal= new ArrayList();

    public void countAnimals() throws IOException {
        try {
            System.out.println("Фермер насчитал курей: ");
            chicken.setCount(Integer.parseInt(input.readLine()));
            listOfAnimal.add(chicken);

            System.out.println("Фермер насчитал коровок: ");
            cow.setCount(Integer.parseInt(input.readLine()));
            listOfAnimal.add(cow);

            System.out.println("Фермер насчитал свиняток: ");
            pig.setCount(Integer.parseInt(input.readLine()));
            listOfAnimal.add(pig);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int countAnimalsLegs() throws IOException {
        int totalLegs = 0;
        countAnimals();
        System.out.println("длина списка животинок: " + listOfAnimal.size());
        for (Animal animal : listOfAnimal) totalLegs += animal.getLegs() * animal.getCount();
        return totalLegs;
    }

}
