package com.dia.test2;

import com.dia.test2.components.Animal;
import com.dia.test2.components.Dog;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMain {

    public static void main(String arg[]) {

        Dog dog = new Dog();
        List<Dog> allDogs = new ArrayList<>();
        allDogs = dog.addDogsDetails();
        dog.listOutAllDogs(allDogs);
        dog.filterOutPuppies(allDogs);
    }
}
