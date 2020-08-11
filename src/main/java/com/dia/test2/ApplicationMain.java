package com.dia.test2;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMain {

    public static void main(String arg[]) {
        Animal animal = new Animal();
        Dogs dogs = new Dogs();
        List<Dogs> allDogs = new ArrayList<>();
        allDogs = dogs.addDogsDetails();
        dogs.allDogs(allDogs);
        dogs.filterOutPuppies(allDogs);

    }
}
